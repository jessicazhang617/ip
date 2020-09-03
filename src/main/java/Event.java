public class Event extends Task{
    /** Date and time.*/
    private String dateTime;

    /** Event object constructor.*/
    public Event(String description, String dateTime) {
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
        return "E";
    }
}
