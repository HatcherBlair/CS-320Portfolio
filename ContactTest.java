package contactservice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {
	
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
	void testContactCreate() {
		Contact contact = new Contact("1234567890", "Hatcher", "Blair", "1234567890", "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi");
		assertTrue(contact.getContactID().equals("1234567890"));
		assertTrue(contact.getFirstName().equals("Hatcher"));
		assertTrue(contact.getLastName().equals("Blair"));
		assertTrue(contact.getContactID().equals("1234567890"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("DCbDzH1yfLkYo34jJJTmUKfJyn2dKi"));
	}
	
	@Test
	void testFirstNameChange() {
		Contact contact = new Contact("1234567890", "Hatcher", "Blair", "1234567890", "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi");
		assertTrue(contact.getFirstName().equals("Hatcher"));
		contact.setFirstName("Testing");
		assertTrue(contact.getFirstName().equals("Testing"));
	}
	
	@Test
	void testLastNameChange() {
		Contact contact = new Contact("1234567890", "Hatcher", "Blair", "1234567890", "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi");
		assertTrue(contact.getLastName().equals("Blair"));
		contact.setLastName("Testing");
		assertTrue(contact.getLastName().equals("Testing"));
	}
	
	@Test
	void testNumberChange() {
		Contact contact = new Contact("1234567890", "Hatcher", "Blair", "1234567890", "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi");
		assertTrue(contact.getNumber().equals("1234567890"));
		contact.setNumber("0987654321");
		assertTrue(contact.getNumber().equals("0987654321"));
	}
	
	@Test
	void testAddressChange() {
		Contact contact = new Contact("1234567890", "Hatcher", "Blair", "1234567890", "DCbDzH1yfLkYo34jJJTmUKfJyn2dKi");
		assertTrue(contact.getAddress().equals("DCbDzH1yfLkYo34jJJTmUKfJyn2dKi"));
		contact.setAddress("Testing");
		assertTrue(contact.getAddress().equals("Testing"));
	}
	
	@Test
	void testLongContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(longContactID, firstName, lastName, number, address);
		});
	}
	
	@Test
	void testLongFirstNameCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(contactID, longFirstName, lastName, number, address);
		});
	}
	
	@Test
	void testLongFirstNameChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(contactID, firstName, lastName, number, address);
			contact.setFirstName(longFirstName);
		});
	}
	
	@Test
	void testLongLastNameCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(contactID, firstName, longLastName, number, address);
		});
	}
	
	@Test
	void testLongLastNameChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(contactID, firstName, lastName, number, address);
			contact.setLastName(longLastName);
		});
	}
	
	@Test
	void testLongNumberCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(contactID, firstName, lastName, longNumber, address);
		});
	}
	
	@Test
	void testLongNumberChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(contactID, firstName, lastName, number, address);
			contact.setNumber(longNumber);
		});
	}
	
	@Test
	void testShortNumberCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(contactID, firstName, lastName, shortNumber, address);
		});
	}
	
	@Test
	void testShortNumberChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(contactID, firstName, lastName, number, address);
			contact.setNumber(shortNumber);
		});
	}
	
	@Test
	void testLongAddressCreate() {
		assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(contactID, firstName, lastName, number, longAddress);
		});
	}
	
	@Test
	void testLongAddressChange() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(contactID, firstName, lastName, number, address);
			contact.setAddress(longAddress);
		});
	}
	
}
