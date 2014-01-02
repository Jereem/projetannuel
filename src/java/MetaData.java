public abstract class MetaData {

	private int nomMetaData;
	private int valeur;
        // creer un type de valeur non définit

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