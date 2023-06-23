package appointmentservice;

import java.util.Date;
import java.util.LinkedList;

public class AppointmentService {
	private static LinkedList<Appointment> appointmentIDList = new LinkedList<Appointment>();
	
	public void addAppointment(String appointmentID, String appointmentDescription, int appointmentYear, int appointmentMonth, int appointmentDay) {
		// Checks to make sure the appointmentID is unique
		for (int i=0; i < appointmentIDList.size(); i++) {
			if (appointmentIDList.get(i).getAppointmentID().equals(appointmentID)) {
				throw new IllegalArgumentException("appointment ID is not unique");
			}
		}
		@SuppressWarnings("deprecation")
		Date newDate = new Date(appointmentYear - 1900, appointmentMonth - 1, appointmentDay);
		Appointment newAppointment = new Appointment(appointmentID, newDate, appointmentDescription);
		appointmentIDList.add(newAppointment);
	}
	
	public void deleteAppointment(String appointmentID) {
		// Checks to make sure the appointmentID is unique
		for (int i=0; i < appointmentIDList.size(); i++) {
			if (appointmentIDList.get(i).getAppointmentID() == appointmentID) {
				appointmentIDList.remove(i);
			}
		}
	}
	
	/*
	 * Gets a appointment with the specified appointment ID
	 * @param ID
	 * This method is used for testing
	 */
	public Appointment getAppointment(String ID) {
		
		// Searches linked list for contact and returns if found
		for (int i=0; i < appointmentIDList.size(); i++) {
			if (appointmentIDList.get(i).getAppointmentID() == ID) {
				return appointmentIDList.get(i);
			}
		}
		
		// Creating a contact to return
		Appointment newAppointment = new Appointment("N/A", new Date(), "N/A");
		return newAppointment;
	}
}
