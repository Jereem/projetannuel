/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

/**
 *
 * @author jeremygillet
 */

 
import java.io.Serializable;
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
 
@ManagedBean(name="tMB")
@SessionScoped 
public class DocumentsControllert implements Serializable {
 
    private TreeNode root;
 
    public DocumentsControllert() {
        root = new DefaultTreeNode("root", null);
 
     
	        TreeNode node = new DefaultTreeNode("List","folder", root);  
		TreeNode node0 = new DefaultTreeNode("Provider", node);  
	        TreeNode node1 = new DefaultTreeNode("RNC", node);  
	        TreeNode node2 = new DefaultTreeNode("WBTS", node);  
	        TreeNode node3 = new DefaultTreeNode("CGI", node);  
	        TreeNode node4 = new DefaultTreeNode("CI", node);   
	        TreeNode node5 = new DefaultTreeNode("NomCell", node);  
	        TreeNode node6 = new DefaultTreeNode("Label", node);  
	        TreeNode node7 = new DefaultTreeNode("Frequency_Band", node);  
	        TreeNode node8 = new DefaultTreeNode("RAC", node);  
	        TreeNode node9 = new DefaultTreeNode("LAC", node);  
	        TreeNode node10 = new DefaultTreeNode("NetworkId", node);
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
