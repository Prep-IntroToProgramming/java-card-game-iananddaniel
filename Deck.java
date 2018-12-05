import java.util.*;//imports java utilities
public class Deck
{
    public ArrayList<CardTemplate> cards = new ArrayList<CardTemplate>(); 
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
        int index = j.indexOf(i);
        j.remove(index);
    }

    public boolean check(CardTemplate i, ArrayList j){
        boolean contains = false;
        for(int x = 0; x < j.size(); x++){
            if(j.contains(i)){
                contains = true;
            }
        }
        return contains;
    }
}