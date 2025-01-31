import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {

        Board b = new Board();
        Player Russell = new Player("Russell");
        Display.players.add(Russell);
        Player Rachel = new Player("Rachel");
        Display.players.add(Rachel);
        Player Jasiah = new Player("Jasiah");
        Display.players.add(Jasiah);
        Player Tyler = new Player("Tyler");
        Display.players.add(Tyler);
        
        
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
