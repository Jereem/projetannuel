package ApliWebProGphy;

public class Client extends Personne {

	private string societe;
	private int siren;
	private string qualite;

	public Client() {
		throw new UnsupportedOperationException();
	}

	public string getSociete() {
		return this.societe;
	}

	/**
	 * 
	 * @param societe
	 */
	public void setSociete(string societe) {
		this.societe = societe;
	}

	public int getSiren() {
		return this.siren;
	}

	/**
	 * 
	 * @param siren
	 */
	public void setSiren(int siren) {
		this.siren = siren;
	}

	public string getPoste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qualite
	 */
	public void setPoste(string qualite) {
		throw new UnsupportedOperationException();
	}

}