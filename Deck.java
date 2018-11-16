import java.util.*;
public class Deck
{
    ArrayList<CardTemplate> deck = new ArrayList<CardTemplate>(); 
    public void Deck(){
        for(int i = 1; i<5; i++){
            for(int j = 1; j<14; j++){
                deck.add(new CardTemplate(j,i));
                System.out.println(CardTemplate.suitToString(i)+" "+ CardTemplate.rankToString(j));
            }
        }
    }

    public CardTemplate Draw(){
        CardTemplate first = deck.get(0);
        deck.remove(0);
        return first;
    }

    public void Shuffle(){
        Collections.shuffle(deck);

    }
    
}