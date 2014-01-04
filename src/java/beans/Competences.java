package beans;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public class Competences implements Serializable{

	private Note note;
	private String nomCompetence;

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

	public void getNomCompetence() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomCompetence
	 */
	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}

}