package holloway.nate.TooLargeOrSmall;
/**
 * Created by nathanielholloway on 9/10/16.
 * This program is a guessing game.
 */

public class Initializer {

    public static void main(String[] args) {
        Compute startApp = new Compute();
        boolean state = true;
        while(state) {
            state = startApp.computation();
        }
    }
}
