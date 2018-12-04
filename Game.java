import java.util.*;
public class Game{
    //ArrayList<Player> players = new ArrayList<Player>();
    Player dealer = new Player();
    Player player1 = new Player();
    Deck deck1 = new Deck();
    boolean bust = false;
    boolean hold = false;
    public void main(){
        deck1.shuffle();
        for(int z = 0; z<2; z++){
            CardTemplate card1 = deck1.draw();
            player1.gainCard(card1);
            card1 = deck1.draw();
            dealer.gainCard(card1);
        }
        //dealer.showHand();
        //System.out.println("^^dealer cards");
        player1.showHand();
        System.out.println("your hand value is");
        System.out.println(player1.add());
        if(player1.add()==21){
            System.out.println("You got BlackJack!");
            return;
        }
        while(hold == false){
            System.out.println("Type 1 to hit or 2 to hold");
            Scanner input = new Scanner(System.in);
            while(!input.hasNextInt()){
                System.out.println("Please enter a valid response.");
                System.out.println("Type 1 to hit or 2 to hold");
                input.nextLine();
            }
            int hitpass = input.nextInt();

            while(hitpass < 1 || hitpass > 2){
                System.out.println("Please enter a valid response.");
                System.out.println("Type 1 to hit or 2 to hold");
                input.nextLine();
                hitpass = input.nextInt();
            }

            if (hitpass == 1){
                CardTemplate card1 = deck1.draw();
                player1.gainCard(card1);
                player1.showHand();
                System.out.println("The value of your hand is: "+ player1.add());
                if(player1.add()>21){
                    System.out.println("you bust :(");
                    bust = true;
                    return;
                }
            }
            if (hitpass == 2){
                hold = true;
            }
        }
        while(dealer.add()<17){
                CardTemplate carda = new CardTemplate(1,1);
                carda = deck1.draw();
                dealer.gainCard(carda);
                if(dealer.add()>21){
                    System.out.println("The Dealer Busts and You Win!");
                    bust = true;
                    return;
                }
            }
        if(player1.add() > dealer.add() && bust == false){
            System.out.println("YOU WIN! Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
        if(dealer.add() > player1.add() && bust == false){
            System.out.println("You lose :( Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
        if(dealer.add() == player1.add() && bust == false){
            System.out.println("You tied with the dealer. Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
    }
}
