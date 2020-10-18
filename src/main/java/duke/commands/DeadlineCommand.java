package duke.commands;

import duke.task.Deadline;
import duke.task.TaskList;

import java.util.ArrayList;

public class DeadlineCommand {
    public DeadlineCommand(ArrayList<String> inputArguments) {
        String deadlineDescription = inputArguments.get(1);
        String taskDeadline = inputArguments.get(3);
        Deadline deadline = new Deadline(deadlineDescription,taskDeadline);
        TaskList.addTaskToList(deadline);
    }
}
