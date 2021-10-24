package Apointment;

import java.util.Calendar;


public class Appointment {
	private String appointmentID;
	private Calendar appointmentDate;
	private String appointmentDescription;
	Calendar c = Calendar.getInstance();
	

	
	public Appointment (String appointmentID, Calendar appointmentDate, String appointmentDescription) {
		if (appointmentID == null || appointmentID.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if (appointmentDate == null || appointmentDate.before(c)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if (appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentDescription = appointmentDescription;
	}
	
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public Calendar getAppointmentDate() {
		return appointmentDate;
	}
	
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	
	public void setAppointmentDescription (String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}
	
	
}
