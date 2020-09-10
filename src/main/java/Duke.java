import java.util.Scanner;

/**
 * Represents the bot Duke.
 * Duke can perform tasks based on user input.
 *
 * {@value #NUM_OF_TASKS} Number of Tasks.
 */
public class Duke {

    private static int NUM_OF_TASKS = 0;
    private static int MAX_TASKS_NUM = 100;
    private static final Task[] list = new Task[MAX_TASKS_NUM];

    /**
     * Runs other methods for main.
     *
     * @param args User Input.
     */
    public static void main(String[] args) {
        printGreetings();
        listActions();
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
        System.out.println("Yo Wassup, da name's\n" + logo);
        System.out.println("Hi bro I'm Duke\n" + "Whatcha wanna do?");
    }

    /**
     * Returns actions for lists based on user input.
     */
    public static void listActions() {
        Scanner in = new Scanner(System.in);
        String line;

        do {
            line = in.nextLine();
            if (line.contains("done")){
                updateTask(line,list);
            }else if (line.equalsIgnoreCase("bye")){
                printBye();
                break;
            }else if(line.equalsIgnoreCase("list")) {
                printList(list);
            }else if (line.contains("deadline")) {
                createDeadline(line);
                System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS,((NUM_OF_TASKS==1?"":"s")));
            }else if (line.contains("event")) {
                createEvent(line);
                System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS,((NUM_OF_TASKS==1?"":"s")));
            }else {
                createToDo(line);
                System.out.format("Now you have %s task%s in the list.\n", NUM_OF_TASKS,((NUM_OF_TASKS==1?"":"s")));
            }
        } while (!line.equalsIgnoreCase("bye"));

    }

    /**
     * Adds new task to the list.
     *
     * @param t new Task
     */
    public static void addToList(Task t){
        list[NUM_OF_TASKS] = t;
        NUM_OF_TASKS++;
        System.out.print("Got it. I've added this task:\n" + "[" + t.getTypeOfTask() + "]" + "[" + t.getStatusIcon() + "] "+
                t.description);
    }

    /**
     * Creates a new ToDo
     *
     * @param line User input
     */
    public static void createToDo(String line){
        String description = line.substring(5);

        ToDo toDo = new ToDo(description);
        addToList(toDo);
        System.out.println();
    }

    /**
     * Creates a new Deadline
     *
     * @param line User input
     */
    public static void createDeadline(String line){
        int startOfDateTime = line.indexOf("by");
        String dateTime = line.substring(startOfDateTime+3);
        String description = line.substring(9,startOfDateTime-1);

        Deadline d = new Deadline(description,dateTime);
        addToList(d);
        System.out.println("(by: "+ d.getDateTime() + ")");
    }

    /**
     * Creates a new Event
     *
     * @param line User input
     */
    public static void createEvent(String line){
        int startOfDateTime = line.indexOf("at");
        String dateTime = line.substring(startOfDateTime+3);
        String description = line.substring(6,startOfDateTime-1);

        Event e = new Event (description,dateTime);
        addToList(e);
        System.out.println("(at: "+ e.getDateTime() + ")");
    }

    /**
     * Prints task list.
     *
     * @param list Task list.
     */
    public static void printList(Task[] list) {
        if (NUM_OF_TASKS == 0){
            System.out.println("The list is empty!");
        }else {
            System.out.println("Here are the tasks in your list.");
            for (int i = 0; i < NUM_OF_TASKS; i++) {
                System.out.println(i+1 + ". " + "[" + list[i].getStatusIcon() + "] " + list[i].description);
            }
        }
    }

    /**
     * Marks task as done.
     *
     * @param line User Input.
     * @param list Task list.
     */
    public static void updateTask(String line,Task[] list){
        String taskNumString = line.substring(5);
        int taskNumInt = Integer.parseInt(taskNumString);
        list[taskNumInt-1].markAsDone();
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("["+list[taskNumInt-1].getStatusIcon()+"]"+ list[taskNumInt-1].description);
    }

    /**
     * Prints goodbye.
     */
    public static void printBye(){
        System.out.println("Bye. Hope to see you again soon!");
    }

}

