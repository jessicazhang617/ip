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

    private Storage storage;
    private TaskList tasks;
    private Ui ui;


    public Duke(String filePath) {
        ui = new Ui();
        storage = new Storage(filePath);
        tasks = new TaskList(storage.createFile(filePath));
    }


    /**
     * Runs other methods for main.
     *
     * @param args User Input.
     */
    public static void main(String[] args) {
        Ui.printGreetings();
        runDuke();
    }

    private static void runDuke(){
        while (!Ui.exitStatus) {
            try {
                Ui.readUserInput();
            }
            catch (StringIndexOutOfBoundsException | DukeException e) {
                System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
            }
        }
    }
}