
import java.util.ArrayList;
import java.lang.Math;

public class Player {


    String name;
    int money;
    ArrayList<Property> properties = new ArrayList<Property>();
    int location;

    public Player(String n){
        name = n;
        money = 1500;
        if(name.equals("Jasiah")){
            money-=1500;
        }
        if(name.equals("Tyler")){
            money-=4000;
        }
        location = 0;
    }
    
    public String rollDice(){
        int d1 = (int)Math.ceil(Math.random()*6);
        int d2 = (int)Math.ceil(Math.random()*6);

        int roll = d1+d2;
        if((roll+location)%40<(roll+location)){
            money+=200;
        }
        location = (roll + location)%40;
        
        return (String.valueOf(roll));
    }

    //TODO FIX
    public String getName(){
        return name;
    }

    ///TODO FIX
    public int getMoney(){
        return money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return properties;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }
}
