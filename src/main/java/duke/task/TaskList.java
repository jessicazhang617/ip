package duke.task;

import duke.task.Task;

import java.util.ArrayList;

public class TaskList {
    private static ArrayList<Task> taskList = new ArrayList<>();

    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public static void addTaskToList(Task newTask){
        taskList.add(newTask);
        System.out.println("Got it. I've added this task:\n" + "[" + newTask.getTypeOfTask() + "]" + "[" + newTask.getStatusIcon() + "] "+
                newTask.getDescription());
        System.out.format("Now you have %s task%s in the list.\n", getNumOfTask(),
                ((getNumOfTask()==1?"":"s")));
    }

    public static void deleteTaskFromList(int taskIndex){
        taskList.remove(taskIndex);
        System.out.println("Noted. I've removed this task:");
        System.out.format("Now you have %s task%s in the list.\n", taskList.size(), ((taskList.size() == 1 ? "" : "s")));
    }

    public static int getNumOfTask(){
        return taskList.size();
    }

    public static ArrayList<Task> getTaskList(){
        return taskList;
    }

    public static Task getTask(int index){
        return taskList.get(index);
    }

    public static void printList() {
        System.out.println("Here are the tasks in your list.");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.print(i+1 + ". ");
            taskList.get(i).print();
        }
    }
}
