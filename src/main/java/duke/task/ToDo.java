package duke.task;

public class ToDo extends Task {

    /** duke.task.ToDo object Constructor.*/
    public ToDo(String description) {
        super(description);
    }

    /** Retrieves type of task.*/
    @Override
    public String getTypeOfTask() {
        return "T";
    }

}