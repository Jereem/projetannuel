package ApliWebProGphy;

public class Personne {

	private string nom;
	private string prenom;
	private Titres titre;
	private Coordonnees coordonnees;

	public Personne() {
		throw new UnsupportedOperationException();
	}

	public string getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param Nom
	 */
	public void setNom(int Nom) {
		throw new UnsupportedOperationException();
	}

	public string getPrenom() {
		return this.prenom;
	}

	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(int prenom) {
		throw new UnsupportedOperationException();
	}

	public Titres getTitre() {
		return this.titre;
	}

	/**
	 * 
	 * @param Titre
	 */
	public void setTitre(Titres Titre) {
		this.titre = Titre;
	}

	public Coordonnees getCoordonnees() {
		return this.coordonnees;
	}

	/**
	 * 
	 * @param coordonnees
	 */
	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

}