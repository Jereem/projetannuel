package tools;

import Interface.ProjetDialog;
import beans.BureauProGphy;
import beans.Client;
import beans.Coordonnees;
import beans.Documents;
import beans.Etudiant;
import beans.Projet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
/**
 *
 * @author Teddy Delavallee
 */
public class Tools {
    
    public List<Projet> getProjetx(Boolean actif) throws SQLException {
        ProjetDialog slctProj = new ProjetDialog();
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
            slctProj.setSelectedProjet(projet);
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
                doc.setProjet(projet);
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
            //store all data into a List
            list.add(projet);
            ProjetDialog selectedproj = new ProjetDialog();
            selectedproj.setSelectedProjet(projet);
        }
        return list;
    }
    
    /**
     *prend une date au format java et la convertie au format SQL
     * @param datejava (dd-mm-aaaa)
     * @return dateSQl (aaaa-mm-dd)
     */
    public String dateJavaToSQL(Date datejava){
        String convert = datejava.toString();
         String dd =convert.substring(0,2);
         String mm= convert.substring(3,5);
         String aa= convert.substring(6,10);
       
         String dateSQL=aa+"-"+mm+"-"+dd;
        
         System.out.println(dateSQL);
        return dateSQL;
    }
    
    /**
     * prend une date au format SQL et la convertie au format date de java
     * @param dateSQL (aaaa-mm-dd)
     * @return dateJava (dd-mm-aaaa)
     */
    public Date dateSQLToJava(String dateSQL){
         String aaaa= dateSQL.substring(0,4);
         String mm= dateSQL.substring(5,7);
         String dd= dateSQL.substring(8,10);
       
         Date dateJava = null;
         dateJava.setYear(Integer.parseInt(aaaa));
         dateJava.setMonth(Integer.parseInt(mm));
         dateJava.setDate(Integer.parseInt(dd));
     
        return dateJava;
    }
    
}

