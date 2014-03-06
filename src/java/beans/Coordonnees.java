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

    protected static final Voies[] voies = Voies.values();

    @NotNull ( message = "Veuillez saisir un nom de rue" )
    private static String rue;
    private static Voies typeVoie;
    @NotNull ( message = "Veuillez saisir un numéro de code postal" )
    @Pattern( regexp = "[0-9]{5}", message = "Veuillez saisir un numéro de code postal valide" )
    private static String codePostal;
    @NotNull ( message = "Veuillez saisir le nom d'une ville" )
    private static String ville;
    @NotNull ( message = "Veuillez saisir un numéro le nom d'un pays" )
    private static String pays;
    @NotNull ( message = "Veuillez saisir un chiffre" )
    private static int numRue;
    @NotNull(message = "Veuillez saisir une adresse email")
    @Pattern(regexp = "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)", message = "Merci de saisir une adresse mail valide")
    private static String eMail;
    @NotNull ( message = "Veuillez saisir un numéro de telephone portable" )
    private static int telPortable;
    @NotNull ( message = "Veuillez saisir un numéro de telephone fixe" )
    private static int telFixe;

    //Getter and Setter
    public Voies[] getVoies() { return voies; }
    
    public static String getVoiesString() { return voies.toString(); }
    
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

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
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
