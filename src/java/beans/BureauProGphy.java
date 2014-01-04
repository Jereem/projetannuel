package beans;

import java.util.ArrayList;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped


public class BureauProGphy extends Etudiant implements Serializable {

	private Poste poste;
	private ArrayList<Integer> anneesMembre;
	private String identifiant;
	private String mdp;
	private boolean actif;


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

	public ArrayList<Integer> getAnneesMembre() {
		return this.anneesMembre;
	}

	/**
	 * 
	 * @param anneesMembre
	 */
	public void setAnneesMembre(ArrayList<Integer> anneesMembre) {
		this.anneesMembre = anneesMembre;
	}

	/**
	 * 
	 * @param annee
	 */
	public void addAnneeMembre(Integer annee) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param annee
	 */
	public void delAnneeMembre(Integer annee) {
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