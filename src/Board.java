import java.awt.Color;

public class Board {
    
    Property[][] properties = new Property[11][11];

    public Board(){

        




        Display.properties = properties;
        //first row
        properties[0][0] = new Property("Go", 0, 0, Color.BLACK, 0, "none");
        properties[1][0] = new Property("Mediterr... Avenue ", 60, 2,(new Color(102, 51, 0)), 50, "none");
        properties[2][0] = new Property("Community Chest", 0, 0, Color.BLACK, 0, "none");
        properties[3][0] = new Property("Baltic Avenue", 60, 4, (new Color(102, 51, 0)), 50, "none");
        properties[4][0] = new Property("Income Tax", 0, 0, Color.BLACK, 0, "none");
        properties[5][0] = new Property("Reading Railroad", 200, 25, Color.BLACK, 0, "none");
        properties[6][0] = new Property("Oriental Avenue", 100, 6, (new Color(0, 180, 250)), 50, "none");
        properties[7][0] = new Property("Chance", 0, 0, Color.BLACK, 0, "none");
        properties[8][0] = new Property("Vermont Avenue", 100, 6, (new Color(0, 180, 250)), 50, "none");
        properties[9][0] = new Property("Conneticut Avenue", 120, 8, (new Color(0, 180, 250)), 50, "none");
        properties[10][0] = new Property("Jail", 0, 0, Color.BLACK, 0, "none");
        
        properties[10][1] = new Property("St. Charles Place", 140, 10, (new Color(204, 68, 204)), 100, "none");
        properties[10][2] = new Property("Electric Company ", 150, 0, Color.BLACK, 0, "none"); // rent = 2x dice
        properties[10][3] = new Property("States Avenue", 140, 10, (new Color(204, 68, 204)), 100, "none");
        properties[10][4] = new Property("Virginia Avenue", 160, 12, (new Color(204, 68, 204)), 100, "none");
        properties[10][5] = new Property("Pennsylvania Railroad", 200, 25, Color.BLACK, 0, "none");
        properties[10][6] = new Property("St. James Place", 180, 14, (new Color(255, 110, 0)), 100, "none"); 
        properties[10][7] = new Property("Community Chest", 0, 0, Color.BLACK, 0, "none");
        properties[10][8] = new Property("Tenessee Avenue", 180, 14, (new Color(255, 110, 0)), 100, "none"); 
        properties[10][9] = new Property("New York Avenue", 200, 16, (new Color(255, 110, 0)), 100, "none"); 
        properties[10][10] = new Property("Free Parking", 0, 0, Color.BLACK, 0, "none");
        
        properties[9][10] = new Property("Kentucky Avenue", 220, 18, (new Color(255, 0, 0)), 150, "none");
        properties[8][10] = new Property("Chance", 0, 0, Color.BLACK, 0, "none");
        properties[7][10] = new Property("Indiana Avenue", 220, 18,(new Color(255, 0, 0)), 150, "none");
        properties[6][10] = new Property("Illinois Avenue", 240, 20, (new Color(255, 0, 0)), 150, "none");
        properties[5][10] = new Property("B&0 Railroad", 200, 25, Color.BLACK, 0, "none");
        properties[4][10] = new Property("Atlantic Avenue", 260, 22, (new Color(255, 255, 51)), 150, "none");
        properties[3][10] = new Property("Ventor Avenue", 260, 22, (new Color(255, 255, 51)), 150, "none");
        properties[2][10] = new Property("Water Works", 150, 0, Color.BLACK, 0, "none"); //2x dice for rent
        properties[1][10] = new Property("Marvin Gardens", 280, 24, (new Color(255, 255, 51)), 150, "none");
        properties[0][10] = new Property("Go to Jail", 0, 0, Color.BLACK, 0, "none");
        
        properties[0][9] = new Property("Pacific Avenue", 300, 26, (new Color(51, 153, 51)), 200, "none");
        properties[0][8] = new Property("North Carolina Avenue", 300, 26, (new Color(51, 153, 51)), 200, "none");
        properties[0][7] = new Property("Community Chest", 0, 0, Color.BLACK, 0, "none");
        properties[0][6] = new Property("Pennsylvania Avenue", 320, 28, (new Color(51, 153, 51)), 200, "none");
        properties[0][5] = new Property("Short Line Railroad", 200, 25, Color.BLACK, 0, "none");
        properties[0][4] = new Property("Chance", 0, 0, Color.BLACK, 0, "none");
        properties[0][3] = new Property("Park Place", 350, 35, (new Color(0, 0, 204)), 200, "none");
        properties[0][2] = new Property("Luxury Tax", 0, 0, Color.BLACK, 0, "none");
        properties[0][1] = new Property("Boardwalk", 400, 50, (new Color(0, 0, 204)), 200, "none");
        
       
   

        
    }
}
