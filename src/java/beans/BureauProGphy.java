package beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean
@RequestScoped

public class BureauProGphy extends Etudiant implements Serializable {

    // Attributs
    private Poste poste;
    private ArrayList<Integer> anneesMembre;
    private String identifiant;
    private String mdp;
    private boolean actif;

    // Getter et Setter
    public Poste getPoste() {
        return this.poste;
    }

    /**
     *
     * @param poste
     */
    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public ArrayList<Integer> getAnneesMembre() {
        return this.anneesMembre;
    }

    /**
     *
     * @param anneesMembre
     */
    public void setAnneesMembre(ArrayList<Integer> anneesMembre) {
        this.anneesMembre = anneesMembre;
    }

    /**
     *
     * @param annee
     */
    public void addAnneeMembre(Integer annee) {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param annee
     */
    public void delAnneeMembre(Integer annee) {
        throw new UnsupportedOperationException();
    }

    public String getIdentifiant() {
        return this.identifiant;
    }

    /**
     *
     * @param identifiant
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return this.mdp;
    }

    /**
     *
     * @param mdp
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean getActif() {
        return this.actif;
    }

    /**
     *
     * @param actif
     */
    public void setActif(boolean actif) {
        this.actif = actif;
    }

        // Methodes pour la BDD
    public void saveBureauProGphy() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramIdentifiant = this.getIdentifiant();
            String paramMotDePasse = this.getMdp();
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate("INSERT INTO projetannuel.membre_bureau(Identifiant, Mot_de_passe) VALUES (" + paramIdentifiant + "," + paramMotDePasse + ")");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
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
