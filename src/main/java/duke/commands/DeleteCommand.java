package duke.commands;

import duke.task.TaskList;

import java.util.ArrayList;

public class DeleteCommand {
    public DeleteCommand(ArrayList<String> inputArguments) {
        try {
            String deleteDescription = inputArguments.get(1);
            int deleteTaskNum = Integer.parseInt(deleteDescription);
            TaskList.deleteTaskFromList(deleteTaskNum-1);
        }catch (NumberFormatException e) {
            System.out.println("☹ OOPS!!! Please enter a task number.");
        }
    }
}
