/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Client;
import beans.Coordonnees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tools.ConnectBDD;


@ManagedBean(name="clientM")
@SessionScoped
/**
 *
 * @author teddy
 */
public class ClientManaged {
     private Client selectedClient;

    public ClientManaged() {
        this.selectedClient = new Client();
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }
}
