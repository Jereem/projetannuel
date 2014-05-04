/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Coordonnees;
import beans.Etudiant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;
import tools.Tools;


@ManagedBean(name="etudiantM")
@SessionScoped
/**
 *
 * @author Audrey
 */
public class EtudiantManaged {
    private Etudiant selectedEtudiant;

    public EtudiantManaged(){
        this.selectedEtudiant = new Etudiant();
    }

    public Etudiant getSelectedEtudiant() {
        return selectedEtudiant;
    }

    public void setSelectedEtudiant(Etudiant selectedEtudiant) {
        this.selectedEtudiant = selectedEtudiant;
    }
    
    
    // Methode pour sauvegarder un adhérent dans la BDD
    public String saveNewAdherent() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        System.out.println("je fais des requetes");
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = this.selectedEtudiant.getTitresString().toString();
            String paramNom = this.selectedEtudiant.getNom();
            String paramPrenom = this.selectedEtudiant.getPrenom();
            long paramNumeroSS = this.selectedEtudiant.getNumeroSS();
            Date javaDateNaissance= this.selectedEtudiant.getDateNaissance();
            Tools tls= new Tools();
            String paramdateNaissance = tls.dateJavaToSQL(javaDateNaissance);
            System.out.println(paramdateNaissance);
            int paramNumRue = this.selectedEtudiant.getCoordonnees().getNumRue();
            String paramTypeVoie = this.selectedEtudiant.getCoordonnees().getVoiesString();
            String paramNomRue = this.selectedEtudiant.getCoordonnees().getRue();
            String paramCP = this.selectedEtudiant.getCoordonnees().getCodePostal();
            String paramVille = this.selectedEtudiant.getCoordonnees().getVille();
            String paramPays = this.selectedEtudiant.getCoordonnees().getPays();
            String paramEmail = this.selectedEtudiant.getCoordonnees().getEmail();
            int paramTelFixe = this.selectedEtudiant.getCoordonnees().getTelFixe();
            int paramTelMobile = this.selectedEtudiant.getCoordonnees().getTelPortable();
            int paramPromo = this.selectedEtudiant.getPromotion();
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            /* b.getMyStatement().executeUpdate(""
                    + "INSERT INTO PERSONNE(Titre, Nom_Personne, Prenom_Personne) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + "); "
                    + "SELECT @last:=LAST_INSERT_ID(); "
                    + "INSERT INTO ADHERENT (Id_Personne, Numero_SS, Date_Naissance, Promotion) VALUES (@last, " + paramNumeroSS + "," + paramdateNaissance + "," + paramPromo + "); "
                    + "INSERT INTO coordonnees (Id_Personne, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (@last," + paramEmail + "," + paramNomRue + "," + paramNumRue + "," + paramTypeVoie +"," + paramVille +"," + paramCP +"," + paramPays +"," + paramTelFixe +"," + paramTelMobile +");");
            */
            
            b.getMyStatement().executeUpdate("INSERT INTO PERSONNE(Titre, Nom_Personne, Prenom_Personne) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + ")");
            ResultSet result= b.getMyStatement().executeQuery("SELECT @last:=LAST_INSERT_ID()");
            int id_pers=result.getInt(1);
            b.getMyStatement().executeUpdate("INSERT INTO ADHERENT (Id_Personne, Numero_SS, Date_Naissance, Promotion) VALUES (@last, " + paramNumeroSS + "," + paramdateNaissance + "," + paramPromo + ")");
            b.getMyStatement().executeUpdate("INSERT INTO coordonnees (Id_Personne, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (@last," + paramEmail + "," + paramNomRue + "," + paramNumRue + "," + paramTypeVoie +"," + paramVille +"," + paramCP +"," + paramPays +"," + paramTelFixe +"," + paramTelMobile +")");           
            return "success";    
            }
            catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
                return "failed";
        }
    }
    
    // Methode pour afficher la liste des adhérents actuels
    public List<Etudiant> getAdherent() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.ADHERENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES where A_Jour_Cotisation = 1");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Etudiant> list = new ArrayList<>();
        while (result.next()) {
            Etudiant adherent = new Etudiant();
            adherent.setTitres(result.getString("Titre"));
            adherent.setNom(result.getString("Nom_Personne"));
            adherent.setPrenom(result.getString("Prenom_Personne"));
            adherent.setNumeroSS(result.getLong("Numero_SS"));
            adherent.setDateNaissance(result.getDate("Date_Naissance"));
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
            adherent.setCoordonnees(coordonnes);
            adherent.setPromotion(result.getInt("Promotion"));
//            System.out.println(adherent.getNom());
//            System.out.println("test");
            //store all data into a List
            list.add(adherent);
        }
//        System.out.println(list);
        return list;
    }
    
    // Methode pour afficher la liste des anciens adhérents
    public List<Etudiant> getOldAdherent() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("SELECT * FROM projetannuel.ADHERENT NATURAL JOIN projetannuel.PERSONNE NATURAL JOIN projetannuel.COORDONNEES WHERE A_Jour_Cotisation = 0");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Etudiant> list = new ArrayList<>();
        while (result.next()) {
            Etudiant adherent = new Etudiant();
            adherent.setTitres(result.getString("Titre"));
            adherent.setNom(result.getString("Nom_Personne"));
            adherent.setPrenom(result.getString("Prenom_Personne"));
            adherent.setNumeroSS(result.getLong("Numero_SS"));
            adherent.setDateNaissance(result.getDate("Date_Naissance"));
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
            adherent.setCoordonnees(coordonnes);
            adherent.setPromotion(result.getInt("Promotion"));
//            System.out.println(adherent.getNom());
//            System.out.println("test");
            //store all data into a List
            list.add(adherent);
        }
//        System.out.println(list);
        return list;
    }

    // Methode pour supprimer un adhérent de la liste des adhérents actuels (adhérent archivé dans la liste des anciens adhérents)
    public String delAdherent () throws SQLException{
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNom = this.selectedEtudiant.getNom();
            String paramPrenom = this.selectedEtudiant.getPrenom();
	
        /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
        b.getMyStatement().executeUpdate(""
                + "UPDATE ADHERENT SET A_Jour_Cotisation=0 WHERE Id_Personne = (SELECT Id_Personne FROM PERSONNE WHERE Nom_Personne='"+paramNom+"' AND Prenom_Personne='"+paramPrenom+"')");
        return "success";    
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
    
    // Methode pour sauvegarder un adhérent dans la BDD
    public String modifyAdherent() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = this.selectedEtudiant.getTitresString().toString();
            String paramNom = this.selectedEtudiant.getNom();
            String paramPrenom = this.selectedEtudiant.getPrenom();
            long paramNumeroSS = this.selectedEtudiant.getNumeroSS();
            Date paramdateNaissance = this.selectedEtudiant.getDateNaissance();
            /*int paramNumRue = this.getCoordonnees().getNumRue();
            String paramTypeVoie = this.getCoordonnees().getVoiesString();
            String paramNomRue = this.getCoordonnees().getRue();
            String paramCP = this.getCoordonnees().getCodePostal();
            String paramVille = this.getCoordonnees().getVille();
            String paramPays = this.getCoordonnees().getPays();
            String paramEmail = this.getCoordonnees().geteMail();
            int paramTelFixe = this.getCoordonnees().getTelFixe();
            int paramTelMobile = this.getCoordonnees().getTelPortable();
            int paramPromo = this.getPromotion();*/
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate(""
            );
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
}
