import java.util.*;
public class TestDeck{
    public static void main(String[] args){
       Deck test = new Deck();
       System.out.println(test.draw().rank +" "+ test.draw().suit);
      test.shuffle();
    /*   for (Deck s : test){
           System.out.println(rankToString(s.rank) + suitToString(s.suit));
    }*/
    /*for (int i = 0; i < test.count(); i++){
        System.out.println(rankToString((i).rank) + suitToString((i).suit));
    }*/
    
}
}