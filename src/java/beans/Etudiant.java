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
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.*;
import tools.ConnectBDD;

@ManagedBean
@ViewScoped

public class Etudiant extends Personne implements Serializable {

    private ArrayList<Integer> anneesAdherant;
    @NotNull ( message = "Veuillez saisir un numéro à 13 chiffres" )
    @Digits (integer = 13, fraction = 1, message = "Veuillez saisir un numéro à 13 chiffres")
    private long numeroSS;
    private ArrayList<Competences> listeCompetences;
    @NotNull ( message = "Veuillez saisir une date de naissance" )
    @Pattern(regexp = "^(\\d\\d)\\/(\\d\\d)\\/(\\d\\d)$", message = "Merci de saisir une date valide (jj/mm/aa)")
    private Date dateNaissance;
    private boolean AJourCotisation;
    @NotNull ( message = "Veuillez saisir une année de promotion" )
    @Min(2013)
    @Max(2099)
    private int promotion;

    //Getter and Setter
    public ArrayList<Integer> getAnneesAdherant() {
        return anneesAdherant;
    }

    public void setAnneesAdherant(ArrayList<Integer> anneesAdherant) {
        this.anneesAdherant = anneesAdherant;
    }

    public long getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(long numeroSS) {
        this.numeroSS = numeroSS;
    }


    public ArrayList<Competences> getListeCompetences() {
        return listeCompetences;
    }

    public void setListeCompetences(ArrayList<Competences> listeCompetences) {
        this.listeCompetences = listeCompetences;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isAJourCotisation() {
        return AJourCotisation;
    }

    public void setAJourCotisation(boolean AJourCotisation) {
        this.AJourCotisation = AJourCotisation;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
    
    // Methodes
    
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

    // Methodes pour sauvegarder dans la BDD
    public String saveNewAdherent() throws SQLException {
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
            long paramNumeroSS = this.getNumeroSS();
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
        List<BureauProGphy> list = new ArrayList<>();
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
