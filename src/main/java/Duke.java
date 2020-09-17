import duke.task.Deadline;
import duke.task.Event;
import duke.task.Task;
import duke.task.ToDo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents the bot Duke.
 * Duke can perform tasks based on user input.
 *
 * {@value #NUM_OF_TASKS} Number of Tasks.
 */
public class Duke {

    private static int NUM_OF_TASKS = 0;
    private final static int MAX_TASK_NUM = 100;
    private final static Task[] list = new Task[MAX_TASK_NUM];

    /**
     * Runs other methods for main.
     *
     * @param args User Input.
     */
    public static void main(String[] args) {
        printGreetings();
        try {
            listActions();
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }

    /**
     * Prints greetings.
     */
    private static void printGreetings(){
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Yo Wassup, da name's\n" + logo);
        System.out.println("Hi bro I'm Duke\n" + "Whatcha wanna do?");
    }

    /**
     * Returns actions for lists based on user input.
     */
    private static void listActions() {
        Scanner in = new Scanner(System.in);
        String userInput;
        userInput = in.nextLine();
        ArrayList<String> userInputs= new ArrayList<>();

        do {
            userInput = in.nextLine();
            if (userInput.contains("done")){
                updateTask(userInput);
            }else if (userInput.equalsIgnoreCase("bye")){
                printBye();
                break;
            }else if(userInput.equalsIgnoreCase("list")) {
                printList();
            }else if (userInput.contains("deadline")) {
                createDeadline(userInput);
                System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS,((NUM_OF_TASKS==1?"":"s")));
            }else if (userInput.contains("event")) {
                createEvent(userInput);
                System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS,((NUM_OF_TASKS==1?"":"s")));
            }else if (userInput.contains("todo")) {
                try {
                    createToDo(userInput);
                    System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS, ((NUM_OF_TASKS == 1 ? "" : "s")));
                }catch(StringIndexOutOfBoundsException e){
                    System.out.println("☹ OOPS!!! The description of a todo cannot be empty.");
                }
            }else {
                throw new StringIndexOutOfBoundsException();
            }
        } while (!userInput.equalsIgnoreCase("bye"));

    }

    /**
     * Adds new task to the list.
     *
     * @param task new duke.task.Task
     */
    private static void addToList(Task task){
        list[NUM_OF_TASKS] = task;
        NUM_OF_TASKS++;
        System.out.print("Got it. I've added this task:\n" + "[" + task.getTypeOfTask() + "]" + "[" + task.getStatusIcon() + "] "+
                task.getDescription());
    }

    /**
     * Creates a new duke.task.ToDo
     *
     * @param line User input
     */
    private static void createToDo(String line){
        String description = line.substring(5);

        ToDo toDo = new ToDo(description);
        addToList(toDo);
        System.out.println();
    }

    /**
     * Creates a new duke.task.Deadline
     *
     * @param line User input
     */
    private static void createDeadline(String line){
        int startOfTaskDeadline = line.indexOf("by");
        String taskDeadline = line.substring(startOfTaskDeadline + 3);
        String description = line.substring(9,startOfTaskDeadline - 1);

        Deadline deadline = new Deadline(description,taskDeadline);
        addToList(deadline);
        System.out.println("(by: "+ deadline.getTaskDeadline() + ")");
    }

    /**
     * Creates a new duke.task.Event
     *
     * @param line User input
     */
    private static void createEvent(String line){
        int startOfTaskDeadline = line.indexOf("at");
        String taskDeadline = line.substring(startOfTaskDeadline + 3);
        String description = line.substring(6,startOfTaskDeadline - 1);

        Event event = new Event(description,taskDeadline);
        addToList(event);
        System.out.println("(at: "+ event.getTaskDeadline() + ")");
    }

    /**
     * Prints task list.
     *
     */
    private static void printList() {
        if (NUM_OF_TASKS == 0){
            System.out.println("The list is empty!");
        }else {
            System.out.println("Here are the tasks in your list.");
            for (int i = 0; i < NUM_OF_TASKS; i++) {
                System.out.println(i+1 + ". " + "[" + Duke.list[i].getStatusIcon() + "] " + Duke.list[i].getDescription());
            }
        }
    }

    /**
     * Marks task as done.
     *  @param line User Input.
     *
     */
    private static void updateTask(String line){
        String taskNumString = line.substring(5);
        int taskNumInt = Integer.parseInt(taskNumString)-1;
        Duke.list[taskNumInt].markAsDone();
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("["+ Duke.list[taskNumInt-1].getStatusIcon()+"]"+ Duke.list[taskNumInt-1].getDescription());
    }

    /**
     * Prints goodbye.
     */
    private static void printBye(){
        System.out.println("Bye. Hope to see you again soon!");
    }

}

