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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean
@RequestScoped

public class TreeBean {

    private TreeNode root_admin;
    private TreeNode root_projet;

    public TreeBean() throws SQLException {
        root_admin = new DefaultTreeNode("Root", null);
        root_projet = new DefaultTreeNode("Root", null);

        Calendar calendar = Calendar.getInstance();
        

            TreeNode wiki = new DefaultTreeNode("WIKI", root_admin);
            addDocument2Noeud(wiki,"wiki");

            TreeNode modeles_ad = new DefaultTreeNode("MODELES", root_admin);

            TreeNode mod = new DefaultTreeNode("modeles des fiches d'adhesion", modeles_ad);
            //addDocument2Noeud(mod, "modeles_adhesion");

            TreeNode formul = new DefaultTreeNode("Formulaires CERFA", modeles_ad);
            // addDocument2Noeud(formul, "cerfa");

            
            int cal = calendar.get(Calendar.YEAR);
            TreeNode nomanne;
            String nomannee;
            TreeNode statuts;
            TreeNode pv;
            TreeNode autres;

            for (int i = 2012; i <= cal; i++) {
                nomannee = String.valueOf(i);
                nomanne = new DefaultTreeNode(nomannee, root_admin);
                statuts = new DefaultTreeNode("Statuts", nomanne);
                // addDocument2Noeud(mod, i, "modeles_adhesion");
                pv = new DefaultTreeNode("PV d'assemble generale", nomanne);
                // addDocument2Noeud(mod, i, "modeles_adhesion");
                autres = new DefaultTreeNode("Autres documents", nomanne);
                // addDocument2Noeud(mod, i, "modeles_adhesion");
            }
    
            
            TreeNode modeles = new DefaultTreeNode("MODELES", root_projet);

            TreeNode facture = new DefaultTreeNode("FACTURE", modeles);
            TreeNode devis = new DefaultTreeNode("DEVIS", modeles);
            TreeNode cdc = new DefaultTreeNode("CAHIER DES CHARGES", modeles);
            TreeNode cdconception = new DefaultTreeNode("CAHIER DE CONCEPTION", modeles);
            
            
            TreeNode nomAnne;
            String nomAnnee;
            TreeNode recueil_besoin;
            TreeNode facture_spe;
            TreeNode devis_spe;
            TreeNode cdc_spe;
            TreeNode cahier_conception_spe;
            TreeNode projet;

            for (int j = 2012; j <= cal; j++) {
                nomAnnee = String.valueOf(j);
                nomAnne = new DefaultTreeNode(nomAnnee, root_projet);
                //get database connection
                ConnectBDD b = new ConnectBDD();
                Connection con = b.getMyConnexion();
                if (con == null) {
                    throw new SQLException("Can't get database connection");
                }
               // PreparedStatement ps = con.prepareStatement("SELECT MIN(document.ANNEE) AS annee,Id_Projet, Nom_Projet FROM projetannuel.PROJET NATURAL JOIN projetannuel.DOCUMENT  WHERE DOCUMENT.Annee=" + j + " GROUP BY Id_Projet HAVING annee = "+ j +" ORDER BY Nom_Projet ;");
                  PreparedStatement ps = con.prepareStatement("SELECT document.ANNEE AS annee,Id_Projet, Nom_Projet FROM projetannuel.PROJET NATURAL JOIN projetannuel.DOCUMENT   GROUP BY Id_Projet HAVING MIN(ANNEE)="+ j + " ORDER BY Nom_Projet;");
                ResultSet result = ps.executeQuery();
                String nom_projet;

                while (result.next()) {
                    nom_projet = result.getString("Nom_Projet");
                    projet = new DefaultTreeNode(nom_projet, nomAnne);

                    recueil_besoin = new DefaultTreeNode("RECUEIL DES BESOINS", projet);
                    facture_spe = new DefaultTreeNode("FACTURE", projet);
                    devis_spe = new DefaultTreeNode("DEVIS", projet);
                    cdc_spe = new DefaultTreeNode("CAHIER DES CHARGES", projet);
                    cahier_conception_spe = new DefaultTreeNode("CAHIER DE CONCEPTION", projet);
                }
            }

        
    }

    public TreeNode getRoot_admin() {
        return root_admin;
    }
     public TreeNode getRoot_projet() {
        return root_projet;
    }

   /**
     *
     * @param noeud_pere
     * @param typ
     */
    public void addDocument2Noeud(TreeNode noeud_pere, String typ) throws SQLException{
                String type=typ;
                //get database connection
                ConnectBDD b = new ConnectBDD();
                Connection con = b.getMyConnexion();
                if (con == null) {
                throw new SQLException("Can't get database connection");
                 }
                
                PreparedStatement ps = con.prepareStatement("SELECT Id_Document, Nom_Document,Valeur FROM DOCUMENT NATURAL JOIN DEPEND WHERE Depend.Id_Metadata=1 AND Valeur ='"+ type +"' ;");    
                ResultSet result = ps.executeQuery();
                
                String res=null;
                TreeNode new_node=null;
                while (result.next()){
               
                res=result.getString("Nom_Document");
                new_node=new DefaultTreeNode(res, noeud_pere);         
                }  
                
                
    }
    

    public void addDocument2Noeud(TreeNode noeud_pere, int annee, String type) throws SQLException {

        //get database connection
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps = con.prepareStatement("SELECT Id_Document, Nom_Document FROM DOCUMENT NATURAL JOIN DEPEND NATURAL JOIN META_DATA WHERE META_DATA.Nom_metadata='Type' AND Depend.Valeur=" + type + " AND DOCUMENT.Anne=" + annee + " ;");
        
        ResultSet result = ps.executeQuery();
        String res = null;
        TreeNode new_node = null;
        while (result.next()) {
            res = result.getString("Nom_Document");
            new_node = new DefaultTreeNode(res, "Document", noeud_pere);
        }
    }
}				