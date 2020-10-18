package duke.commands;

import duke.task.Task;
import duke.task.TaskList;

import java.util.ArrayList;

public class FindCommand {
    public FindCommand(ArrayList<String> inputArguments) {
        String keyword = inputArguments.get(1);
        TaskList.findTask(keyword);

    }
}
