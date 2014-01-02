public class BureauProGphy extends Etudiant {

	private Poste poste;
	private int anneesMembre;
	private String identifiant;
	private String mdp;
	private boolean actif;

	public BureauProGphy() {
		throw new UnsupportedOperationException();
	}

	public Poste getPoste() {
		return this.poste;
	}

	/**
	 * 
	 * @param poste
	 */
	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public int getAnneesMembre() {
		return this.anneesMembre;
	}

	/**
	 * 
	 * @param anneesMembre
	 */
	public void setAnneesMembre(int anneesMembre) {
		this.anneesMembre = anneesMembre;
	}

	/**
	 * 
	 * @param annee
	 */
	public void addAnneeMembre(int annee) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param annee
	 */
	public void delAnneeMembre(int annee) {
		throw new UnsupportedOperationException();
	}

	public String getIdentifiant() {
		return this.identifiant;
	}

	/**
	 * 
	 * @param identifiant
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMdp() {
		return this.mdp;
	}

	/**
	 * 
	 * @param mdp
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean getActif() {
		return this.actif;
	}

	/**
	 * 
	 * @param actif
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

}