package beans;

import java.util.ArrayList;
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

public class Projet implements Serializable{

	private Client client;
	private ArrayList<Etudiant> devellopeurs;
	private String nomProjet;
	private ArrayList<Documents> documents;
	private ArrayList<BureauProGphy> membresDuBureau;

	public Projet() {
		this.nomProjet = "New project";
	}

	public Client getClient() {
		return this.client;
	}

	/**
	 * 
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Etudiant> getDevellopeurs() {
		return this.devellopeurs;
	}

	/**
	 * 
	 * @param devellopeurs
	 */
	public void setDevellopeurs(ArrayList<Etudiant> devellopeurs) {
		this.devellopeurs = devellopeurs;
	}

	public String getNomProjet() {
		return this.nomProjet;
	}

	/**
	 * 
	 * @param nomProjet
	 */
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void addEtudiant(Etudiant etudiant) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void delEtudiant(Etudiant etudiant) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Documents> getDocuments() {
		return this.documents;
	}

	/**
	 * 
	 * @param documents
	 */
	public void setDocuments(ArrayList<Documents> documents) {
		this.documents = documents;
	}

	/**
	 * 
	 * @param document
	 */
	public void addDocument(Documents document) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param document
	 */
	public void delDocument(Documents document) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<BureauProGphy> getMembresDuBureau() {
		return this.membresDuBureau;
	}

	/**
	 * 
	 * @param membresDuBureau
	 */
	public void setMembresDuBureau(ArrayList<BureauProGphy> membresDuBureau) {
		this.membresDuBureau = membresDuBureau;
	}

        // Methodes pour la BDD
    public String saveProjet() throws SQLException {
        ConnectBDD con = new ConnectBDD();
        Connection b = con.getMyConnexion();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNomProjet = this.getNomProjet();
            long paramClient = this.getClient().getSiren();
            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement ps = b.prepareStatement("INSERT INTO projetannuel.PROJET(Nom_Projet, Siret) VALUES (?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setString(1, paramNomProjet);
            ps.setLong(2, paramClient);
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }

    }

    public List<Projet> getProjet() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select Nom_Projet, Societe, Siret, Qualite, Titre, Nom_Personne, Prenom_Personne from Projet natural join client natural join Personne");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Projet> list = new ArrayList<>();
        while (result.next()) {
            Projet projet = new Projet();
            Client clientp = new Client();
            projet.setNomProjet(result.getString("Nom_Projet"));
            clientp.setNom(result.getString("Nom_Personne"));
            clientp.setPrenom(result.getString("Prenom_Personne"));
            clientp.setTitres(result.getString("Titre"));
            clientp.setSiren(result.getLong("Siret"));
            clientp.setSociete(result.getString("Societe"));
            projet.setClient(clientp);
            //store all data into a List
            list.add(projet);
        }
        return list;
    }
//        //methode surchargée qui prend en paramètre un boolean actif
//      public List<BureauProGphy> getProjet(Boolean actif) throws SQLException {
//        //get database connection
//        ConnectBDD b = new ConnectBDD();
//        Connection con = b.getMyConnexion();
//        if (con == null) {
//            throw new SQLException("Can't get database connection");
//        }
//        PreparedStatement ps;
//        if (actif==true)
//        {
//         ps= con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=1");
//        }
//        else
//        {
//         ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=0");
//        }
//        /*actif=false*/    
//        //get customer data from database
//        ResultSet result = ps.executeQuery();
//        List<BureauProGphy> list = new ArrayList<>();
//        while (result.next()) {
//            BureauProGphy membre = new BureauProGphy();
//            membre.setIdentifiant(result.getString("Identifiant"));
//            membre.setMdp(result.getString("Mot_de_passe"));
//            //membre.setPoste(result.getString("Poste"));
//            membre.setActif(result.getBoolean("Actif"));
//            //store all data into a List
//            list.add(membre);
//        }
//        return list;
//    }
}