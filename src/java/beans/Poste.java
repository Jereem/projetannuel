package beans;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public enum Poste implements Serializable{
	President, VicePresident, Secretaire, ViceSecretaire, Tresorier, ViceTresorier, Commercial, ChefDeProjet, MembreActif

}