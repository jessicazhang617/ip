package duke.commands;

import duke.task.Event;
import duke.task.TaskList;

import java.util.ArrayList;

public class EventCommand {
    public EventCommand(ArrayList<String> inputArguments) {
        String eventDescription = inputArguments.get(1);
        String eventDateTime = inputArguments.get(3);
        Event event = new Event(eventDescription, eventDateTime);
        TaskList.addTaskToList(event);
    }
}
