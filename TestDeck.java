import java.util.*;
public class TestDeck{
    public static void main(String[] args){
        Deck test = new Deck();//creates a deck to use for testing
        System.out.println("Deck before discard:");
        //prints all the cards in the deck
        for(CardTemplate i: test.cards){
            System.out.println(i.rankToString() + " of " + i.suitToString());
        }
        test.discard(test.cards.get(0), test.cards);//discards the first card using the discard method
        System.out.println("Deck after the first card is discarded:");
        //prints all the cards in the deck after the first card was discarded
        for(CardTemplate i: test.cards){
            System.out.println(i.rankToString() + " of " + i.suitToString());
        }
        test.shuffle();//shuffles the cards
        //tests the draw method by creating a variable to store drawn card then printing it
        CardTemplate cardTest = test.draw();
        System.out.println("drew " + cardTest.rankToString() + " of " + cardTest.suitToString());
        //tests the count method
        System.out.println("there are " + test.count() + " cards in the deck");
        //tests the check method to see if the deck contains a card
        System.out.println(test.check(test.cards.get(20), test.cards));
    }
}