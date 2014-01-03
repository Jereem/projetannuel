package beans;
public class Coordonnees {

	private String rue;
	private Voies typeVoie;
	private int cp;
	private String ville;
	private String pays;
	private int numRue;
	private String eMail;
	private int telPortable;
	private int telFixe;

	public Coordonnees() {
		throw new UnsupportedOperationException();
	}

	public String getRue() {
		return this.rue;
	}

	/**
	 * 
	 * @param rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	public Voies getTypeVoie() {
		return this.typeVoie;
	}

	/**
	 * 
	 * @param typeVoie
	 */
	public void setTypeVoie(Voies typeVoie) {
		this.typeVoie = typeVoie;
	}

	public int getCP() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cp
	 */
	public void setCP(int cp) {
		throw new UnsupportedOperationException();
	}

	public String getVille() {
		return this.ville;
	}

	/**
	 * 
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return this.pays;
	}

	/**
	 * 
	 * @param pays
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNumRue() {
		return this.numRue;
	}

	/**
	 * 
	 * @param numRue
	 */
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getEMail() {
		return this.eMail;
	}

	/**
	 * 
	 * @param eMail
	 */
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public int getTelPortable() {
		return this.telPortable;
	}

	/**
	 * 
	 * @param telPortable
	 */
	public void setTelPortable(int telPortable) {
		this.telPortable = telPortable;
	}

	public int getTelFixe() {
		return this.telFixe;
	}

	/**
	 * 
	 * @param telFixe
	 */
	public void setTelFixe(int telFixe) {
		this.telFixe = telFixe;
	}

}