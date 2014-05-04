package beans;

import java.util.ArrayList;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;

@ManagedBean
@RequestScoped

public class Documents implements Serializable{

	private String nomDoc;
	private String typeDoc;
	private ArrayList<MetaData> listMetaData;
	private String emplacement;
	private BureauProGphy auteur;
        private Projet projet;
	private int annee;

	public Documents() {
		
	}

        public Documents(String nomDoc) {
		this.nomDoc = nomDoc;
	}

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
        
	public String getNomDoc() {
		return this.nomDoc;
	}

	/**
	 * 
	 * @param nomDoc
	 */
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getTypeDoc() {
		return this.typeDoc;
	}

	/**
	 * 
	 * @param typeDoc
	 */
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public ArrayList<MetaData> getListMetaData() {
		return this.listMetaData;
	}

	/**
	 * 
	 * @param listMetaData
	 */
	public void setListMetaData(ArrayList<MetaData> listMetaData) {
		this.listMetaData = listMetaData;
	}

	/**
	 * 
	 * @param metaData
	 */
	public void addMetaData(MetaData metaData) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param metaData
	 */
	public void delMetaData(MetaData metaData) {
		throw new UnsupportedOperationException();
	}

	public String getEmplacement() {
		return this.emplacement;
	}

	/**
	 * 
	 * @param emplacement
	 */
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public BureauProGphy getAuteur() {
		return this.auteur;
	}

	/**
	 * 
	 * @param auteur
	 */
	public void setAuteur(BureauProGphy auteur) {
		this.auteur = auteur;
	}

	public int getAnnee() {
		return this.annee;
	}

	/**
	 * 
	 * @param annee
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
        
        /**
	 * 
	 * @param annee
         * @param type
         * @param projet
     * @return 
	 */
        public Documents recupDocuments(String type,int annee,String projet){
            Documents doc = null;
            
            
            
            
            return doc;
        }

        /**
	 * 
	 * @param annee
     * @return 
	 */
        public Documents recupDocuments(int annee){
            Documents doc = null;
            
            
            
            
            return doc;
        }
        
         /**
	 * 
     * @param projet
     * @return 
	 */
         public Documents recupDocuments(String projet){
            Documents doc = null;
            
            
            
            
            return doc;
        }
        
          /**
	 * 
     * @param projet
     * @param type
     * @return 
	 */
         public Documents recupDocuments(String projet,String type){
            Documents doc = null;
            
            
            
            
            return doc;
        }
         
    public void saveDocument(Documents myDoc, int id_projet, String Identifiant) throws SQLException {
        ConnectBDD b = new ConnectBDD();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
           String paramnom=myDoc.nomDoc;
           String paramext=myDoc.typeDoc;//extension 
           int paramannee=myDoc.annee;
           String paramemplacement=myDoc.getEmplacement(); //emplacement
           int paramidprojet=myDoc.projet.getID();//id projet
           String paramidentifiant=myDoc.auteur.getIdentifiant(); //identifiant
          
           b.getMyStatement().executeUpdate("INSERT INTO DOCUMENT ('Nom_Document','Extension','Annee','Emplacement','Id_Projet','Identifiant') VALUES (paramnom,paramext,paramannee,paramemplacement,paramidentifiant)");
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
