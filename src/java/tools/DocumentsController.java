/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;


import java.io.Serializable;


import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;


/**
 *
 * @author jeremygillet
 */
public class DocumentsController implements Serializable {
	
	private TreeNode root;

    private TreeNode selectedNode;
	
	public DocumentsController() {
		root = new DefaultTreeNode("root", null);
		
		TreeNode documents = new DefaultTreeNode("Documents", "Folder", root);
		TreeNode pictures = new DefaultTreeNode("Pictures" ,"Folder", root);
		TreeNode music = new DefaultTreeNode("Music", "Folder", root);
		
		TreeNode work = new DefaultTreeNode("Work", "Folder", documents);
		TreeNode primefaces = new DefaultTreeNode("PrimeFaces", "Folder", documents);
		
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
					