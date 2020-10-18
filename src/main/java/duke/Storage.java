package duke;
import java.util.ArrayList;

import duke.task.Task;
import duke.task.TaskList;
import duke.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;


public class Storage {
    private static String filepath;

    public Storage(String filepath) {
        this.filepath = filepath;
    }


    public ArrayList<Task> createFile(String filepath){
        ArrayList<Task> listOfTaskData = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                file.createNewFile();
            }else {
                System.out.println("File already exists.");
                readExistingFile(filepath);
            }
        }catch (IOException e) {
            System.out.println("Something went wrong when creating file: " + e.getMessage());
            System.exit(0);
        }
        return listOfTaskData;
    }

    private ArrayList<Task> readExistingFile(String filepath) {
        ArrayList<Task> listOfTaskData = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(filepath);
            String readTask = fileReader.nextLine();
            Task loadedTask = Parser.decodeTaskData(readTask);
            TaskList.addTaskToList(loadedTask);
        }catch (NullPointerException e) {
            System.out.println("File is empty.");
        }
        return listOfTaskData;
    }


    public static void writeToFile(String filePath, String textToAdd) throws DukeException {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            for (Task task : TaskList.getTaskList()) {
                fileWriter.write(task.getTypeOfTask()+"|"+task.getStatusIcon()+"|"+task.getDescription());
            }
            fileWriter.close();
        } catch (IOException exception) {
            throw new DukeException("Duke couldn't write to file.");
        }
    }

    public static String getFilepath(){return filepath;}

}
