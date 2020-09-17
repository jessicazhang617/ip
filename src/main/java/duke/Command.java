package duke;

public abstract class Command {
    protected static boolean isExit = false;

    public void print(){};

    public void setToExit() {
        isExit = true;
    }
}
