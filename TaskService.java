package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;



public class TaskService {
	public final HashMap<String, Task> tasksList = new HashMap<String, Task>();
	
	public void addTask(String taskID, String taskName, String taskDescription) {
			if (tasksList.containsKey(taskID)) {
				throw new IllegalArgumentException("That ID already exists.");
			}
		
		Task newTask = new Task(taskID, taskName, taskDescription);
		tasksList.put(taskID, newTask);
	}
	
	public void removeTask(String taskID) {
			if (tasksList.containsKey(taskID)) {
				tasksList.remove(taskID);
			}
	}
	
	public void updateTaskName(String taskID, String taskName) {
			if (tasksList.containsKey(taskID)) {
				tasksList.get(taskID).setTaskName(taskName);
			}
	}
	
	public void updateTaskDescription(String taskID, String taskDescription) {
			if (tasksList.containsKey(taskID)) {
				tasksList.get(taskID).setTaskDescription(taskDescription);;
			}
	}
}
