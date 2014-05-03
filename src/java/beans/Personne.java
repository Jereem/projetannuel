package beans;

import tools.ConnectBDD;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.*;

@ManagedBean
@RequestScoped

public class Personne implements Serializable {

    protected static enum Titres {

        M, Mme, Mlle, Dr, Me, Pr;

        public String getNomTitre() {
            return toString();
        }
    }
    protected Titres[] titres = Titres.values();
    @NotNull ( message = "Veuillez saisir un nom" )
    @Size( max = 30, message = "Le nom ne peut pas dépasser 30 caractères." )
    protected String nom;
    @NotNull ( message = "Veuillez saisir un prénom" )
    @Size( max = 30, message = "Le prénom ne peut pas dépasser 30 caractères." )
    protected String prenom;
    @NotNull (message = "Veuillez séléctionner un titre")
    protected Titres titre;
    protected Coordonnees coordonnees;

    public Titres[] getTitres() { return titres; }
    
    public String getTitresString() { return titres.toString(); }

    public void setTitres(String pTitres) {
        switch (pTitres) {
            case "M":
                this.titre = Titres.M;
                break;
            case "Mme":
                this.titre = Titres.Mme;
                break;
            case "Mlle":
                this.titre = Titres.Mlle;
                break;
            case "Dr":
                this.titre = Titres.Dr;
                break;
            case "Me":
                this.titre = Titres.Me;
                break;
            case "Pr":
                this.titre = Titres.Pr;
                break;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Titres getTitre() {
        return titre;
    }

    public void setTitre(Titres titre) {
        this.titre = titre;
    }

    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

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
