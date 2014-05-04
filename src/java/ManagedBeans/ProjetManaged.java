/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.BureauProGphy;
import beans.Client;
import beans.Documents;
import beans.Etudiant;
import beans.Projet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import static javax.swing.UIManager.getString;
import tools.ConnectBDD;

@ManagedBean(name="projetM")
@SessionScoped
/**
 *
 * @author teddy
 */
public class ProjetManaged {
    
    private Projet selectedProjet;
    
    public ProjetManaged(){
        selectedProjet = new Projet();
    }

    public Projet getSelectedProjet() {
        return selectedProjet;
    }

    public void setSelectedProjet(Projet selectedProjet) {
        this.selectedProjet = selectedProjet;
    }
    
    // Methodes pour la BDD
    public String saveProjet() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNomProjet = this.selectedProjet.getNomProjet();
            long paramClient = this.selectedProjet.getClient().getSiren();
            String paramBureau = this.selectedProjet.getCommercial().getIdentifiant();
            Statement statement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("INSERT INTO projetannuel.PROJET(Nom_Projet, Siret) VALUES (?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setString(1, paramNomProjet);
            ps.setLong(2, paramClient);
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
//            ResultSet result = statement.executeQuery("INSERT INTO projetannuel.PROJET(Nom_Projet, Siret) VALUES ("+ paramNomProjet +","+ paramClient +")");
//            ResultSet result2 = statement.executeQuery( "SELECT @last:=LAST_INSERT_ID()" );
//            ResultSet result3 = statement.executeQuery("INSERT INTO SUPERVISE (Identifiant, Id_Projet) VALUES (" + paramBureau + ", @last)");
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }

    public List<Projet> getProjet(Boolean actif) throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        if (actif == true) {
            ps = con.prepareStatement("select Id_Projet, Nom_Projet, Societe, Siret, Qualite, Titre, Nom_Personne, Prenom_Personne from Projet natural join client natural join Personne");
        } else {
            ps = con.prepareStatement("select Id_Projet, Nom_Projet, Societe, Siret, Qualite, Titre, Nom_Personne, Prenom_Personne from Projet natural join client natural join Personne natural join est_en_phase where Nom_Etape = 'clôture du projet'");
        }

        //get customer data from database
        ResultSet result = ps.executeQuery();
        List<Projet> list = new ArrayList<>();
        while (result.next()) {
            Projet projet = new Projet();
            Client clientp = new Client();
            projet.setNomProjet(result.getString("Nom_Projet"));
            clientp.setNom(result.getString("Nom_Personne"));
            clientp.setPrenom(result.getString("Prenom_Personne"));
            clientp.setTitres(result.getString("Titre"));
            clientp.setSiren(result.getLong("Siret"));
            clientp.setSociete(result.getString("Societe"));
            projet.setClient(clientp);
            int idproj = result.getInt("Id_Projet");
            BureauProGphy chefProjet = new BureauProGphy();
            Statement statement = con.createStatement();
            ResultSet resultat2 = statement.executeQuery( "select Nom_Personne from Projet natural join supervise natural join adherent natural join personne natural join membre_bureau natural join est_elu where Id_Projet = "+idproj+" and poste = 'Chef de Projets' and Actif = 1;" );
            while ( resultat2.next() ) {
                chefProjet.setNom(resultat2.getString( "Nom_Personne" ));
                /* Traiter ici les valeurs récupérées. */
            }
            projet.setChefDeProjet(chefProjet);
            BureauProGphy commercial = new BureauProGphy();
            Statement statement2 = con.createStatement();
            ResultSet resultat3 = statement2.executeQuery( "select Nom_Personne from Projet natural join supervise natural join adherent natural join personne natural join membre_bureau natural join est_elu where Id_Projet = "+idproj+" and poste = 'Commercial' and Actif = 1;" );
            while ( resultat3.next() ) {
                commercial.setNom(resultat3.getString( "Nom_Personne" ));
                /* Traiter ici les valeurs récupérées. */
            }
            Statement statement3 = con.createStatement();
            ResultSet resultat4 = statement3.executeQuery( "select Nom_Document, Extension, Annee, Emplacement, Id_Projet from document where Id_Projet = "+idproj+";" );
            while ( resultat4.next() ) {
                Documents doc = new Documents();
                doc.setNomDoc(resultat4.getString("Nom_Document"));
                doc.setTypeDoc(resultat4.getString("Extension"));
                doc.setEmplacement(resultat4.getString("Emplacement"));
                doc.setProjet(selectedProjet);
                doc.setAnnee(resultat4.getInt("Annee"));
                projet.addDocument(doc);
                /* Traiter ici les valeurs récupérées. */
            }
            projet.setCommercial(commercial);
            Statement statement5 = con.createStatement();
            ResultSet resultat5 = statement5.executeQuery( "SELECT (count(*)/12*100) as nb_etapes FROM projetannuel.est_en_phase where Id_Projet = "+idproj+";" );
            while ( resultat5.next() ) {
                projet.setProgression(Math.round(resultat5.getInt("nb_etapes")));
                /* Traiter ici les valeurs récupérées. */
            }
            Statement statement6 = con.createStatement();
            ResultSet resultat6 = statement3.executeQuery( "select Nom_Personne, Prenom_Personne from PROJET natural join TRAVAILLE natural join ADHERENT natural join PERSONNE where Id_Projet = "+idproj+";" );
            while ( resultat6.next() ) {
                Etudiant etu = new Etudiant();
                etu.setPrenom(resultat6.getString("Prenom_Personne"));
                etu.setNom(resultat6.getString("Nom_Personne"));
                projet.addDevellopeurs(etu);
                /* Traiter ici les valeurs récupérées. */
            }
            //store all data into a List
            list.add(projet);
        }
        return list;
    }
}
