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
    @Size( min = 1, max = 13, message = "L'identifiant doit contenir moins de 13 caractères" )
    private String identifiant;
    @NotNull
    private String mdp;
    private boolean actif;

    // Getter et Setter
    
    public boolean isActif() {
        return actif;
    }
    
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
    
}
