package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

public class Client extends Personne implements Serializable{

	private String societe;
	private long siren;
	private String qualite;

	public Client() {
		this.societe = "NewSociete";
	}

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
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

	public long getSiren() {
		return this.siren;
	}

	/**
	 * 
	 * @param siren
	 */
	public void setSiren(long siren) {
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
