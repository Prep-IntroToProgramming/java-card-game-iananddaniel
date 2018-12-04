import java.util.*;
public class TestDeck{
    public static void main(String[] args){
        Deck test = new Deck();
        test.shuffle();
        CardTemplate cardTest = test.draw();
        System.out.println("drew " + cardTest.rankToString() + " of " + cardTest.suitToString());
        test.shuffle();
        System.out.println("there are " + test.count() + " cards in the deck");
        
    }
}