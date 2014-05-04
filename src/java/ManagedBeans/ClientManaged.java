/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Client;
import beans.Coordonnees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;


@ManagedBean(name="clientM")
@SessionScoped
/**
 *
 * @author teddy
 */
public class ClientManaged {
     private Client selectedClient;

    public ClientManaged() {
        this.selectedClient = new Client();
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }
    
    // Methode pour sauvegarder un client dans la BDD
    public String saveNewClient() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = this.selectedClient.getTitresString().toString();
            String paramNom = this.selectedClient.getNom();
            String paramPrenom = this.selectedClient.getPrenom();
            String paramNomSociete = this.selectedClient.getSociete();
            long paramNumeroSiret = this.selectedClient.getSiren();
            String paramPoste = this.selectedClient.getPoste();
            int paramNumRue = this.selectedClient.getCoordonnees().getNumRue();
            String paramTypeVoie = this.selectedClient.getCoordonnees().getVoiesString();
            String paramNomRue = this.selectedClient.getCoordonnees().getRue();
            String paramCP = this.selectedClient.getCoordonnees().getCodePostal();
            String paramVille = this.selectedClient.getCoordonnees().getVille();
            String paramPays = this.selectedClient.getCoordonnees().getPays();
            String paramEmail = this.selectedClient.getCoordonnees().getEmail();
            int paramTelFixe = this.selectedClient.getCoordonnees().getTelFixe();
            int paramTelMobile = this.selectedClient.getCoordonnees().getTelPortable();
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate(""
                    + "INSERT INTO PERSONNE(Titre, Nom_Personne, Prenom_Personne) VALUES ('" + paramTitre + "','" + paramNom + "','" + paramPrenom + "'); "
                    + "SELECT @last:=LAST_INSERT_ID(); "
                    + "INSERT INTO CLIENT (Id_Personne, Siret, Societe, Qualite) VALUES (@last, '" + paramNumeroSiret + "','" + paramNomSociete + "','" + paramPoste + "'); "
                    + "INSERT INTO COORDONNEES (Id_Personne, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (@last,'" + paramEmail + "','" + paramNomRue + "','" + paramNumRue + "','" + paramTypeVoie +"','" + paramVille +"','" + paramCP +"','" + paramPays + "','" + paramTelFixe +"','" + paramTelMobile +"')");
            b.getMyConnexion().commit();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
        
    // Methode pour afficher la liste des clients actuels    
    public List<Client> getClient() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.CLIENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES natural join projetannuel.PROJET natural join projetannuel.est_en_phase where Nom_Etape != 'clôture du projet'AND Id_est_en_phase IN(SELECT max(Id_est_en_phase) FROM est_en_phase GROUP BY Id_Projet);");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Client> list = new ArrayList<>();
        while (result.next()) {
            Client client = new Client();
            client.setTitres(result.getString("Titre"));
            client.setNom(result.getString("Nom_Personne"));
            client.setPrenom(result.getString("Prenom_Personne"));
            Coordonnees coordonnes = new Coordonnees();
            coordonnes.setNumRue(result.getInt("Numero_De_Rue"));
            coordonnes.setVoies(result.getString("Type_Voie"));
            coordonnes.setRue(result.getString("Rue"));
            coordonnes.setCodePostal(result.getString("Code_Postal"));
            coordonnes.setVille(result.getString("Ville"));
            coordonnes.setPays(result.getString("Pays"));
            coordonnes.setEmail(result.getString("Email"));
            coordonnes.setTelFixe(result.getInt("Telephone_1"));
            coordonnes.setTelPortable(result.getInt("Telephone_2"));
            client.setCoordonnees(coordonnes);
//            System.out.println(adherent.getNom());
//            System.out.println("test");
            //store all data into a List
            list.add(client);
        }
//        System.out.println(list);
        return list;
    }
    
    // Methode pour afficher la liste des anciens clients
    public List<Client> getOldClient() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.CLIENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES natural join projetannuel.PROJET natural join projetannuel.est_en_phase where Nom_Etape = 'clôture du projet'");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Client> list = new ArrayList<>();
        while (result.next()) {
            Client client = new Client();
            client.setTitres(result.getString("Titre"));
            client.setNom(result.getString("Nom_Personne"));
            client.setPrenom(result.getString("Prenom_Personne"));
            Coordonnees coordonnes = new Coordonnees();
            coordonnes.setNumRue(result.getInt("Numero_De_Rue"));
            coordonnes.setVoies(result.getString("Type_Voie"));
            coordonnes.setRue(result.getString("Rue"));
            coordonnes.setCodePostal(result.getString("Code_Postal"));
            coordonnes.setVille(result.getString("Ville"));
            coordonnes.setPays(result.getString("Pays"));
            coordonnes.setEmail(result.getString("Email"));
            coordonnes.setTelFixe(result.getInt("Telephone_1"));
            coordonnes.setTelPortable(result.getInt("Telephone_2"));
            client.setCoordonnees(coordonnes);
//            System.out.println(adherent.getNom());
//            System.out.println("test");
            //store all data into a List
            list.add(client);
        }
//        System.out.println(list);
        return list;
    }
    
    // Methode pour supprimer un client de la liste des clients actuels (client archivé dans la liste des anciens clients)
    public String delClient () throws SQLException{
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNom = this.selectedClient.getNom();
            String paramPrenom = this.selectedClient.getPrenom();
	
        /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
        b.getMyStatement().executeUpdate(""
                + "INSERT INTO est_en_phase (Id_Projet, Nom_Etape, Date_etape) VALUES ((SELECT Id_Projet FROM projet WHERE Siret =(SELECT Siret FROM client WHERE Id_Personne =(SELECT Id_Personne FROM personne WHERE Nom_Personne='"+paramNom+"' AND Prenom_Personne='"+paramPrenom+"'))),'clôture du projet', CURRENT_DATE());");
        return "success";    
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
    
    // Methode pour sauvegarder un client dans la BDD
    public String modifyClient() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNom = this.selectedClient.getNom();
            String paramPrenom = this.selectedClient.getPrenom();
            String paramPoste = this.selectedClient.getPoste();
            /*int paramNumRue = this.getCoordonnees().getNumRue();
            String paramTypeVoie = this.getCoordonnees().getVoiesString();
            String paramNomRue = this.getCoordonnees().getRue();
            String paramCP = this.getCoordonnees().getCodePostal();
            String paramVille = this.getCoordonnees().getVille();
            String paramPays = this.getCoordonnees().getPays();
            String paramEmail = this.getCoordonnees().geteMail();
            int paramTelFixe = this.getCoordonnees().getTelFixe();
            int paramTelMobile = this.getCoordonnees().getTelPortable();*/
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate(""
                    + "UPDATE CLIENT SET Qualite='"+paramPoste+"' WHERE Id_Personne = (SELECT Id_Personne FROM PERSONNE WHERE Nom_Personne='"+paramNom+"' AND Prenom_Personne='"+paramPrenom+"');");
            b.getMyConnexion().commit();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
}
