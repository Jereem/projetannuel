package beans;

import java.util.ArrayList;

public class Projet {

	private Client client;
	private ArrayList<Etudiant> devellopeurs;
	private String nomProjet;
	private ArrayList<Document> documents;
	private ArrayList<BureauProGphy> membresDuBureau;

	public Projet() {
		throw new UnsupportedOperationException();
	}

	public Client getClient() {
		return this.client;
	}

	/**
	 * 
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Etudiant> getDevellopeurs() {
		return this.devellopeurs;
	}

	/**
	 * 
	 * @param devellopeurs
	 */
	public void setDevellopeurs(ArrayList<Etudiant> devellopeurs) {
		this.devellopeurs = devellopeurs;
	}

	public String getNomProjet() {
		return this.nomProjet;
	}

	/**
	 * 
	 * @param nomProjet
	 */
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void addEtudiant(Etudiant etudiant) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void delEtudiant(Etudiant etudiant) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Document> getDocuments() {
		return this.documents;
	}

	/**
	 * 
	 * @param documents
	 */
	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	/**
	 * 
	 * @param document
	 */
	public void addDocument(Document document) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param document
	 */
	public void delDocument(Document document) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<BureauProGphy> getMembresDuBureau() {
		return this.membresDuBureau;
	}

	/**
	 * 
	 * @param membresDuBureau
	 */
	public void setMembresDuBureau(ArrayList<BureauProGphy> membresDuBureau) {
		this.membresDuBureau = membresDuBureau;
	}

}