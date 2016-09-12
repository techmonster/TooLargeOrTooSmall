package holloway.nate.TooLargeOrSmall;

import java.util.Scanner;

/**
 * Created by nathanielholloway on 9/10/16.
 * This is the Display class.
 */
public class Display {
    Scanner sc;

    public Display() {
         this.sc = new Scanner(System.in);
    }

    public int promptGuess(){


        displayMessage("Please enter a number...");
        return sc.nextInt();
    }


    public void displayMessage(String msg){

        System.out.println(msg);
    }

}
