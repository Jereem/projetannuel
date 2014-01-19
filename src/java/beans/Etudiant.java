package beans;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean
@RequestScoped

public class Etudiant extends Personne implements Serializable{

	
	private ArrayList<Integer> anneesAdherant;
	private int numeroSS;
	private ArrayList<Competences> listeCompetences;
	private Date dateNaissance;
	private boolean AJourCotisation;
        private int promotion;

	public int getAnneeEtude() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param anneeEtude
	 */
	public void setAnneeEtude(int anneeEtude) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Integer> getAnneesAdherant() {
		return this.anneesAdherant;
	}

	/**
	 * 
	 * @param anneesAdherant
	 */
	public void setAnneesAdherant(ArrayList<Integer> anneesAdherant) {
		this.anneesAdherant = anneesAdherant;
	}

	/**
	 * 
	 * @param annee
	 */
	public void addAnneeAdherent(int annee) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param annee
	 */
	public void delAnneeAdherent(int annee) {
		throw new UnsupportedOperationException();
	}

	public int getNumeroSS() {
		return this.numeroSS;
	}

	/**
	 * 
	 * @param NumeroSS
	 */
	public void setNumeroSS(int NumeroSS) {
		this.numeroSS = NumeroSS;
	}

	public ArrayList<Competences> getListeCompetences() {
		return this.listeCompetences;
	}

	/**
	 * 
	 * @param listeCompetences
	 */
	public void setListeCompetences(ArrayList<Competences> listeCompetences) {
		this.listeCompetences = listeCompetences;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	/**
	 * 
	 * @param dateNaissance
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean getAJourCotisation() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AJourCotisation
	 */
	public void setAJourCotisation(boolean AJourCotisation) {
		throw new UnsupportedOperationException();
	}
        
            // Methodes pour la BDD
    public String saveEtudiant() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = this.getTitre().toString();
            String paramNom = this.getNom();
            String paramPrenom = this.getPrenom();
            //String paramCoordonnees = this.getCoordonnees().toString();
            int paramNumeroSS = this.getNumeroSS();
            //Date paramdateNaissance = this.getDateNaissance();
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate("INSERT INTO projetannuel.personne(Titre, Nom_Personne, Prenom_Personne, Numero_SS) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + "," + paramNumeroSS + ")");
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
        }
        return "success";
    }

      public List<BureauProGphy> getBureauProGphy() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from membre_bureau");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<BureauProGphy> list = new ArrayList<BureauProGphy>();
        while (result.next()) {
            BureauProGphy membre = new BureauProGphy();
            membre.setIdentifiant(result.getString("Identifiant"));
            membre.setMdp(result.getString("Mot_de_passe"));
            //membre.setPoste(result.getString("Poste"));
            membre.setActif(result.getBoolean("Actif"));
            //store all data into a List
            list.add(membre);
        }
        return list;
    }

}