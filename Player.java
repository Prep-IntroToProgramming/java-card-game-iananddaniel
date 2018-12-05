import java.util.*;
public class Player
{
    ArrayList<CardTemplate> Hand = new ArrayList<CardTemplate>();
    public String name;
    void dealerShowHand(){
        for(int i = 1; i<Hand.size(); i++){
            System.out.println("you see that the dealer has " + Hand.get(i).rankToString() + " of " + Hand.get(i).suitToString());
        }
    }

    void showHand(){
        System.out.println("your hand is: ");
        for(CardTemplate c: Hand){
            System.out.println(c.rankToString() + " of " + c.suitToString());
        }
    }

    void gainCard(CardTemplate i){
        Hand.add(i);
    }

    void dealerGainCard(CardTemplate i){
        Hand.add(i);
    }

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

    public void pickName(){
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
    }
}

