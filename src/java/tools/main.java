package tools;


import java.sql.ResultSet;
import java.sql.SQLException;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeremygillet
 */
public class main {
    
    public static void main(String[] args) {

        ConnectBDD b = new ConnectBDD();

        try {


            /* Exécution d'une requête de lecture */
            ResultSet resultat = b.getMyStatement().executeQuery("SELECT * FROM ANNEE;");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                int id = resultat.getInt("id_annee");
                int annee = resultat.getInt("Annee");

                //String nomUtilisateur = resultat.getString( "nom" );
                System.out.println("id_annee: " + id);
                System.out.println("annee: " + annee);
                /* Traiter ici les valeurs récupérées. */
            }
//if (b.getMyStatement().execute("SELECT * FROM ANNEE")) {
            // ResultSet rs = b.getMyStatement().getResultSet();
   // }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

//System.out.println("resultat" + rs);
    }
}
