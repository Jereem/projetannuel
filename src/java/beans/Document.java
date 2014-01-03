package beans;

import java.util.ArrayList;

public class Document {

	private String nomDoc;
	private String typeDoc;
	private ArrayList<MetaData> listMetaData;
	private String emplacement;
	private BureauProGphy auteur;
	private int annee;

	public Document() {
		throw new UnsupportedOperationException();
	}

	public String getNomDoc() {
		return this.nomDoc;
	}

	/**
	 * 
	 * @param nomDoc
	 */
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getTypeDoc() {
		return this.typeDoc;
	}

	/**
	 * 
	 * @param typeDoc
	 */
	public void setTypeDoc(String typeDoc) {
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

	public String getEmplacement() {
		return this.emplacement;
	}

	/**
	 * 
	 * @param emplacement
	 */
	public void setEmplacement(String emplacement) {
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