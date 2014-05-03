/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

/**
 *
 * @author Teddy Delavallee
 */
import beans.Client;
import beans.Coordonnees;
import beans.Projet;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tools.ConnectBDD;
 
public class ProjetDialog implements Serializable {
 
    private Projet selectedProjet;
    private List<Client> selectedClients;
 
    public ProjetDialog() throws SQLException {
        selectedProjet = new Projet();
        selectedClients = new ArrayList();
        selectedClients = getClient();
    }
 
    public ProjetDialog(Projet pSelectedProjet) {
        selectedProjet = pSelectedProjet;
    }
    
    
    public Projet getSelectedProjet() {
        return selectedProjet;
    }

    public void setSelectedProjet(Projet selectedProjet) {
        this.selectedProjet = selectedProjet;
    }
    
    public List<Client> getClient() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.CLIENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES natural join projetannuel.PROJET natural join projetannuel.est_en_phase where Nom_Etape != 'clôture du projet'");
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
}