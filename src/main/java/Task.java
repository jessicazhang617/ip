/**
 * Represents a task.
 */
public abstract class Task {
    /** Description of task.*/
    protected String description;
    /** Boolean flag of whether task is done.*/
    protected boolean isDone;
    /** Type of Task.*/
    protected String typeOfTask;
    protected final String TICK_SYMBOL= "\u2713";
    protected final String CROSS_SYMBOL= "\u2718";

    /** Task object Constructor.*/
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Retrieves status icon for task.
     * */
    public String getStatusIcon() {
        return (isDone ? TICK_SYMBOL : CROSS_SYMBOL); //return tick or X symbols
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