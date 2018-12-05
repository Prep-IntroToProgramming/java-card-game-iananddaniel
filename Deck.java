import java.util.*;//imports java utilities
public class Deck
{
    public ArrayList<CardTemplate> cards = new ArrayList<CardTemplate>();//creates an array list of CardTemplates to act as the deck
    //adds cards to the deck using nested for loops
    public Deck(){
        for(int i = 1; i<5; i++){
            for(int j = 1; j<14; j++){
                cards.add(new CardTemplate(j,i));
            }
        }
    }
    //draws a card from the deck by storing the first card in a variable and then removing it from the array list
    public CardTemplate draw(){
        CardTemplate first = cards.get(0);
        cards.remove(0);
        return first;
    }
    //shuffles the cards using the collections shuffle method
    public void shuffle(){
        Collections.shuffle(cards);
    }
    //uses the size array list method to return the number of cards in the deck
    public int count(){
        return cards.size();
    }
    // discards a card using the indexOf arraylist method
    public void discard(CardTemplate i, ArrayList j){
        j.remove(j.indexOf(i));
    }
    //checks if the deck contains a card using the contains arraylist method and a for loop to cycle through the deck. if the for loop finds that a card is contained, it makes a boolean true
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