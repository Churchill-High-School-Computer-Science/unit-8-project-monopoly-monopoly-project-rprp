
import java.awt.Color;

public class Property {
    
    private Color color;
    private String name;
    private String owner;
    
   private int numHouses;
    private int cost;
    private int rent;
    private int houseCost;
    private boolean buyable;
    private boolean rentable;
    

    
    public Property(String n, int cB, int r, Color c, int cH, String o,boolean buyable,boolean rentable){
            color = c;
            name = n;
            owner = o;
            numHouses = 0;
            cost = cB;
            rent = r;
            int houseCost = cH;
            this.buyable = buyable;
            this.rentable = rentable;
            

    }
//eventually have an addhouses method

    //TODO fix
    public Color getColor(){
        return color;
    }

    public int getCost(){
        return cost;
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

    public boolean isBuyable(){
        return buyable;
    }

    public boolean isRentable(){
        return rentable;
    }

    public void setOwner(String o){
        owner=o;
        
    }

    //TODO fix
    public int getRent(){
        return rent;
        // if numhouses = 1 rentx2
        //if =2 ; rentx3
    }
    
}
