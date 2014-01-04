package beans;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public abstract class MetaData implements Serializable{

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