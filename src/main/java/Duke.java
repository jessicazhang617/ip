import duke.Parser;
import duke.task.*;
import duke.task.TaskList;
import duke.Storage;
import duke.Ui;
import duke.DukeException;

import java.util.Scanner;

/**
 * Represents the bot Duke.
 * Duke can perform tasks based on user input.
 *

 */
public class Duke {
    private static final String filePath = "ip.txt";

    private final Storage storage;
    private final TaskList tasks;
    private final Ui ui;


    public Duke() {
        ui = new Ui();
        storage = new Storage(filePath);
        tasks = new TaskList(storage.createFile(filePath));
        tasks.printList();
    }


    /**
     * Runs other methods for main.
     *
     * @param args User Input.
     */
    public static void main(String[] args)  {
        new Duke().runDuke();
    }

    private static void runDuke() {
        Ui.printGreetings();
        try {
            Parser.readUserInput();
        }
        catch (StringIndexOutOfBoundsException | DukeException e) {
            System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }

}