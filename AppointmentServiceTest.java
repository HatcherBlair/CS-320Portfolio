package appointmentservice;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
	public final String appointmentID = "1234567890";
	public final String uniqueAppointmentID = "0987654321";
	public final String longAppointmentID = "1234567890111";
	public final int month = 6;
	public final int day = 15;
	public final int year = 2023;
	public final int earlyYear = 2022;
	public final String description = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBw";
	public final String longDescription = "YSTNswX52MItBuUAUVRWorSeluBFHRzx9sPLJ4hGhvBzZYPBBwasdasgfawdra";

	@Test
	void testCreateAppointmentService() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment(uniqueAppointmentID, description, year, month, day);
		assertTrue(appointmentService.getAppointment(appointmentID).getAppointmentID().equals(appointmentID));
	}
	
	@Test
	void testNonUniqueAppointmentID() {
		assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService appointmentService = new AppointmentService();
			appointmentService.addAppointment(appointmentID, description, year, month, day);
			appointmentService.addAppointment(appointmentID, description, year, month, day);
		});
	}
}
