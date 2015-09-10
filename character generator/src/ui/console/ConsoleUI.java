package ui.console;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This exists solely because it looks genuinely fallout-y.
 */
public class ConsoleUI {
    PrintStream con = new PrintStream(System.out);
    Scanner input = new Scanner(System.in);
    boolean programRunning = true; //our program loop.

    public ConsoleUI(){
        while (programRunning){
            mainMenu();
        }
    }

    public void mainMenu(){
        con.format("%s", "Main Menu: Please select an option below.\n");
        con.format("%s", "1. Create Character");

        int menuChoice;
        try{
            menuChoice = Integer.parseInt(input.nextLine());
            switch (menuChoice){
                case 1:
                    generateCharacter();
                    break;
            }
        }
        catch (Exception e){
            con.format("%s\n-----------\n", "Please select a valid choice.");
        }
    }

    public void generateCharacter(){

    }
}
