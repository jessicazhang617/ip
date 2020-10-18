package duke.task;

import duke.Storage;
import duke.task.Task;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskList {

    private static ArrayList<Task> taskList;

    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public static void addTaskToList(Task newTask) {
        taskList.add(newTask);
        System.out.println("Got it. I've added this task:");
        newTask.print();
        System.out.format("Now you have %s task%s in the list.\n", getNumOfTask(),
                ((getNumOfTask() == 1 ? "" : "s")));

    }

    public static void deleteTaskFromList(int taskIndex){
        System.out.println("Noted. I've removed this task:");
        getTask(taskIndex).print();
        taskList.remove(taskIndex);
        System.out.format("Now you have %s task%s in the list.\n", taskList.size(),
                ((taskList.size() == 1 ? "" : "s")));
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
        if (getNumOfTask()!=0){
            System.out.println("Here are the tasks in your list.");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.print(i + 1 + ". ");
                taskList.get(i).print();
            }
        }else{
            System.out.println("Your list is empty!");
        }
    }

    public static void findTask(String keyword) {
        ArrayList<Task> matchingTasks = new ArrayList<>();
        for (Task task : taskList){
            if (task.getDescription().equalsIgnoreCase(keyword)) {
                matchingTasks.add(task);
            }
        }
        if (matchingTasks.size()>0) {
            System.out.format("There are %s relevant task%s in the list.\n", matchingTasks.size(),
                    ((matchingTasks.size() == 1 ? "" : "s")));
            for (Task task : matchingTasks) {
                System.out.println();
                task.print();
            }
        }else {
            System.out.println("There is no relevant task!");
        }

    }
}
