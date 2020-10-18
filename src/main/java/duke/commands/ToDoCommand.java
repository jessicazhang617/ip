package duke.commands;

import duke.DukeException;
import duke.Storage;
import duke.task.TaskList;
import duke.task.ToDo;

import java.util.ArrayList;

public class ToDoCommand {

    public ToDoCommand(ArrayList<String> inputArguments) {
        try {
            String toDoDescription = inputArguments.get(1);
            ToDo todo = new ToDo(toDoDescription);
            TaskList.addTaskToList(todo);
            Storage.writeToFile(Storage.getFilepath(),todo.getTypeOfTask()+"|"+todo.getStatusIcon()+"|"+todo.getDescription());
        }catch(IndexOutOfBoundsException e){
            System.out.println("☹ OOPS!!! The description of a todo cannot be empty.");
        }catch (NullPointerException e) {
            System.out.println("Your task cannot be added.");
        } catch (DukeException e) {
            e.printStackTrace();
        }
    }
}
