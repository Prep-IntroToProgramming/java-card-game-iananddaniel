import java.util.*;
public class Game{
    //creates player objects for the user and the dealer
    Player dealer = new Player();
    Player player1 = new Player();
    Deck deck1 = new Deck();//creates a deck for the game
    boolean bust = false;//boolean that turns true when a player busts
    boolean hold = false;//boolean that turns true when the user holds
    public void main(){
        player1.pickName();//calls the pickName method to let the user choose a name
        deck1.shuffle();//shuffles the deck
        //uses a for loop to deal hands to the dealer and the user
        for(int z = 0; z<2; z++){
            CardTemplate card1 = deck1.draw();
            player1.gainCard(card1);
            card1 = deck1.draw();
            dealer.gainCard(card1);
        }
        //shows the player's and dealer's hand as well as the value of the player's hand
        player1.showHand();
        dealer.dealerShowHand();
        System.out.print(player1.name + ", your hand value is: ");
        System.out.println(player1.add());
        //tells the player that they tied with the dealer with 21 and ends the game
        if(player1.add()==21&&dealer.add()==21){
            System.out.println("It's a push. Both you and the dealer got BlackJack");
            return;
        }
        //tells a player they got blackjack and ends the game if the player is dealt blackjack
        if(player1.add()==21){
            System.out.println(player1.name + ", You got BlackJack!");
            return;
        }
        //tells the player that the dealer got blackjack and ends the game if the dealer was dealt 21
        if(dealer.add()==21){
            System.out.println("The dealer got BlackJack");
            return;
        }
        //while loop that continues until a player holds
        while(hold == false){
            System.out.println(player1.name + ", Type 1 to hit or 2 to hold");//tells the player how to hit or hold
            Scanner input = new Scanner(System.in);//creates a scanner variable to record user input
            //makes sure that the user enters a valid input with two while loops
            while(!input.hasNextInt()){
                System.out.println(player1.name + ", Please enter a valid response.");
                System.out.println(player1.name + ", Type 1 to hit or 2 to hold");
                input.nextLine();
            }
            int hitpass = input.nextInt();

            while(hitpass < 1 || hitpass > 2){
                System.out.println(player1.name + ", Please enter a valid response.");
                System.out.println(player1.name + ", Type 1 to hit or 2 to hold");
                input.nextLine();
                hitpass = input.nextInt();
            }
            //if loop which draws a card from the deck and adds it to the players hand if they hit
            if (hitpass == 1){
                CardTemplate card1 = deck1.draw();
                player1.gainCard(card1);
                player1.showHand();
                System.out.println(player1.name + ", the value of your hand is: "+ player1.add());
                //tells the player that they bust if their hand exceeds 21
                if(player1.add()>21){
                    System.out.println(player1.name + ", you bust :(");
                    bust = true;
                    return;
                }
            }
            //makes hold true if the user chooses to hold
            if (hitpass == 2){
                hold = true;
            }
        }
        //forces the dealer to hit if their hand value is less than 17
        while(dealer.add()<17){
            CardTemplate carda = deck1.draw();
            dealer.gainCard(carda);
            dealer.dealerShowHand();
            //makes the dealer bust if their hand value exceeds 21
            if(dealer.add()>21){
                System.out.println(player1.name + ", The Dealer Busts and You Win!");
                bust = true;
                return;
            }
        }
        //tells the player they won if their score is higher than the dealer
        if(player1.add() > dealer.add() && bust == false){
            System.out.println(player1.name + ", YOU WIN! Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
        //tells the player they lost if the dealers score is higher than theirs
        if(dealer.add() > player1.add() && bust == false){
            System.out.println(player1.name + ", You lose :( Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
        //tells the player that they tied if their score equals the dealer's score
        if(dealer.add() == player1.add() && bust == false){
            System.out.println(player1.name + ", You tied with the dealer. Your score was " + player1.add() + " and the dealer had " + dealer.add());
            return;
        }
    }
}
