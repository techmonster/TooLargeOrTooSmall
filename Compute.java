package holloway.nate.TooLargeOrSmall;

import java.util.Random;

/**
 * Created by nathanielholloway on 9/10/16.
 * This is the logic or Compute class.
 */
 class Compute {

    private int secretNumber;
    private Display display;
    private int tries = 0;
    private int lastGuess = 0;

    Compute(){
        Random rnd = new Random();
        this.secretNumber = rnd.nextInt(100)+1;
        this.display = new Display();
    }

    boolean computation(){
        int userGuess = display.promptGuess();
        determineTries(lastGuess,userGuess);
        lastGuess = userGuess;
        return compare(userGuess);
    }

    private int determineTries(int old, int current){

        return (old == current) ? tries : tries++;
    }

    private boolean compare(int userGuess){
        boolean tryAgain = true;
        if(userGuess == secretNumber){
            display.displayMessage("You guessed it in " + tries + " tries!\nYou win!");
            tryAgain = false;
        }

        if(userGuess > secretNumber){
            display.displayMessage("Too high.. Try again.");
            tryAgain = true;
        }

        if(userGuess < secretNumber){
            display.displayMessage("Too low.. Try again.");
            tryAgain = true;
        }
        return tryAgain;
    }


}
