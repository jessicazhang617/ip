public class Deadline extends Task{
    /** Date and time.*/
    private String dateTime;

    /** Deadline object Constructor.*/
    public Deadline(String description, String dateTime) {
        super(description);
        this.dateTime = dateTime;
    }

    /** Retrieves date and time.*/
    public String getDateTime() {
        return dateTime;
    }

    /** Retrieves type of task.*/
    @Override
    public String getTypeOfTask() {
        return "D";
    }
}
