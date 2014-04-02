/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Audrey
 */
public class UserWizard {

	private User user = new User();
	
	private boolean skip;
	
	private static Logger logger = Logger.getLogger(UserWizard.class.getName());

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void save(ActionEvent actionEvent) {
		//Persist user
		
		//FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getFirstname());
		//FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}
	
	public String onFlowProcess(FlowEvent event) {
		logger.info("Current wizard step:" + event.getOldStep());
		logger.info("Next step:" + event.getNewStep());
		
		if(skip) {
			skip = false;	//reset in case user goes back
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}
}
                    
