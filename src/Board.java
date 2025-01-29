import java.awt.Color;

public class Board {
    
    Property[][] properties = new Property[11][11];

    public Board(){
        Display.properties = properties;
        //first row
        properties[0][0] = new Property("Go", 0, 0, Color.BLACK, 0, "none");
        properties[1][0] = new Property("Mediterranean Avenue ", 60, 2,(new Color(100, 0, 0)), 50, "none");
        properties[2][0] = new Property("Community Chest", 0, 0, Color.BLACK, 0, "none");
        properties[3][0] = new Property("Baltic Avenue", 0, 0, (new Color(102, 51, 0)), 0, "none");
        properties[4][0] = new Property("Income Tax", 0, 0, Color.BLACK, 0, "none");
        properties[5][0] = new Property("Reading Railroad", 0, 0, Color.BLACK, 0, "none");
        properties[6][0] = new Property("Oriental Avenue", 0, 0, (new Color(0, 153, 204)), 0, "none");
        properties[7][0] = new Property("Chance", 0, 0, Color.BLACK, 0, "none");
        properties[8][0] = new Property("Vermont Avenue", 0, 0, (new Color(0, 153, 204)), 0, "none");
        properties[9][0] = new Property("Conneticut Avenue", 0, 0, (new Color(0, 153, 204)), 0, "none");
        properties[10][0] = new Property("Jail", 0, 0, Color.BLACK, 0, "none");
        
        properties[10][1] = new Property("St. Charles Place", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][2] = new Property("Electric Company ", 0, 0, Color.BLACK, 0, "none");
        properties[10][3] = new Property("States Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][4] = new Property("Virginia Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][5] = new Property("Pennsylvania Railroad", 0, 0, Color.BLACK, 0, "none");
        properties[10][6] = new Property("St. James Place", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][7] = new Property("Community Chest", 0, 0, Color.BLACK, 0, "none");
        properties[10][8] = new Property("Tenessee Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][9] = new Property("New York Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[10][10] = new Property("Free Parking", 0, 0, Color.BLACK, 0, "none");
        
        properties[10][10] = new Property("Kentucky Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[9][10] = new Property("Chance", 0, 0, Color.BLACK, 0, "none");
        properties[8][10] = new Property("Indiana Avenue", 0, 0,(new Color(75, 100, 150)), 0, "none");
        properties[7][10] = new Property("Illinois Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[6][10] = new Property("B&0 Railroad", 0, 0, Color.BLACK, 0, "none");
        properties[5][10] = new Property("Atlantic Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[4][10] = new Property("Ventor Avenue", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[3][10] = new Property("Water Works", 0, 0, Color.BLACK, 0, "none");
        properties[2][10] = new Property("Marvin Gardens", 0, 0, (new Color(75, 100, 150)), 0, "none");
        properties[1][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
        properties[0][10] = new Property("Go t0Jail", 0, 0, Color.BLACK, 0, "none");
       
   

        
    }
}
