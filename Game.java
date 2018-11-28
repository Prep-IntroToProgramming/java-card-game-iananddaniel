import java.util.*;
public class Game{
    //ArrayList<Player> players = new ArrayList<Player>();
    Player dealer = new Player();
    Player player1 = new Player();
    Deck deck1 = new Deck();

    public void main(){
        deck1.shuffle();
        
        /*System.out.println("Number of Players: ");
        int nPlayers; 
        while (!input.hasNextInt()){
        System.out.println("invalid number of players");
        System.out.println("Number of Players: ");
        input.nextLine();
        }
        nPlayers = input.nextInt();
        for (int y = 1; y<=nPlayers; y++){
        Player player= new Player();
        players.add(player);
        }*/
        for(int z = 0; z<2; z++){
            CardTemplate card1 = deck1.draw();
            player1.gainCard(card1);
        }
        player1.showHand();
        System.out.println(player1.add());
        Scanner input = new Scanner(System.in);
        int hitpass = input.nextInt();
        System.out.println("Type 1 to hit or 2 to hold");
        while(hitpass == 1 || hitpass == 2){
            System.out.println("Please enter a valid response.");
            System.out.println("Type 1 to hit or 2 to hold");
            input.nextLine();
        }
    }
}
