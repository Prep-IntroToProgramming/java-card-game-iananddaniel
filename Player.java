import java.util.*;
public class Player
{
    ArrayList<CardTemplate> Hand = new ArrayList<CardTemplate>();
    String name = "player1";
    void showHand(){
        for(CardTemplate c: Hand){
            System.out.println(c.rank + " of " + c.suit);
        }
    }

    void add(CardTemplate i){
        Hand.add(i);
    }
}
