package duke.task;

public class Deadline extends Task {
    /** Date and time.*/
    private String taskDeadline;

    /** duke.task.Deadline object Constructor.*/
    public Deadline(String description, String taskDeadline) {
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
        return "D";
    }

    @Override
    public void print(){
        System.out.println("[" + this.getTypeOfTask() + "]" + "[" + this.getStatusIcon() + "] " +
                this.getDescription() + "(by: " + this.getTaskDeadline() + ")");
    }
}
