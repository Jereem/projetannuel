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
public class Player {
    private String name;
    private String photo;
    private int number;
    private String position;
            
    public Player(String pname, int pnumber, String pphoto, String pposition){
        this.name = pname;
        this.photo = pphoto;
        this.number = pnumber;
        this.position = pposition;
    }
    
    
}
