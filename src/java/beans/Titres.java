package beans;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public enum Titres implements Serializable{
	MR, MME, MLLE, DR, PF, MAITRE

}