package contactservice;

import java.util.LinkedList;

public class ContactService {

	// List of all the contacts
	private LinkedList<Contact> contactList = new LinkedList<Contact>();
	
	
	/*
	 * Adds a contact to the contact list
	 * @param firstName, lastName, number, address
	 * firstName <= 10 characters
	 * lastName <= 10 characters
	 * number == 10 characters
	 * address <= 30 characters
	 */
	public void addContact(String contactID, String firstName, String lastName, String number, String address) {
		// Checks to make sure contactID is unique
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == contactID) {
				throw new IllegalArgumentException("Contact ID is not unique");
			}
		}
		
		// Add the contact to the linked list
		Contact newContact = new Contact(contactID, firstName, lastName, number, address);
		contactList.add(newContact);	
	}
	
	/*
	 * Deletes a contact from the list
	 * @param ID
	 */
	public void deleteContact(String ID) {
		for (int i=0; i < contactList.size(); i++) {
			Contact contact = contactList.get(i);
			if (contact.getContactID() == ID) {
				contactList.remove(i);
			}
		}
	}
	
	/*
	 * Updates the first name of a contact
	 * @param ID, firstName
	 */
	public void updateFirstName(String ID, String firstName) {
		
		// Checks to make sure first name is <= 10 characters and !=null
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// Searches the linked list for contact and updates first name
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == ID) {
				contactList.get(i).setFirstName(firstName);
			}
		}
	}
	
	/*
	 * Updates the last name of a contact
	 * @param ID, lastName
	 */
	public void updateLastName(String ID, String lastName) {
		
		// Checks to make sure last name is <= 10 characters and !=null
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// Searches the linked list for contact and updates last name
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == ID) {
				contactList.get(i).setLastName(lastName);
			}
		}
	}
	
	/*
	 * Updates the number of a contact
	 * @param ID, number
	 */
	public void updateNumber(String ID, String number) {
		
		// Checks to make sure number is == 10 characters and !=null
		if(number == null || number.length()!=10) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		// Searches the linked list for contact and updates number
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == ID) {
				contactList.get(i).setNumber(number);
			}
		}
	}
	
	/*
	 * Updates the address of a contact
	 * @param ID, address
	 */
	public void updateAddress(String ID, String address) {
		
		// Checks to make sure address is <= 30 characters and !=null
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
				
		// Searches linked list for contact and updates address
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == ID) {
				contactList.get(i).setAddress(address);
			}
		}
	}
	
	/*
	 * Gets a contact with the specified contact ID
	 * @param ID
	 * This method is used for testing
	 */
	public Contact getContact(String ID) {
		
		// Searches linked list for contact and returns if found
		for (int i=0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID() == ID) {
				return contactList.get(i);
			}
		}
		
		// Creating a contact to return
		Contact newContact = new Contact("0000000000", "Empty", "Empty", "Empty", "Empty");
		return newContact;
	}
}
