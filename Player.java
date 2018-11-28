import java.util.*;
public class Player
{
    ArrayList<CardTemplate> Hand = new ArrayList<CardTemplate>();
    String name = "player1";
    void showHand(){
        System.out.println("your hand is: ");
        for(CardTemplate c: Hand){
            
            System.out.println(c.rank + " of " + c.suit);
        }
    }

    void gainCard(CardTemplate i){
        Hand.add(i);
    }

    int add(){
        int HandVal = 0;
        boolean acePresent = false;
        for(CardTemplate x: Hand){
            if(x.rank <=10){
                HandVal = HandVal+x.rank;
            }else{
                HandVal = HandVal+10;
            }
            if(x.rank == 1){
                acePresent = true;
            }
            if(HandVal<=11 && acePresent == true){
                HandVal = HandVal+10;
            }
        }
        return HandVal;
    }
}
