/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;
import java.io.InputStream;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
/**
 *
 * @author jeremygillet
 */
public class FileDownloadController {

	private StreamedContent file;
	
	public FileDownloadController() {        
        InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/images/optimusprime.jpg");
		file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
	}

    public StreamedContent getFile() {
        return file;
    }  
}
