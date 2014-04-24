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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RingBean implements Serializable {

    private List<Player> players;

    private Player selectedPlayer;

    public RingBean() {
        players = new ArrayList<Player>();

        players.add(new Player("Messi", 10, "messi.jpg", "CF"));
        players.add(new Player("Bojan", 9, "bojan.jpg", "CF"));
        players.add(new Player("Iniesta", 8, "iniesta.jpg", "CM"));
        players.add(new Player("Villa", 7, "villa.jpg", "CF"));
        players.add(new Player("Xavi", 6, "xavi.jpg", "CM"));
        players.add(new Player("Puyol", 5, "puyol.jpg", "CB"));
    }
        
    public List<Player> getPlayers() {
        return players;
    }

    public Player getSelectedPlayer() {
        return selectedPlayer;
    }

    public void setSelectedPlayer(Player selectedPlayer) {
        this.selectedPlayer = selectedPlayer;
    }
}
