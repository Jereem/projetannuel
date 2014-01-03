
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Personne implements Serializable{

	private String nom;
	private String prenom;
	private Titres titre;
	private Coordonnees coordonnees;

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param Nom
	 */
	public void setNom(int Nom) {
		throw new UnsupportedOperationException();
	}

	public String getPrenom() {
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