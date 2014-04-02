/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author jeremygillet
 */




public class Upload{

    public void Upload(FileUploadEvent event) {
		FacesMessage msg = new FacesMessage("Succès", event.getFile().getFileName() + " est chargé.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}