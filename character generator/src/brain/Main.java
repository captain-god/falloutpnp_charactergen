package brain;

import ui.gui.Launcher;

/**
 * The brains of the operation.
 */
public class Main {
    public static void main (String[] args){
        /**
         * Check through the passed args to see if they want to launch the console version
         */
        for(String arg : args){
            if (arg.equalsIgnoreCase("consoleui")){
                //
            }
            else {
                new Launcher();
            }
        }
    }
}
