
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import java.lang.Math;
public class Player {

    private String name;
    private int money;
    private ArrayList<Property> properties = new ArrayList<Property>();
    private int location;

    public Player(String n){
        this.name = n;
        money = 1500;
        
        location = 0;
    }

    public void addMoney(int mAdd){
        money+=mAdd;
    }

    public String rollDice(){
        int d1 = (int)Math.ceil(Math.random()*6);
        int d2 = (int)Math.ceil(Math.random()*6);

        int roll = d1+d2;
        if((roll+location)%40<(roll+location)){
            money+=200;
        }
        location = (roll + location)%40;
        
        Monopoly.turn++;
                if(Monopoly.turn>3)
                Monopoly.turn = 0;
                Display.paymentDisplay.setText(" ");
                buyProperty();

        return (String.valueOf(roll));
    }

    public void buyProperty(){
        String g ="";
        if((Board.propertiesMap.get(location)).getOwner().equals("jail")){
            location = 10;
            System.out.println(name + " was sent to jail");
            Display.paymentDisplay.setText(g);
            Display.boardPanel.repaint();
            Display.frame.repaint();
        }
        else if((Board.propertiesMap.get(location)).getOwner().equals("none")&&Board.propertiesMap.get(location).getCost()<=money&&(Board.propertiesMap.get(location)).isBuyable()){
        properties.add(Board.propertiesMap.get(location));
        System.out.println(Board.propertiesMap.get(location).getName());
        money-=Board.propertiesMap.get(location).getCost();
        Board.propertiesMap.get(location).setOwner(name);

        
        }
        else if(!(Board.propertiesMap.get(location).getOwner().equals(name))&&Board.propertiesMap.get(location).isRentable()){
            money-= Board.propertiesMap.get(location).getRent();
            
            for(int i =0; i<Monopoly.allPlayers.size();i++){
                if((Monopoly.allPlayers.get(i).getName().equals(Board.propertiesMap.get(location).getOwner()))){
                    Monopoly.allPlayers.get(i).money+=Board.propertiesMap.get(location).getRent();
                    System.out.print(Monopoly.allPlayers.get(i).getName() + " got paid $" + Board.propertiesMap.get(location).getRent() + " by " + name + " at ");
                    g+=Monopoly.allPlayers.get(i).getName() + " got paid $" + Board.propertiesMap.get(location).getRent() + " by " + name + " at ";
                }

            }
            System.out.println(Board.propertiesMap.get(location).getName()+ " | ");
            g+=Board.propertiesMap.get(location).getName();
            
            Display.paymentDisplay.setText(g);
            Display.boardPanel.repaint();
            Display.frame.repaint();
            

        }
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
