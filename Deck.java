import java.util.*;//imports java utilities
public class Deck
{
    ArrayList<CardTemplate> cards = new ArrayList<CardTemplate>(); 
    public Deck(){
        for(int i = 1; i<5; i++){
            for(int j = 1; j<14; j++){
                cards.add(new CardTemplate(j,i));
                //System.out.println(CardTemplate.suitToString(i)+" "+ CardTemplate.rankToString(j));
            }
        }
    }

    public CardTemplate draw(){
        CardTemplate first = cards.get(0);
        cards.remove(0);
        return first;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public int count(){
        return cards.size();
    }

    public void discard(CardTemplate i, ArrayList j){
        j.remove(i);
    }
}