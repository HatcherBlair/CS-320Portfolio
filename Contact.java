package contactservice;

public class Contact {
	
	// Class variables
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	
	// Constructor
	Contact(String contactID, String firstName, String lastName, String number, String address) {
		// Checks to make sure contactID is <= 10 characters and !=null
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		// Checks to make sure first name is <= 10 characters and !=null
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// Checks to make sure last name is <= 10 characters and !=null
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// Checks to make sure number is == 10 characters and !=null
		if(number == null || number.length()!=10) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		// Checks to make sure address is <= 30 characters and !=null
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		this.contactID = contactID;
	}

	/**
	 * @return the contactID
	 */
	public String getContactID() {
		return contactID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		// Checks to make sure first name is <= 10 characters and !=null
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		// Checks to make sure last name is <= 10 characters and !=null
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		// Checks to make sure number is == 10 characters and !=null
		if(number == null || number.length()!=10) {
			throw new IllegalArgumentException("Invalid number");
		}
		this.number = number;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		// Checks to make sure address is <= 30 characters and !=null
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
	
}

