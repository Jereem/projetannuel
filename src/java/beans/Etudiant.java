package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import tools.ConnectBDD;
import tools.Tools;

@ManagedBean
@RequestScoped

public class Etudiant extends Personne implements Serializable {

    private ArrayList<Integer> anneesAdherant;
    @NotNull ( message = "Veuillez saisir un numéro à 13 chiffres" )
    @Digits (integer = 15, fraction = 1, message = "Veuillez saisir un numéro à 15 chiffres")
    private long numeroSS;
    private ArrayList<Competences> listeCompetences;
    @NotNull ( message = "Veuillez saisir une date de naissance" )
   // @Pattern(regexp = "^(\\d\\d)\\/(\\d\\d)\\/(\\d\\d)$", message = "Merci de saisir une date valide (jj/mm/aa)")
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
    
    
    @Override
    public Titres getTitre(){
         return super.getTitre();
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
    
}
