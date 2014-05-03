/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.util.List;
import java.util.Map;

/**
 *
 * @author jeremygillet
 */
public abstract class Dialog {
    
    /**
* Open a view in dialog.
* @param outcome The logical outcome used to resolve a navigation case.
*/
public abstract void openDialog(String outcome);
/**
* Open a view in dialog.
* @param outcome The logical outcome used to resolve a navigation case.
* @param options Configuration options for the dialog.
* @param params Parameters to send to the view displayed in a dialog.
*/
public abstract void openDialog(String outcome, Map<String,Object> options,
Map<String,List<String>> params);
/**
* Close a dialog.
* @param data Optional data to pass back to a dialogReturn event.
*/
public abstract void closeDialog(Object data);
}
