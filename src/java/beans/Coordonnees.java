package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.*;

@ManagedBean
@ViewScoped

public class Coordonnees implements Serializable {

    protected enum Voies implements Serializable {

        Rue, Boulevard, LieuDit, Avenue, Allee, Impasse, Quai;

        public String getNomVoie() {
            return toString();
        }
    }

    protected final Voies[] voies = Voies.values();

    private String rue;
    private Voies typeVoie;
    @Size( min = 5, max = 5, message = "Le code postal doit contenir 3 caractères" )
    private int codePostal;
    private String ville;
    private String pays;
    @Pattern(regexp = "[0-9]+", message = "Veuillez saisir un chiffre")
    private int numRue;
    private String eMail;
    private int telPortable;
    private int telFixe;

    //Getter and Setter
    public Voies[] getVoies() { return voies; }
    
    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Voies getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(Voies typeVoie) {
        this.typeVoie = typeVoie;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(int telPortable) {
        this.telPortable = telPortable;
    }

    public int getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(int telFixe) {
        this.telFixe = telFixe;
    }

    

}
