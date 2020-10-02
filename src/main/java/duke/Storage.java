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
    private String filepath;
    public Storage(String filepath) {
        this.filepath = filepath;
    }

    //add scanner function to read file path;

    public ArrayList<Task> createFile(String filepath){
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                file.createNewFile();
            }else {
                System.out.println("File already exists.");
                readExistingFile(filepath);
            }
        }catch (IOException e) {
            System.out.println("Something went wrong when creating file" + e.getMessage());
        }
        return null;
    }

    private ArrayList<Task> readExistingFile(String filepath) {
        ArrayList<Task> listOfTaskData = new ArrayList<>();

        try {
            String line;
            BufferedReader br = new BufferedReader(
                    new FileReader(filepath));
            while ((line = br.readLine()) != null) {
                listOfTaskData.add(Parser.decodeTaskData(line));
            }
        }catch (IOException e) {
        }
        return listOfTaskData;
    }


    private void writeToFile(String filePath, String textToAdd) throws IOException, DukeException {
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

}
