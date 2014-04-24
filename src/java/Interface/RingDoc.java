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
import beans.Documents;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
public class RingDoc implements Serializable {
 
    private List<Documents> doc;
 
    private Documents selectedDoc;
 
    public RingDoc() {
        doc = new ArrayList<Documents>();
 
        doc.add(new Documents("Devis"));
        doc.add(new Documents("CDC"));
        doc.add(new Documents("Cahier de conception"));
        doc.add(new Documents("Javadoc"));
        doc.add(new Documents("Facture"));
        doc.add(new Documents("BL"));
    }

    public List<Documents> getDoc() {
        return doc;
    }

    public void setDoc(List<Documents> doc) {
        this.doc = doc;
    }

    public Documents getSelectedDoc() {
        return selectedDoc;
    }

    public void setSelectedDoc(Documents selectedDoc) {
        this.selectedDoc = selectedDoc;
    }
 
    
}