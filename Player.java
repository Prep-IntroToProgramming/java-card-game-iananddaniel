//note that in comments, player refers to the object and thus applies to either the dealer, the player, or both
import java.util.*;//imports java utilities
public class Player{
    ArrayList<CardTemplate> Hand = new ArrayList<CardTemplate>();//creates an array list to act as the player's hand
    public String name;//creates a string for the player name
    //shows the dealers hand to the player but omits the first card
    void dealerShowHand(){
        for(int i = 1; i<Hand.size(); i++){
            System.out.println("you see that the dealer has " + Hand.get(i).rankToString() + " of " + Hand.get(i).suitToString());
        }
    }
    //shows the player their hand with an enhanced for loop and the rankToString and suitToString methods
    void showHand(){
        System.out.println("your hand is: ");
        for(CardTemplate c: Hand){
            System.out.println(c.rankToString() + " of " + c.suitToString());
        }
    }
    //adds a card to the player's hand
    void gainCard(CardTemplate i){
        Hand.add(i);
    }
    //calculates the sum of the player's hand using an enhanced for loop. if the card is a face card, it is given the value of 10. if the card is an ace, it is given the highest value possible which does not cause the player to bust
    int add(){
        int HandVal = 0;
        boolean acePresent = false;
        for(CardTemplate x: Hand){
            if(x.rank <=10){
                HandVal = HandVal+x.rank;
            }else{
                HandVal = HandVal+10;
            }
            if(x.rank == 1){
                acePresent = true;
            }
            if(HandVal<=11 && acePresent == true){
                HandVal = HandVal+10;
            }
        }
        return HandVal;
    }
    //uses a scanner to let the player input their name
    public void pickName(){
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
    }
}

