public class ToDo extends Task {

    /** ToDo object Constructor.*/
    public ToDo(String description) {
        super(description);
    }

    /** Retrieves type of task.*/
    @Override
    public String getTypeOfTask() {
        return "T";
    }

}
