/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.BureauProGphy;
import beans.Etudiant;
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
    
    
        // Methode pour sauvegarder un membre du bureau dans la BDD
    public String saveBureauProGphy(EtudiantManaged etu) throws SQLException {
        BureauProGphy membre = new BureauProGphy();
        ConnectBDD con = new ConnectBDD();
        Connection b = con.getMyConnexion();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        etu.saveNewAdherent();
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramIdentifiant = membre.getIdentifiant();
            String paramMotDePasse = membre.getMdp();
            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement ps = b.prepareStatement("INSERT INTO projetannuel.MEMBRE_BUREAU(Identifiant, Mot_de_passe) VALUES (?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setString(1, paramIdentifiant);
            ps.setString(2, paramMotDePasse);
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }

    }

    // Methode pour afficher la liste des membres actuels
    public List<BureauProGphy> getBureauProGphy() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<BureauProGphy> list = new ArrayList<>();
        while (result.next()) {
            BureauProGphy membre = new BureauProGphy();
            membre.setIdentifiant(result.getString("Identifiant"));
            membre.setMdp(result.getString("Mot_de_passe"));
            //membre.setPoste(result.getString("Poste"));
            membre.setActif(result.getBoolean("Actif"));
            //store all data into a List
            list.add(membre);
        }
        return list;
    }
    
    // Methode pour afficher la liste des anciens membres
    public List<BureauProGphy> getBureauProGphy(Boolean actif) throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        if (actif==true)
        {
         ps= con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=1");
        }
        else
        {
         ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=0");
        }
        /*actif=false*/    
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<BureauProGphy> list = new ArrayList<>();
        while (result.next()) {
            BureauProGphy membre = new BureauProGphy();
            membre.setIdentifiant(result.getString("Identifiant"));
            membre.setMdp(result.getString("Mot_de_passe"));
            //membre.setPoste(result.getString("Poste"));
            membre.setActif(result.getBoolean("Actif"));
            //store all data into a List
            list.add(membre);
        }
        return list;
    }
    
        // Methode pour afficher la liste des commerciaux
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
    
    // Methode pour supprimer un membre du bureau de la liste des membres actuels (membre archivé dans la liste des anciens membres)
    public String delBureauProGphy () throws SQLException{
        Etudiant etu = new Etudiant();
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNom = etu.getNom();
            String paramPrenom = etu.getPrenom();
	
        /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
        b.getMyStatement().executeUpdate(""
                + "UPDATE MEMBRE_BUREAU SET Actif=0 WHERE Identifiant = (SELECT Identifiant FROM Est_Elu WHERE Numero_SS = (SELECT Numero_SS FROM ADHERENT WHERE Id_Personne = (SELECT Id_Personne FROM PERSONNE WHERE Nom_Personne='"+paramNom+"' AND Prenom_Personne='"+paramPrenom+"')));");
        return "success";    
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }

}
