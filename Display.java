package holloway.nate.TooLargeOrSmall;
import java.util.Scanner;

/**
 * Created by nathanielholloway on 9/10/16.
 * This is the Display class.
 */
class Display {
    private Scanner sc;

    Display() {
         this.sc = new Scanner(System.in);
    }

    int promptGuess(){


        displayMessage("Please enter a number...");
        return sc.nextInt();
    }


    void displayMessage(String msg){

        System.out.println(msg);
    }

}
