package ApliWebProGphy;

public abstract class MetaData {

	private int nomMetaData;
	private int valeur;

	public MetaData() {
		throw new UnsupportedOperationException();
	}

	public void getNomMetaData() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomMetaData
	 */
	public void setNomMetaData(int nomMetaData) {
		this.nomMetaData = nomMetaData;
	}

	public void getValeur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valeur
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

}