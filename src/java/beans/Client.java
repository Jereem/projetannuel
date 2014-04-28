package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean
@RequestScoped

public class Client extends Personne implements Serializable{

	private String societe;
	private long siren;
	private String qualite;

	public Client() {
		this.societe = "NewSociete";
	}

	public String getSociete() {
		return this.societe;
	}

	/**
	 * 
	 * @param societe
	 */
	public void setSociete(String societe) {
		this.societe = societe;
	}

	public long getSiren() {
		return this.siren;
	}

	/**
	 * 
	 * @param siren
	 */
	public void setSiren(long siren) {
		this.siren = siren;
	}

	public String getPoste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qualite
	 */
	public void setPoste(String qualite) {
		throw new UnsupportedOperationException();
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
            coordonnes.seteMail(result.getString("Email"));
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
            coordonnes.seteMail(result.getString("Email"));
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