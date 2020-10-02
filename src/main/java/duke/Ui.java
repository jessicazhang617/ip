package duke;

import java.util.Scanner;

public class Ui {
    public static boolean exitStatus = false;

    public Ui() {
    }

    /**
     * Prints greetings.
     */
    public static void printGreetings(){
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Yo Wassup, my name's\n" + logo);
        System.out.println("Hello!\n" + "How may I help you?");
    }

    /**
     * Prints the input prompt and also to prompt the user for input.
     *
     * @return the raw input entered by the user
     */
    public static void readUserInput() throws DukeException {
        Scanner in = new Scanner(System.in);
        String userInput;
        userInput = in.nextLine();
        Parser.readUserInput(userInput);
    }

}
