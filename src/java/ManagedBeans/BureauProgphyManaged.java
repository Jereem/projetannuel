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
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean(name="bureauM")
@SessionScoped

/**
 *
 * @author teddy
 */
public class BureauProgphyManaged {
    private BureauProGphy selectedBureauProGphy;

    public BureauProGphy getSelectedBureauProGphy() {
        return selectedBureauProGphy;
    }

    public void setSelectedBureauProGphy(BureauProGphy selectedBureauProGphy) {
        this.selectedBureauProGphy = selectedBureauProGphy;
    }
    
    // Methode pour afficher la liste des membres actuels
    public List<BureauProGphy> getCommercial() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from MEMBRE_BUREAU natural join EST_ELU natural join ADHERENT natural join PERSONNE where Poste = 'Commercial' and YEAR(NOW()) - Annee_election <= 2");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<BureauProGphy> list = new ArrayList<>();
        while (result.next()) {
            BureauProGphy membre = new BureauProGphy();
            membre.setIdentifiant(result.getString("Identifiant"));
            membre.setMdp(result.getString("Mot_de_passe"));
            membre.setNom(result.getString("Nom_Personne"));
            membre.setPrenom(result.getString("Prenom_Personne"));
            membre.setActif(result.getBoolean("Actif"));
            //store all data into a List
            list.add(membre);
        }
        return list;
    }
}
