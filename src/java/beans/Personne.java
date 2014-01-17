package beans;

import tools.ConnectBDD;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.sql.SQLException;

@ManagedBean
@RequestScoped
public class Personne implements Serializable {

    private String nom;
    private String prenom;
    private Titres titre;
    private Coordonnees coordonnees;

    public String getNom() {
        return this.nom;
    }

    /**
     *
     * @param Nom
     */
    public void setNom(int Nom) {
        throw new UnsupportedOperationException();
    }

    public String getPrenom() {
        return this.prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(int prenom) {
        throw new UnsupportedOperationException();
    }

    public Titres getTitre() {
        return this.titre;
    }

    /**
     *
     * @param Titre
     */
    public void setTitre(Titres Titre) {
        this.titre = Titre;
    }

    public Coordonnees getCoordonnees() {
        return this.coordonnees;
    }

    /**
     *
     * @param coordonnees
     */
    public void setCoordonnees(Coordonnees coordonnees) {
        this.coordonnees = coordonnees;
    }

    public void savePersonne() {
        String nom = getNom();
        String prenom = getPrenom();
        Titres titre = getTitre();
        Coordonnees Coo = getCoordonnees();

        ConnectBDD b = new ConnectBDD();

        try {

            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate("INSERT INTO projetannuel.PERSONNE(Titre,Nom_Personne,Prenom_Personne) VALUES (" + titre + "," + nom + "," + prenom + "," + Coo + ")");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

}
