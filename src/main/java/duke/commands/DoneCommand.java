package duke.commands;

import duke.task.TaskList;

import java.util.ArrayList;

public class DoneCommand {
    public DoneCommand(ArrayList<String> inputArguments) {
        try {
            String doneDescription = inputArguments.get(1);
            int doneTaskNum = Integer.parseInt(doneDescription);
            TaskList.getTask(doneTaskNum - 1).markAsDone();
        }catch (NumberFormatException e) {
            System.out.println("Please enter a task number!");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("This task number is invalid!");
        }
    }
}
