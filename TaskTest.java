package taskservice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskTest {

	public final String taskID = "1234567890";
	public final String longTaskID = "1234567890111";
	public final String taskName = "Rl1ivsZYtrd3djHxUT7B";
	public final String longTaskName = "Rl1ivsZYtrd3djHxUT7Basdsada";
	public final String description = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBw";
	public final String longDescription = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBwasdasgfawdra";
	
	@Test
	public void testTaskCreate() {
		Task task = new Task(taskID, taskName, description);
		assertTrue(task.getTaskID().equals(taskID));
		assertTrue(task.getName().equals(taskName));
		assertTrue(task.getDescription().equals(description));
	}
	
	@Test
	public void testNameChange() {
		Task task = new Task(taskID, taskName, description);
		assertTrue(task.getName().equals(taskName));
		task.setName("Testing");
		assertTrue(task.getName().equals("Testing"));
	}
	
	@Test
	public void testDescriptionChange() {
		Task task = new Task(taskID, taskName, description);
		assertTrue(task.getDescription().equals(description));
		task.setDescription("Testing");
		assertTrue(task.getDescription().equals("Testing"));
	}
}
