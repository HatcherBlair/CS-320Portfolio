package taskservice;

public class Task {
	
	// Task object variables
	private final String taskID;
	private String taskName;
	private String taskDescription;

	// Constructor for task object
	Task(String taskID, String name, String description) {
		
		// Checks to make sure taskID is <=10 characters and != null
		if (taskID.length() > 10 || taskID == null) {
			throw new IllegalArgumentException("Invalid taskID");
		}
		
		// Checks to make sure name is <=20 characters and != null
		if (name.length() > 20 || name == null) {
			throw new IllegalArgumentException("Invalid task name");
		}
		
		// Checks to make sure the description is <=50 characters and != null
		if (description.length() > 50 || description == null) {
			throw new IllegalArgumentException("Invalid task description");
		}
				
		this.taskID = taskID;
		this.taskName = name;
		this.taskDescription = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return taskName;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		// Checks to make sure name is <=20 characters and != null
		if (name.length() > 20 || name == null) {
			throw new IllegalArgumentException("Invalid task name");
		}
		
		this.taskName = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return taskDescription;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		// Checks to make sure the description is <=50 characters and != null
		if (description.length() > 50 || description == null) {
			throw new IllegalArgumentException("Invalid task description");
		}
		
		this.taskDescription = description;
	}

	/**
	 * @return the taskID
	 */
	public String getTaskID() {
		return taskID;
	}
}
