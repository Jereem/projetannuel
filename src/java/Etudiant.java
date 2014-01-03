
import java.util.ArrayList;
import java.util.Date;

public class Etudiant extends Personne {

	private int promotion;
	private ArrayList<Integer> anneesAdherant;
	private int numeroSS;
	private ArrayList<Competences> listeCompetences;
	private Date dateNaissance;
	private boolean AJourCotisation;

	public int getAnneeEtude() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param anneeEtude
	 */
	public void setAnneeEtude(int anneeEtude) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Integer> getAnneesAdherant() {
		return this.anneesAdherant;
	}

	/**
	 * 
	 * @param anneesAdherant
	 */
	public void setAnneesAdherant(ArrayList<Integer> anneesAdherant) {
		this.anneesAdherant = anneesAdherant;
	}

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

	public int getNumeroSS() {
		return this.numeroSS;
	}

	/**
	 * 
	 * @param NumeroSS
	 */
	public void setNumeroSS(int NumeroSS) {
		this.numeroSS = NumeroSS;
	}

	public ArrayList<Competences> getListeCompetences() {
		return this.listeCompetences;
	}

	/**
	 * 
	 * @param listeCompetences
	 */
	public void setListeCompetences(ArrayList<Competences> listeCompetences) {
		this.listeCompetences = listeCompetences;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	/**
	 * 
	 * @param dateNaissance
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean getAJourCotisation() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AJourCotisation
	 */
	public void setAJourCotisation(boolean AJourCotisation) {
		throw new UnsupportedOperationException();
	}

}