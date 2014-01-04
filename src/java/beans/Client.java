package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public class Client extends Personne implements Serializable{

	private String societe;
	private int siren;
	private String qualite;

	public Client() {
		throw new UnsupportedOperationException();
	}

	public String getSociete() {
		return this.societe;
	}

	/**
	 * 
	 * @param societe
	 */
	public void setSociete(String societe) {
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

	public String getPoste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qualite
	 */
	public void setPoste(String qualite) {
		throw new UnsupportedOperationException();
	}

}