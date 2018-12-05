
public class CardTemplate {
    //Here you need to declare the instance variables for the Card object
    /*
     * Declare instance variables
     */
    public final int suit;
    public final int rank;
    // Kinds of ranks: assigns each rank a number 
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;
    // Suits: assings each suit a number
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;
    // Here you need to define the constructor. It takes an int for the 
    // starting rank and an int for the starting suit
    /*
     * declaring the constructor
     *
     */
    //constructor for cards that takes a rank and a suit
    public CardTemplate (int arank, int asuit){
        if((arank>=1)&&(arank<=13)){
            rank = arank;
        }else{
            throw new RuntimeException();//throws a runtime error if an invalid parameter is given
        }
        if((asuit>=1)&&(asuit<=4)){
            suit = asuit;
        }else{
            throw new RuntimeException();//throws a runtime error if an invalid parameter is given
        }
    }
    // Here is the if-then-else approach for returning the string
    // as a rank
    public static String rankToString(int rank) {
        if (rank == ACE) {
            return "Ace";
        } else if (rank == DEUCE) {
            return "Deuce";
        } else if (rank == THREE) {
            return "Three";
        } else if (rank == FOUR) {
            return "Four";
        } else if (rank == FIVE) {
            return "Five";
        } else if (rank == SIX) {
            return "Six";
        } else if (rank == SEVEN) {
            return "Seven";
        } else if (rank == EIGHT) {
            return "Eight";
        } else if (rank == NINE) {
            return "Nine";
        } else if (rank == TEN) {
            return "Ten";
        } else if (rank == JACK) {
            return "Jack";
        } else if (rank == QUEEN) {
            return "Queen";
        } else if (rank == KING) {
            return "King";
        } else {
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }

 

    // Here you need to declare a public class method called suitToString that takes an 
    // int (the suit) as input and uses if-else statements or a switch statement to 
    // return the String corresponding to a suit. Use rankToString as your template.
    /*
     *
     * declare suitToString
     *
     *
     */
    //creates a class method which takes an int parameter and returns a string for the name of the suit
    public static String suitToString(int suit){
        if(suit==DIAMONDS){
            return "Diamonds";
        }else if (suit ==HEARTS){
            return "Hearts";
        }else if (suit==CLUBS){
            return "Clubs";
        }else if (suit==SPADES){
            return "Spades";
        }else{
            return null;
        }
    }
    //creates an overloaded rank to string method that requires no parameters
    public String rankToString() {
        if (rank == ACE) {
            return "Ace";
        } else if (rank == DEUCE) {
            return "Deuce";
        } else if (rank == THREE) {
            return "Three";
        } else if (rank == FOUR) {
            return "Four";
        } else if (rank == FIVE) {
            return "Five";
        } else if (rank == SIX) {
            return "Six";
        } else if (rank == SEVEN) {
            return "Seven";
        } else if (rank == EIGHT) {
            return "Eight";
        } else if (rank == NINE) {
            return "Nine";
        } else if (rank == TEN) {
            return "Ten";
        } else if (rank == JACK) {
            return "Jack";
        } else if (rank == QUEEN) {
            return "Queen";
        } else if (rank == KING) {
            return "King";
        } else {
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }
    //creates an overloaded suit to string that requires no parameters
    public String suitToString(){
        if(suit==DIAMONDS){
            return "Diamonds";
        }else if (suit ==HEARTS){
            return "Hearts";
        }else if (suit==CLUBS){
            return "Clubs";
        }else if (suit==SPADES){
            return "Spades";
        }else{
            return null;
        }
    }
}
