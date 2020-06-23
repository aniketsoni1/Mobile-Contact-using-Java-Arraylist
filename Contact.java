// Contact class for contacts: name and phone number

// Contact - class definition
public class Contact {
	
	// private instance variables
	private String name;
	private String phoneNumber;
	
	// constructor definition
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	} // end of constructor
	
	// get method for name
	String getName() {
		return name;
	} // end of getName() method
	
	// get method for phone number
	String getPhoneNumber() {
		return phoneNumber;
	} // end of getPhoneNumber() method

} // end of Contact class 
