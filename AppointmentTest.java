package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Apointment.Appointment;


class AppointmentTest {

	@Test
	void testAppoiontmentIDIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			new Appointment(null, date4 , "Sister's Birthday");
	});
}
	
	@Test
	void testAppointmentDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			new Appointment("appt4", null , "Sister's Birthday");
		});
	}
	
	
	@Test
	void testAppointmentIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			new Appointment("appt4-Sister's Birthday", date4 , "Sister's Birthday");
		});
	}
	
	
	@Test
	void testAppointmentInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			date4.set(2020, 04, 20);
			new Appointment("appt4", date4 , "Sister's Birthday");
		});
	}
	
	
	
	@Test
	void testAppointmentDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			new Appointment("appt4", date4 , "Sister's Birthday is going to be the weekend of the Fall Break in about two weeks.");
		});
	}
	
	@Test
	void testAppointmentDescriptionIsNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calendar date1 = Calendar.getInstance();
			new Appointment("appt1", date1, "Dad's Birthday");
			Calendar date2 = Calendar.getInstance();
			new Appointment("appt2", date2 , "Brother's Birthday");
			Calendar date3 = Calendar.getInstance();
			new Appointment("appt3", date3, "Mother's Birthday");
			Calendar date4 = Calendar.getInstance();
			new Appointment("appt4", date4 , null);
		});
	}
}
