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
import beans.Projet;
import java.io.Serializable;
 
public class ProjetDialog implements Serializable {
 
    private Projet selectedProjet;
 
    public ProjetDialog() {
        selectedProjet = new Projet();
    }

    public Projet getSelectedProjet() {
        return selectedProjet;
    }

    public void setSelectedProjet(Projet selectedProjet) {
        this.selectedProjet = selectedProjet;
    }
    
}