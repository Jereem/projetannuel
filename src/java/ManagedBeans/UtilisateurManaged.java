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
    private boolean validationComplete = false;

    public UtilisateurManaged(){
        selectedUtilisateur = new BureauProGphy();
    }
    public boolean isValidationComplete() {
        return validationComplete;
    }

    public void setValidationComplete(boolean validationComplete) {
        this.validationComplete = validationComplete;
    }

    public BureauProGphy getSelectedUtilisateur() {
        return selectedUtilisateur;
    }

    public void setSelectedUtilisateur(BureauProGphy selectedUtilisateur) {
        this.selectedUtilisateur = selectedUtilisateur;
    }

    public String connexion() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select count(*) as nbutil from MEMBRE_BUREAU where Identifiant = '" + this.selectedUtilisateur.getIdentifiant() + "' and Mot_de_Passe = '" + this.selectedUtilisateur.getMdp() + "' and actif = 1");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            int nbutil = result.getInt("nbutil");
            if (nbutil > 0) {
                this.validationComplete = true;
            }
        }
        if (this.validationComplete) {
            return "tableauBord";
        } else {
            return "index";
        }
    }

}
