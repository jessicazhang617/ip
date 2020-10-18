package duke.task;

import duke.DukeException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Event extends Task {
    /** Date and time.*/
    private String taskDeadline;

    /** duke.task.Event object constructor.*/
    public Event(String description, String taskDeadline) {
        super(description);
        this.taskDeadline = taskDeadline;
    }

    /** Retrieves date and time.*/
    public String getTaskDeadline() {
        return taskDeadline;
    }

    /** Retrieves type of task.*/
    @Override
    public String getTypeOfTask() {
        return "E";
    }

    @Override
    public String toString() {
        return getTypeOfTask() + " | " + (isDone ? "1 | ": "0 | ") + getDescription() + " | " + taskDeadline;
    }

    @Override
    public void print(){
        System.out.println("[" + this.getTypeOfTask() + "]" + "[" + this.getStatusIcon() + "] " +
                    this.getDescription() + " (at: " + this.taskDeadline + ")");
    }

    private LocalDateTime parseDateTime(String commandDateTime) throws DukeException {
        try {
            return LocalDateTime.parse(commandDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException exception) {
            throw new DukeException("Please enter date and time format as: YYYY-MM-DD.");
        }
    }
}
