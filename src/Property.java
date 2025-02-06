
import java.awt.Color;

public class Property {
    
    Color color;
    String name;
    String owner;
    int numHouses;
    int cost;
    int rent;
    int houseCost;
    

    
    public Property(String n, int cB, int r, Color c, int cH, String o){
            color = c;
            name = n;
           owner = "none";
            numHouses = 0;
            cost = cB;
            rent = r;
            int houseCost = cH;

    }
//eventually have an addhouses method

    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return numHouses;
        // if numhouses = 1 rentx2
        //if =2 ; rentx3
    }

    //TODO fix
    public String getOwner(){
        return owner;
    }

    //TODO fix
    public int getRent(){
        return rent;
        // if numhouses = 1 rentx2
        //if =2 ; rentx3
    }
    
}
