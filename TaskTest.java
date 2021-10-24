package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tasks.Task;

class TaskTest {

	@Test
	void testTaskIDIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("Trash1", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
		new Task("Trash2", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
		new Task("Trash3", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
		new Task(null, "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
	});
}
	
	@Test
	void testTaskIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Trash1", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash2", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash3", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("TASKTHROWOUTTHETRASH", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
		});
	}
	
	@Test
	void testTaskNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Trash1", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash2", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash3", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash4", "Put out Trash and make sure all of it is empty.", "Dumpster needs to be placed out every Wednesday.");
		});
	}
	
	@Test
	void testTaskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Trash1", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash2", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash3", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash4", null, "Dumpster needs to be placed out every Wednesday.");
		});
	}
	
	@Test
	void testTaskDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Trash1", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash2", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash3", "Put out Trash", "Dumpster needs to be placed out every Wednesday.");
			new Task("Trash4", "Put out Trash.", "Every Wednesday, the trash must be taken out once a week.");
		});
	}
	
	@Test
	void testTaskDescriptionIsNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Trash1", "Put out Trash.", null);
		});
	}

}
