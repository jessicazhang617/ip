package duke;
import duke.Duke;
import duke.task.Task;

public class AddTaskCommand extends Command{
    public static int NUM_OF_TASKS = 0;
    protected Task newTask;

    public AddTaskCommand(Task newTask) {
        this.newTask = newTask;
    }

    public static void createTask(){
        NUM_OF_TASKS++;
    }

    @Override
    public void print(){
        System.out.println("Got it. I've added this task:\n" + "[" + newTask.getTypeOfTask() + "] " + "[" + newTask.getStatusIcon() + "]" +
                newTask.getDescription());
    }
}

