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

}
