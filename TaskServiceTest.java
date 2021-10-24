package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tasks.TaskService;


class TaskServiceTest {

	@Test
	void testTaskServiceAddWithId() {
		TaskService service = new TaskService();
		service.addTask("Trash1", "Take out Trash", "Trash taken out on Wednesdays.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addTask("Trash1", "Take out Trash", "Trash taken out on Wednesdays.");
		});
		
	}
	
	@Test
	void testTaskDeleteWithId() {
		TaskService service = new TaskService();
		service.addTask("Trash1", "Take out Trash", "Trash taken out on Wednesdays.");
		service.addTask("Trash2", "Take out Trash", "Trash taken out on Thursdays.");
		service.removeTask("Trash1");
		assert(service.tasksList.size() == 1);
		
	}
	
	@Test
	void testTaskNameUpdateWithId() {
		TaskService service = new TaskService();
		service.addTask("Trash1", "Take out Trash", "Trash taken out on Wednesdays.");
		service.addTask("Trash2", "Take out Trash", "Trash taken out on Thursdays.");
		service.updateTaskName("Trash1", "Wednesday-Trash");
		assertSame(service.tasksList.get("Trash1").getTaskName(), "Wednesday-Trash");
		
	}
	
	@Test
	void testTaskDescriptionUpdateWithId() {
		TaskService service = new TaskService();
		service.addTask("Trash1", "Take out Trash", "Trash taken out on Wednesdays.");
		service.addTask("Trash2", "Take out Trash", "Trash taken out on Thursdays.");
		service.updateTaskDescription("Trash1", "Dumpsters out on Wednesdays.");
		assertSame(service.tasksList.get("Trash1").getTaskDescription(), "Dumpsters out on Wednesdays.");
		
	}

}
