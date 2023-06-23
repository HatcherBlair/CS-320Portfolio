package appointmentservice;

import java.util.Date;

public class Appointment {
	
	private final String appointmentID;
	private Date appointmentDate;
	private String appointmentDescription;
	
	Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		
		// Checks to make sure appointmentID is <=10 characters and != null
		if (appointmentID.length() > 10 || appointmentID == null) {
			throw new IllegalArgumentException("Invalid appointmentID");
		}
		
		// Checks to make sure the appointmentDescription is <=50 characters and != null
		if (appointmentDescription.length() > 50 || appointmentDescription == null) {
			throw new IllegalArgumentException("Invalid appointment description");
		}
		
		// Checks to make sure the date is in the future and not null
		if (appointmentDate.before(new Date()) || appointmentDate == null) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}
		
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentDescription = appointmentDescription;
	}

	/**
	 * @return the appointmentID
	 */
	public String getAppointmentID() {
		return appointmentID;
	}

	/**
	 * @return the appointmentDate
	 */
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * @return the appointmentDescription
	 */
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
}
