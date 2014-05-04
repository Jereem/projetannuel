package beans;

import java.util.ArrayList;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import org.primefaces.event.SelectEvent;
import tools.ConnectBDD;

public class Projet implements Serializable {

    private int ID;
    private Client client;
    private ArrayList<Etudiant> devellopeurs;
    private String nomProjet;
    private ArrayList<Documents> documents;
    private BureauProGphy chefDeProjet;
    private BureauProGphy commercial;
    private Documents selectedDocument;
    private int progression;

    public Projet() {
        this.nomProjet = "New project";
        this.documents = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Documents getSelectedDocument() {
        return selectedDocument;
    }

    public void setSelectedDocument(Documents selectedDocument) {
        this.selectedDocument = selectedDocument;
    }

    public String getDoc() {
        Iterator<Documents> it = documents.iterator();

        while (it.hasNext()) {
            Documents s = it.next();
        }
        return "success";
    }

    public BureauProGphy getChefDeProjet() {
        return chefDeProjet;
    }

    public void setChefDeProjet(BureauProGphy chefDeProjet) {
        this.chefDeProjet = chefDeProjet;
    }

    public BureauProGphy getCommercial() {
        return commercial;
    }

    public void setCommercial(BureauProGphy commercial) {
        this.commercial = commercial;
    }

    public Client getClient() {
        return this.client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Etudiant> getDevellopeurs() {
        return this.devellopeurs;
    }

    /**
     *
     * @param devellopeurs
     */
    public void setDevellopeurs(ArrayList<Etudiant> devellopeurs) {
        this.devellopeurs = devellopeurs;
    }

    public String getNomProjet() {
        return this.nomProjet;
    }

    /**
     *
     * @param nomProjet
     */
    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    /**
     *
     * @param etudiant
     */
    public void addEtudiant(Etudiant etudiant) {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param etudiant
     */
    public void delEtudiant(Etudiant etudiant) {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Documents> documents) {
        this.documents = documents;
    }


    /**
     *
     * @param document
     */
    public void addDocument(Documents document) {
        this.documents.add(document);
    }

    /**
     *
     * @param document
     */
    public void delDocument(Documents document) {
    }

    public void onProjectChosen(SelectEvent event) {
        Projet projet = (Projet) event.getObject();
    }

    public int getProgression() {
        return progression;
    }

    public void setProgression(int progression) {
        this.progression = progression;
    }

    

//        //methode surchargée qui prend en paramètre un boolean actif
//      public List<BureauProGphy> getProjet(Boolean actif) throws SQLException {
//        //get database connection
//        ConnectBDD b = new ConnectBDD();
//        Connection con = b.getMyConnexion();
//        if (con == null) {
//            throw new SQLException("Can't get database connection");
//        }
//        PreparedStatement ps;
//        if (actif==true)
//        {
//         ps= con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=1");
//        }
//        else
//        {
//         ps = con.prepareStatement("select Identifiant, Mot_de_passe, Actif from MEMBRE_BUREAU WHERE Actif=0");
//        }
//        /*actif=false*/    
//        //get customer data from database
//        ResultSet result = ps.executeQuery();
//        List<BureauProGphy> list = new ArrayList<>();
//        while (result.next()) {
//            BureauProGphy membre = new BureauProGphy();
//            membre.setIdentifiant(result.getString("Identifiant"));
//            membre.setMdp(result.getString("Mot_de_passe"));
//            //membre.setPoste(result.getString("Poste"));
//            membre.setActif(result.getBoolean("Actif"));
//            //store all data into a List
//            list.add(membre);
//        }
//        return list;
//    }
}
