package contactservice;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	public final String contactID = "1234567890";
	public final String longContactID = "1234567890111";
	public final String firstName = "Hatcher";
	public final String longFirstName = "HatcherLong";
	public final String lastName = "Blair";
	public final String longLastName = "BlairIsReallyLong";
	public final String number = "1234567890";
	public final String longNumber = "12345678901";
	public final String shortNumber = "123456789";
	public final String address = "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi";
	public final String longAddress = "DCbDzH1yfLkYo34jJJTmUKfJyn2dKiaaaa";
	
	@Test
	void testCreateContactService() {
		ContactService contactService = new ContactService();
		contactService.addContact(contactID, firstName, lastName, number, address);
		assertTrue(contactService.getContact(contactID).getContactID().equals(contactID));
	}

	@Test
	void testLongContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(longContactID, firstName, lastName, number, address);
		});
	}
	
	@Test
	void testNonUniqueContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.addContact(contactID, firstName, lastName, number, address);
		});
	}
	
	@Test
	void testLongFirstNameCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, longFirstName, lastName, number, address);
		});
	}
	
	@Test
	void testLongFirstNameChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.updateFirstName(contactID, longFirstName);
		});
	}
	
	@Test
	void testLongLastNameCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, longLastName, number, address);
		});
	}
	
	@Test
	void testLongLastNameChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.updateLastName(contactID, longLastName);
		});
	}
	
	@Test
	void testLongNumberCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, longNumber, address);
		});
	}
	
	@Test
	void testLongNumberChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.updateNumber(contactID, longNumber);
		});
	}
	
	@Test
	void testShortNumberCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, shortNumber, address);
		});
	}
	
	@Test
	void testShortNumberChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.updateNumber(contactID, shortNumber);
		});
	}
	
	@Test
	void testLongAddressCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, longAddress);
		});
	}
	
	@Test
	void testLongAddressChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.addContact(contactID, firstName, lastName, number, address);
			contactService.updateAddress(contactID, longAddress);
		});
	}
}
