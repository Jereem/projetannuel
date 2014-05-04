/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import beans.BureauProGphy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean(name = "utilisateurM")
@SessionScoped
/**
 *
 * @author teddy
 */
public class UtilisateurManaged {

    private BureauProGphy selectedUtilisateur;
    private BureauProGphy tryUtilisateur;

    public BureauProGphy getSelectedUtilisateur() {
        return selectedUtilisateur;
    }

    public void setSelectedUtilisateur(BureauProGphy selectedUtilisateur) {
        this.selectedUtilisateur = selectedUtilisateur;
    }

    public BureauProGphy getTryUtilisateur() {
        return tryUtilisateur;
    }

    public void setTryUtilisateur(BureauProGphy tryUtilisateur) {
        this.tryUtilisateur = tryUtilisateur;
    }
    
    public String connexion() throws SQLException{
        Boolean utilOK = false;
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select count(*) as nbutil from MEMBRE_BUREAU where Identifiant = " + this.tryUtilisateur.getIdentifiant() +" Mot_de_Passe = " + this.tryUtilisateur.getMdp() +"");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            if (result.getInt("nbutil") > 0){
                utilOK = true;
            }
        }
        if (utilOK) {
            this.selectedUtilisateur = this.tryUtilisateur;
        return "tableauBord";
        }
        else {
                return "index";
            }
    }

}
