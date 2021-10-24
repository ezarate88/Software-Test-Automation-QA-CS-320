package Apointment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import java.util.Calendar;
import java.util.HashMap;

import java.util.HashMap;


public class AppointmentService {
	public final HashMap<String, Appointment> appointmentList = new HashMap<String, Appointment>();
	
	public void addAppointment(String appointmentID, Calendar appointmentDate, String appointmentDescription) {
			if (appointmentList.containsKey(appointmentID)) {
				throw new IllegalArgumentException("That ID already exists.");
			}
		
		Appointment newAppointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);
		appointmentList.put(appointmentID, newAppointment);
	}
	
	public void removeAppointment(String appointmentID) {
			if (appointmentList.containsKey(appointmentID)) {
				appointmentList.remove(appointmentID);
			}
	}
	
	
	public void updateAppointmentDescription(String appointmentID, String appointmentDescription) {
			if (appointmentList.containsKey(appointmentID)) {
				appointmentList.get(appointmentID).setAppointmentDescription(appointmentDescription);
			}
	}
}
