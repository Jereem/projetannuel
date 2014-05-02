package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import tools.ConnectBDD;
import tools.Tools;

@ManagedBean
@RequestScoped

public class Etudiant extends Personne implements Serializable {

    private ArrayList<Integer> anneesAdherant;
    @NotNull ( message = "Veuillez saisir un numéro à 13 chiffres" )
    @Digits (integer = 15, fraction = 1, message = "Veuillez saisir un numéro à 15 chiffres")
    private long numeroSS;
    private ArrayList<Competences> listeCompetences;
    @NotNull ( message = "Veuillez saisir une date de naissance" )
    @Pattern(regexp = "^(\\d\\d)\\/(\\d\\d)\\/(\\d\\d)$", message = "Merci de saisir une date valide (jj/mm/aa)")
    private Date dateNaissance;
    private boolean AJourCotisation;
    @NotNull ( message = "Veuillez saisir une année de promotion" )
    @Min(2013)
    @Max(2099)
    private int promotion;

    //Getter and Setter
    public ArrayList<Integer> getAnneesAdherant() {
        return anneesAdherant;
    }

    public void setAnneesAdherant(ArrayList<Integer> anneesAdherant) {
        this.anneesAdherant = anneesAdherant;
    }

    public long getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(long numeroSS) {
        this.numeroSS = numeroSS;
    }


    public ArrayList<Competences> getListeCompetences() {
        return listeCompetences;
    }

    public void setListeCompetences(ArrayList<Competences> listeCompetences) {
        this.listeCompetences = listeCompetences;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isAJourCotisation() {
        return AJourCotisation;
    }

    public void setAJourCotisation(boolean AJourCotisation) {
        this.AJourCotisation = AJourCotisation;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
    
    
    @Override
    public Titres getTitre(){
         return super.getTitre();
    }
    
    // Methodes
    
    /**
     *
     * @param annee
     */
    public void addAnneeAdherent(int annee) {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param annee
     */
    public void delAnneeAdherent(int annee) {
        throw new UnsupportedOperationException();
    }

    // Methodes pour sauvegarder dans la BDD
    public String saveNewAdherent() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramTitre = this.getTitresString().toString();
            String paramNom = this.getNom();
            String paramPrenom = this.getPrenom();
            long paramNumeroSS = this.getNumeroSS();
            Date javaDateNaissance=this.getDateNaissance();
            Tools tls= new Tools();
            String paramdateNaissance = tls.dateJavaToSQL(javaDateNaissance);          
            int paramNumRue = this.getCoordonnees().getNumRue();
            String paramTypeVoie = this.getCoordonnees().getVoiesString();
            String paramNomRue = this.getCoordonnees().getRue();
            String paramCP = this.getCoordonnees().getCodePostal();
            String paramVille = this.getCoordonnees().getVille();
            String paramPays = this.getCoordonnees().getPays();
            String paramEmail = this.getCoordonnees().geteMail();
            int paramTelFixe = this.getCoordonnees().getTelFixe();
            int paramTelMobile = this.getCoordonnees().getTelPortable();
            int paramPromo = this.getPromotion();
		 
            /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
           /* b.getMyStatement().executeUpdate(""
                    + "INSERT INTO PERSONNE(Titre, Nom_Personne, Prenom_Personne) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + "); "
                    + "SELECT @last:=LAST_INSERT_ID(); "
                    + "INSERT INTO ADHERENT (Id_Personne, Numero_SS, Date_Naissance, Promotion) VALUES (@last, " + paramNumeroSS + "," + paramdateNaissance + "," + paramPromo + "); "
                    + "INSERT INTO coordonnees (Id_Personne, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (@last," + paramEmail + "," + paramNomRue + "," + paramNumRue + "," + paramTypeVoie +"," + paramVille +"," + paramCP +"," + paramPays +"," + paramTelFixe +"," + paramTelMobile +");");
            System.out.println("je fais des requetes");
            */
            b.getMyStatement().executeUpdate("INSERT INTO PERSONNE(Titre, Nom_Personne, Prenom_Personne) VALUES (" + paramTitre + "," + paramNom + "," + paramPrenom + ")");
            b.getMyStatement().executeQuery("SELECT @last:=LAST_INSERT_ID()");
            b.getMyStatement().executeUpdate("INSERT INTO ADHERENT (Id_Personne, Numero_SS, Date_Naissance, Promotion) VALUES (@last, \" + paramNumeroSS + \",\" + paramdateNaissance + \",\" + paramPromo + \")");
            b.getMyStatement().executeUpdate("INSERT INTO coordonnees (Id_Personne, Email, Rue ,Numero_De_Rue, Type_Voie, Ville, Code_Postal, Pays, Telephone_1, Telephone_2) VALUES (@last," + paramEmail + "," + paramNomRue + "," + paramNumRue + "," + paramTypeVoie +"," + paramVille +"," + paramCP +"," + paramPays +"," + paramTelFixe +"," + paramTelMobile +")");
            
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
    
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
            coordonnes.seteMail(result.getString("Email"));
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
    
    public List<Etudiant> getOldAdherent() throws SQLException {
        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from projetannuel.ADHERENT natural join projetannuel.PERSONNE natural join projetannuel.COORDONNEES where A_Jour_Cotisation = 0");
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
//            System.out.println(adherent.getNom());
//            System.out.println("test");
            //store all data into a List
            list.add(adherent);
        }
//        System.out.println(list);
        return list;
    }

    public String delAdherent () throws SQLException{
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramNom = this.getNom();
            String paramPrenom = this.getPrenom();
	
        /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
        b.getMyStatement().executeUpdate(""
                + "DELETE FROM PERSONNE where Nom_Personne=’"+paramNom+"’ AND Prenom_Personne=’"+paramPrenom+"’");
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
