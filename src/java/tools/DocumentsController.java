/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;


/**
 *
 * @author jeremygillet
 */
public class DocumentsController implements Serializable {
	
    private TreeNode root;
    private TreeNode selectedNode;
    public Calendar calendar = Calendar.getInstance();
    
	//admnistration ou projet
	public DocumentsController(String typeged) throws SQLException {
            
            root = new DefaultTreeNode("root", null);
           
            if (typeged=="administration"){
            
		
            TreeNode wiki = new DefaultTreeNode("WIKI", "Folder", root);
            TreeNode modeles = new DefaultTreeNode("MODELES" ,"Folder", root);
            
            TreeNode mod = new DefaultTreeNode("modeles des fiches d'adhesion", "Folder", modeles);
            TreeNode formul = new DefaultTreeNode("Formulaires CERFA", "Folder", modeles);
                
        int cal= calendar.get(Calendar.YEAR );
        TreeNode nomanne;
        String nomannee;
        TreeNode statuts;
        TreeNode pv;
        TreeNode autres;
        
        for (int i=2013;i<=cal;i++){
                nomannee=String.valueOf(i);
		nomanne= new DefaultTreeNode(nomannee, "Folder", root);
                statuts= new DefaultTreeNode("Statuts", "Folder", nomanne);
                pv= new DefaultTreeNode("PV d'assemble generale", "Folder", nomanne);
                autres= new DefaultTreeNode("Autres documents", "Folder", nomanne);    
        }	
              
		
		
                /*
		//Documents
		TreeNode expenses = new DefaultTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), work);
		TreeNode resume = new DefaultTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
		TreeNode refdoc = new DefaultTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
		
		//Pictures
		TreeNode barca = new DefaultTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
		TreeNode primelogo = new DefaultTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
		TreeNode optimus = new DefaultTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);
		
		//Music
		TreeNode turkish = new DefaultTreeNode(new Document("Turkish", "-", "Folder"), music);
		
		TreeNode cemKaraca = new DefaultTreeNode(new Document("Cem Karaca", "-", "Folder"), turkish);
		TreeNode erkinKoray = new DefaultTreeNode(new Document("Erkin Koray", "-", "Folder"), turkish);
		TreeNode mogollar = new DefaultTreeNode(new Document("Mogollar", "-", "Folder"), turkish);
		
		TreeNode nemalacak = new DefaultTreeNode("mp3", new Document("Nem Alacak Felek Benim", "1500 KB", "Audio File"), cemKaraca);
		TreeNode resimdeki = new DefaultTreeNode("mp3", new Document("Resimdeki Gozyaslari", "2400 KB", "Audio File"), cemKaraca);
		
		TreeNode copculer = new DefaultTreeNode("mp3", new Document("Copculer", "2351 KB", "Audio File"), erkinKoray);
		TreeNode oylebirgecer = new DefaultTreeNode("mp3", new Document("Oyle bir Gecer", "1794 KB", "Audio File"), erkinKoray);
		
		TreeNode toprakana = new DefaultTreeNode("mp3", new Document("Toprak Ana", "1536 KB", "Audio File"), mogollar);
		TreeNode bisiyapmali = new DefaultTreeNode("mp3", new Document("Bisi Yapmali", "2730 KB", "Audio File"), mogollar);
                        */
                
                
                 }
                 //arborescence projet
                 else
            {
             
            TreeNode modeles = new DefaultTreeNode("MODELES", "Folder", root);
            
            TreeNode facture = new DefaultTreeNode("FACTURE", "Folder", modeles);
            TreeNode devis = new DefaultTreeNode("DEVIS", "Folder", modeles);
            TreeNode cdc = new DefaultTreeNode("CAHIER DES CHARGES", "Folder", modeles);
            TreeNode cdconception = new DefaultTreeNode("CAHIER DE CONCEPTION", "Folder", modeles);
                
        int cal= calendar.get(Calendar.YEAR );
        TreeNode nomanne;
        String nomannee;
        TreeNode recueil_besoin;
        TreeNode facture_spe;
        TreeNode devis_spe;
        TreeNode cdc_spe;
        TreeNode cahier_conception_spe;
        TreeNode projet;
        
        
        
        for (int i=2013;i<=cal;i++){
                nomannee=String.valueOf(i);
		nomanne= new DefaultTreeNode(nomannee, "Folder", root);
                
                
                
                //get database connection
                ConnectBDD b = new ConnectBDD();
                Connection con = b.getMyConnexion();
                if (con == null) {
                throw new SQLException("Can't get database connection");
                 }
                PreparedStatement ps = con.prepareStatement("select Nom_Projet from projetannuel.Projet WHERE Projet.annee=i");
        
                ResultSet result = ps.executeQuery();
                String nom_projet;
                while (result.next()){
                nom_projet=result.getString("Nom_Projet");
                projet=new DefaultTreeNode(nom_projet, "Folder",nomanne );
             
                recueil_besoin= new DefaultTreeNode("RECUEIL DES BESOINS", "Folder", projet);
                facture_spe= new DefaultTreeNode("FACTURE", "Folder", projet);
                devis_spe= new DefaultTreeNode("DEVIS", "Folder", projet);
                cdc_spe= new DefaultTreeNode("CAHIER DES CHARGES", "Folder", projet);
                cahier_conception_spe= new DefaultTreeNode("CAHIER DE CONCEPTION", "Folder", projet);
                }
        }	
              
		
		
                /*
		//Documents
		TreeNode expenses = new DefaultTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), work);
		TreeNode resume = new DefaultTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
		TreeNode refdoc = new DefaultTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
		
		//Pictures
		TreeNode barca = new DefaultTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
		TreeNode primelogo = new DefaultTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
		TreeNode optimus = new DefaultTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);
		
		//Music
		TreeNode turkish = new DefaultTreeNode(new Document("Turkish", "-", "Folder"), music);
		
		TreeNode cemKaraca = new DefaultTreeNode(new Document("Cem Karaca", "-", "Folder"), turkish);
		TreeNode erkinKoray = new DefaultTreeNode(new Document("Erkin Koray", "-", "Folder"), turkish);
		TreeNode mogollar = new DefaultTreeNode(new Document("Mogollar", "-", "Folder"), turkish);
		
		TreeNode nemalacak = new DefaultTreeNode("mp3", new Document("Nem Alacak Felek Benim", "1500 KB", "Audio File"), cemKaraca);
		TreeNode resimdeki = new DefaultTreeNode("mp3", new Document("Resimdeki Gozyaslari", "2400 KB", "Audio File"), cemKaraca);
		
		TreeNode copculer = new DefaultTreeNode("mp3", new Document("Copculer", "2351 KB", "Audio File"), erkinKoray);
		TreeNode oylebirgecer = new DefaultTreeNode("mp3", new Document("Oyle bir Gecer", "1794 KB", "Audio File"), erkinKoray);
		
		TreeNode toprakana = new DefaultTreeNode("mp3", new Document("Toprak Ana", "1536 KB", "Audio File"), mogollar);
		TreeNode bisiyapmali = new DefaultTreeNode("mp3", new Document("Bisi Yapmali", "2730 KB", "Audio File"), mogollar);
                        */
                
                 
            }
                        
        }
	
       
	public TreeNode getRoot() {
		return root;
	}


    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public void deleteNode() {
        selectedNode.getChildren().clear();
        selectedNode.getParent().getChildren().remove(selectedNode);
        selectedNode.setParent(null);
        
        selectedNode = null;
    }
}
					