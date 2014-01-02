package ApliWebProGphy;

public class Coordonnees {

	private string rue;
	private Voies typeVoie;
	private int cp;
	private string ville;
	private string pays;
	private int numRue;
	private string eMail;
	private int telPortable;
	private int telFixe;

	public Coordonnees() {
		throw new UnsupportedOperationException();
	}

	public string getRue() {
		return this.rue;
	}

	/**
	 * 
	 * @param rue
	 */
	public void setRue(string rue) {
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

	public string getVille() {
		return this.ville;
	}

	/**
	 * 
	 * @param ville
	 */
	public void setVille(string ville) {
		this.ville = ville;
	}

	public string getPays() {
		return this.pays;
	}

	/**
	 * 
	 * @param pays
	 */
	public void setPays(string pays) {
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

	public string getEMail() {
		return this.eMail;
	}

	/**
	 * 
	 * @param eMail
	 */
	public void setEMail(string eMail) {
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