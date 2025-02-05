import javax.swing.SwingUtilities;
import java.lang.Thread;
import java.util.ArrayList;
import java.io.*;

public class Monopoly {

    static int turn = 0;
    static ArrayList<Player> allPlayers = new ArrayList<Player>();

    
    public static void main(String[] args)   {

        Board b = new Board();
       
        Player Russell = new Player("Russell");
        Display.players.add(Russell);
        allPlayers.add(Russell);
        Player Rachel = new Player("Rachel");
        Display.players.add(Rachel);
        allPlayers.add(Rachel);
        Player Jasiah = new Player("Jasiah");
        Display.players.add(Jasiah);
        allPlayers.add(Jasiah);
        Player Tyler = new Player("Tyler");
        Display.players.add(Tyler);
        allPlayers.add(Tyler);

        SwingUtilities.invokeLater(() -> Display.setupFrame());
        
        

       

        
        
        
        
        //Graphics!
        
    }
    
    
}
