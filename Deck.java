import java.util.*;
public class Deck
{
    public static void Deck(){
        ArrayList<CardTemplate> deck = new ArrayList<CardTemplate>();
        for(int i = 1; i<5; i++){
            for(int j = 1; j<14; j++){
                deck.add(new CardTemplate(j,i));
                System.out.println(CardTemplate.suitToString(i)+" "+ CardTemplate.rankToString(j));
            }
        }
    }
}
