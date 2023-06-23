package taskservice;

import java.util.LinkedList;

public class TaskService {
	
	// List of all the tasks in the taskService
	private LinkedList<Task> taskList = new LinkedList<Task>();
	
	// Adds a task to the list
	public void addTask(String taskID, String taskName, String taskDescription) {
		
		// Checks to make sure the taskID is unique
		for (int i=0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID() == taskID) {
				throw new IllegalArgumentException("Task ID is not unique");
			}
		}
		
		Task newTask = new Task(taskID, taskName, taskDescription);
		taskList.add(newTask);
	}
	
	// Delete a task with a given ID
	public void deleteTask(String taskID) {
		for (int i=0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID() == taskID) {
				taskList.remove(i);
			}
		}
	}
	
	/*
	 * Updates the description of a task
	 * @param ID, description
	 */
	public void updateDescription(String ID, String description) {
		
		// Searches the linked list for contact and updates first name
		for (int i=0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID() == ID) {
				taskList.get(i).setDescription(description);
			}
		}
	}
	
	/*
	 * Updates the name of a task
	 * @param ID, taskName
	 */
	public void updateName(String ID, String taskName) {
		
		// Searches the linked list for contact and updates last name
		for (int i=0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID() == ID) {
				taskList.get(i).setName(taskName);
			}
		}
	}
	
	/*
	 * Gets a contact with the specified contact ID
	 * @param ID
	 * This method is used for testing
	 */
	public Task getTask(String ID) {
		
		// Searches linked list for contact and returns if found
		for (int i=0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID() == ID) {
				return taskList.get(i);
			}
		}
		
		// Creating a contact to return
		Task newTask = new Task("N/A", "N/A", "N/A");
		return newTask;
	}
}
