import javax.swing.SwingUtilities;
import java.lang.Thread;
import java.io.*;

public class Monopoly {
    public static void main(String[] args)   {

        Board b = new Board();
        Player Russell = new Player("Russell");
        Display.players.add(Russell);
        Player Rachel = new Player("Rachel");
        Display.players.add(Rachel);
        Player Jasiah = new Player("Jasiah");
        Display.players.add(Jasiah);
        Player Tyler = new Player("Tyler");
        Display.players.add(Tyler);

        SwingUtilities.invokeLater(() -> Display.setupFrame());
        Display.setDiceDisplay(Russell.rollDice());
        Display.boardPanel.repaint();
        

        
        
        
        //Graphics!
        
    }
}
