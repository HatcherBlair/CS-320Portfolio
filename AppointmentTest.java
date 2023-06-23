package appointmentservice;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentTest {
	public final String appointmentID = "1234567890";
	public final String longAppointmentID = "1234567890111";
	@SuppressWarnings("deprecation")
	public final Date appointmentDate = new Date(2023 - 1900, 6 - 1, 15);
	@SuppressWarnings("deprecation")
	public final Date earlyAppointmentDate = new Date(2019 - 1900,1 - 1,1);
	public final String description = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBw";
	public final String longDescription = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBwasdasgfawdra";
	
	@Test
	public void testTaskCreate() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, description);
		assertTrue(appointment.getAppointmentID().equals(appointmentID));
		assertTrue(appointment.getAppointmentDate().equals(appointmentDate));
		assertTrue(appointment.getAppointmentDescription().equals(description));
	}
	
	@Test
	public void testEarlyDateCreation() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Appointment appointment = new Appointment(appointmentID, earlyAppointmentDate, description);
		});
	}

	@Test
	public void testLongAppointmentIDCreation() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Appointment appointment = new Appointment(longAppointmentID, appointmentDate, description);
		});
	}
	
	@Test
	public void testLongDescriptionCreation() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Appointment appointment = new Appointment(appointmentID, appointmentDate, longDescription);
		});
	}
}
