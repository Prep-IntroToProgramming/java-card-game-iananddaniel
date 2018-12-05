import java.util.*;
public class TestDeck{
    public static void main(String[] args){
        Deck test = new Deck();
        System.out.println("Deck before discard:");
        for(CardTemplate i: test.cards){
            System.out.println(i.rankToString() + " of " + i.suitToString());
        }
        test.discard(test.cards.get(0), test.cards);
        System.out.println("Deck after the first card is discarded:");
        for(CardTemplate i: test.cards){
            System.out.println(i.rankToString() + " of " + i.suitToString());
        }
        test.shuffle();
        CardTemplate cardTest = test.draw();
        System.out.println("drew " + cardTest.rankToString() + " of " + cardTest.suitToString());
        System.out.println("there are " + test.count() + " cards in the deck");
        
    }
}