package duke.task;

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
}
