package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Apointment.AppointmentService;
import java.util.Calendar;

class AppointmentServiceTest {

	@Test
	void testAppointmentsAddWithId() {
		AppointmentService service = new AppointmentService();
		Calendar date1 = Calendar.getInstance();
		date1.set(2024, 10, 22);
		service.addAppointment("appt1", date1, "Dad's Birthday");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addAppointment("appt1", date1, "Dad's Birthday");
		});
		
	}
	
	@Test
	void testAppointmentDeleteWithId() {
		AppointmentService service = new AppointmentService();
		Calendar date1 = Calendar.getInstance();
		date1.set(2024, 10, 22);
		service.addAppointment("appt1", date1, "Dad's Birthday");
		Calendar date2 = Calendar.getInstance();
		date2.set(2024, 01, 04);
		service.addAppointment("appt2", date2, "Bro's Birthday");
		service.removeAppointment("appt2");
		assert(service.appointmentList.size() == 1);
		
	}
	
}
