package beans;
import static beans.Note.Bon;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jeremygillet
 */
@ManagedBean
@RequestScoped

public class Competences implements Serializable {

    private Note note;
    private String nomCompetence;

    public Competences() {
            this.note=Bon;
            this.nomCompetence="programmation";
    }

    /**
     *
     * @return
     */
    public Note getNote() {
        return this.note;
    }

    /**
     *
     * @param note
     */
    public void setNote(Note note) {
        this.note = note;
    }

    /**
     *
     * @return 
     */
    public String getNomCompetence() {
        return this.nomCompetence;
    }

    /**
     *
     * @param nomCompetence
     */
    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

}
