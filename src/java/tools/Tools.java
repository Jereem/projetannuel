package tools;

import beans.BureauProGphy;
import beans.Coordonnees;
import beans.Etudiant;
import beans.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Teddy Delavallee
 */
public class Tools {
    // Methodes pour sauvegarder dans la BDD
    public String saveNewAdherent(beans.Etudiant adherent) throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = adherent.getTitresString().toString();
            String paramNom = adherent.getNom();
            String paramPrenom = adherent.getPrenom();
            long paramNumeroSS = adherent.getNumeroSS();
            Date paramdateNaissance = adherent.getDateNaissance();
            int paramNumRue = adherent.getCoordonnees().getNumRue();
            String paramTypeVoie = adherent.getCoordonnees().getVoiesString();
            String paramNomRue = adherent.getCoordonnees().getRue();
            String paramCP = adherent.getCoordonnees().getCodePostal();
            String paramVille = adherent.getCoordonnees().getVille();
            String paramPays = adherent.getCoordonnees().getPays();
            String paramEmail = adherent.getCoordonnees().geteMail();
            int paramTelFixe = adherent.getCoordonnees().getTelFixe();
            int paramTelMobile = adherent.getCoordonnees().getTelPortable();
            int paramPromo = adherent.getPromotion();
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate("INSERT INTO projetannuel.ADHERENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES  (Titre, Nom_Personne, Prenom_Personne, Numero_SS, Date_Naissance, Promotion, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + "," + paramNumeroSS + "," + paramdateNaissance + "," + paramPromo + "," + paramEmail + "," + paramNomRue + "," + paramNumRue + "," + paramTypeVoie +"," + paramVille +"," + paramCP +"," + paramPays +"," + paramTelFixe +"," + paramTelMobile +")");
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
        
    }

    
    public List<Etudiant> getNewAdherent() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.ADHERENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES");
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
            coordonnes.seteMail(result.getString("Email"));
            coordonnes.setTelFixe(result.getInt("Telephone_1"));
            coordonnes.setTelPortable(result.getInt("Telephone_2"));
            adherent.setCoordonnees(coordonnes);
            adherent.setPromotion(result.getInt("Promotion"));
            System.out.println(adherent.getNom());
            System.out.println("test");
            //store all data into a List
            list.add(adherent);
        }
        System.out.println(list);
        return list;
    }
}
