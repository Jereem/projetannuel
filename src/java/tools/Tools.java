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
    public String saveNewAdherent() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = Etudiant.getTitresString().toString();
            String paramNom = Etudiant.getNom();
            String paramPrenom = Etudiant.getPrenom();
            long paramNumeroSS = Etudiant.getNumeroSS();
            Date paramdateNaissance = Etudiant.getDateNaissance();
            int paramNumRue = Etudiant.getCoordonnees().getNumRue();
            String paramTypeVoie = Etudiant.getCoordonnees().getVoiesString();
            String paramNomRue = Etudiant.getCoordonnees().getRue();
            String paramCP = Etudiant.getCoordonnees().getCodePostal();
            String paramVille = Etudiant.getCoordonnees().getVille();
            String paramPays = Etudiant.getCoordonnees().getPays();
            String paramEmail = Etudiant.getCoordonnees().geteMail();
            int paramTelFixe = Etudiant.getCoordonnees().getTelFixe();
            int paramTelMobile = Etudiant.getCoordonnees().getTelPortable();
            int paramPromo = Etudiant.getPromotion();
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
            b.getMyStatement().executeUpdate("INSERT INTO projetannuel.personne(Titre, Nom_Personne, Prenom_Personne, Numero_SS) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + "," + paramNumeroSS + ")");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        }
        return "success";
    }

    
    public List<BureauProGphy> getBureauProGphy() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from membre_bureau");
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
}
