package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public enum Voies implements Serializable{
	Rue, Boulevard, LieuDit, Avenue, Allee, Impasse, Quai

}