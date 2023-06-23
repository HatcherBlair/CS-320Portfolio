package taskservice;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TaskServiceTest {

	public final String taskID = "1234567890";
	public final String longTaskID = "1234567890111";
	public final String taskName = "Rl1ivsZYtrd3djHxUT7B";
	public final String longTaskName = "Rl1ivsZYtrd3djHxUT7Basdsada";
	public final String description = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBw";
	public final String longDescription = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBwasdasgfawdra";
	
	@Test
	void testCreateTaskService() {
		TaskService taskService = new TaskService();
		taskService.addTask(taskID, taskName, description);
		assertTrue(taskService.getTask(taskID).getTaskID().equals(taskID));
	}

	@Test
	void testLongTaskID() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(longTaskID, taskName, description);
		});
	}
	
	@Test
	void testNonUniqueContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(taskID, taskName, description);
			taskService.addTask(taskID, taskName, description);
		});
	}
	
	@Test
	void testLongNameCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(taskID, longTaskName, description);
		});
	}
	
	@Test
	void testLongNameChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(taskID, taskName, description);
			taskService.updateName(taskID, longTaskName);
		});
	}
	
	@Test
	void testLongDescriptionCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(taskID, taskName, longDescription);
		});
	}
	
	@Test
	void testLongDescriptionChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			TaskService taskService = new TaskService();
			taskService.addTask(taskID, taskName, description);
			taskService.updateDescription(taskID, longDescription);
		});
	}
}
