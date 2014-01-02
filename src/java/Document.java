package ApliWebProGphy;

public class Document {

	private string nomDoc;
	private string typeDoc;
	private ArrayList<MetaData> listMetaData;
	private string emplacement;
	private BureauProGphy auteur;
	private int annee;

	public Document() {
		throw new UnsupportedOperationException();
	}

	public string getNomDoc() {
		return this.nomDoc;
	}

	/**
	 * 
	 * @param nomDoc
	 */
	public void setNomDoc(string nomDoc) {
		this.nomDoc = nomDoc;
	}

	public string getTypeDoc() {
		return this.typeDoc;
	}

	/**
	 * 
	 * @param typeDoc
	 */
	public void setTypeDoc(string typeDoc) {
		this.typeDoc = typeDoc;
	}

	public ArrayList<MetaData> getListMetaData() {
		return this.listMetaData;
	}

	/**
	 * 
	 * @param listMetaData
	 */
	public void setListMetaData(ArrayList<MetaData> listMetaData) {
		this.listMetaData = listMetaData;
	}

	/**
	 * 
	 * @param metaData
	 */
	public void addMetaData(MetaData metaData) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param metaData
	 */
	public void delMetaData(MetaData metaData) {
		throw new UnsupportedOperationException();
	}

	public string getEmplacement() {
		return this.emplacement;
	}

	/**
	 * 
	 * @param emplacement
	 */
	public void setEmplacement(string emplacement) {
		this.emplacement = emplacement;
	}

	public BureauProGphy getAuteur() {
		return this.auteur;
	}

	/**
	 * 
	 * @param auteur
	 */
	public void setAuteur(BureauProGphy auteur) {
		this.auteur = auteur;
	}

	public int getAnnee() {
		return this.annee;
	}

	/**
	 * 
	 * @param annee
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

}