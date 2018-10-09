package TestGameFirst;
import java.util.*;

class Player {

    /*
     * Declare (give a variable type and name) the important instance variables:
     * the player's name and the player's guess 
     */
    
    // This line starts the scanner for use in the methods
    Scanner input = new Scanner(System.in);

    void chooseName() {
        /*
         * Print out a line asking the use to enter their name.
         * Assign the user input to the variable for the player name.
         * Finally, print out a hello to the user that addresses them by name.
         */

        // Move to next line. If there's any input in the line that was not
        // used, this skips over it to be ready for the next line of input.
        input.nextLine();
    }
    
    /*
     * Declare a method called chooseGuess that takes no input and returns no
     * values. In this method, print out a line asking the user to make 
     * their guess. 
     *
     * Finally, begin a while loop that runs until "input" has a valid integer 
     * 
     * You should end up at the right level of indentation.
     */

            System.out.println("Invalid guess. Enter your guess: ");

            // Move to next line. If there's any input in the line that was not
            // used, this skips over it to be ready for the next line of input.
            input.nextLine();
        }

        /*
         * Set the player guess variable to the value the user gave.
         */
        guess = input.nextInt();
    }
}
