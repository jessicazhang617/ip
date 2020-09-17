package duke.task;

<<<<<<< HEAD
public class Event extends Task {
=======
public class Event extends Task{
>>>>>>> ba2b3ec3e061b93a4655ccd47b469081fe7822e0
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
