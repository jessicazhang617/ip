package duke.task;

public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
    }

    /** Retrieves type of task.*/
    @Override
    public String getTypeOfTask() {
        return "T";
    }

    @Override
    public String toString() {
        return getTypeOfTask() + " | " + (isDone ? "1 | ": "0 | ") + getDescription();
    }

    @Override
    public void print(){
        System.out.println("[" + this.getTypeOfTask() + "]" + "[" + this.getStatusIcon() + "] " +
                this.getDescription());
    }

}
