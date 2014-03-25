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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import tools.ConnectBDD;

@ManagedBean
@RequestScoped

public class BureauProGphy extends Etudiant implements Serializable {

    // Attributs
    private Poste poste;
    private ArrayList<Integer> anneesMembre;
    @NotNull
    @Size( min = 1, max = 13, message = "L'identifiant doit contenir au moins 13 caractères" )
    private String identifiant;
    @NotNull
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
    
       /**
 *
 * @author Jeremy Gillet
     * @return String
 */
    public String bool2String() {
        
        Boolean x=this.getActif();
        
        if (x == true) {
            return "Oui";
        } else if (x == false) {
            return "Non";
        } else {
            return null;
        }

    }
    

    // Methodes pour la BDD
    public String saveBureauProGphy() throws SQLException {
        ConnectBDD con = new ConnectBDD();
        Connection b = con.getMyConnexion();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramIdentifiant = this.getIdentifiant();
            String paramMotDePasse = this.getMdp();
            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement ps = b.prepareStatement("INSERT INTO projetannuel.MEMBRE_BUREAU(Identifiant, Mot_de_passe) VALUES (?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setString(1, paramIdentifiant);
            ps.setString(2, paramMotDePasse);
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

    public List<BureauProGphy> getBureauProGphy() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU");
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
        //methode surchargée qui prend en paramètre un boolean actif
      public List<BureauProGphy> getBureauProGphy(Boolean actif) throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        if (actif==true)
        {
         ps= con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=1");
        }
        else
        {
         ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=0");
        }
        /*actif=false*/    
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
