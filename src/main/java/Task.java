/**
 * Represents a task.
 */
public class Task {
    /** Description of task.*/
    protected String description;
    /** Boolean flag of whether task is done.*/
    protected boolean isDone;
    /** Type of Task.*/
    protected String typeOfTask;

    /** Task object Constructor.*/
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Retrieves status icon for task.
     * */
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    /** Retrieves type of task.*/
    public String getTypeOfTask() {
        return typeOfTask;
    }

    /** Set boolean isDone as true.*/
    public void markAsDone(){
        isDone = true;
    }

}