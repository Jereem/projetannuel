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
import beans.Projet;
import java.io.Serializable;
import java.util.List;
 
public class ProjetDialog implements Serializable {
 
    private Projet selectedProjet;
 
    public ProjetDialog() {
    }

    public Projet getSelectedProjet() {
        return selectedProjet;
    }

    public void setSelectedProjet(Projet selectedProjet) {
        this.selectedProjet = selectedProjet;
    }
    
}