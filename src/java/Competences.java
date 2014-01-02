public class Competences {

	private Note note;
	private int nomCompetence;

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
	public void setNomCompetence(int nomCompetence) {
		this.nomCompetence = nomCompetence;
	}

}