// master class: MobilePhone, that holds the ArrayList of Contacts

// import necessary packages
import java.util.*;

// MobilePhone - class definition 
public class MobilePhone {
	
	// private instance variable
	private ArrayList<Contact> myContacts;
	
	// constructor
	public MobilePhone() {
		// initialize the ArrayList: myContacts with a capacity of 10
		myContacts = new ArrayList<Contact>(10);
	} // end of constructor
	
	// method to add a new contact to the list
	// - if it is a new contact, it will be added to the ArrayList
	// - if the contact already exists, prompt the user: contact exists
	public void addNewContact() {
		// read the new contact details
		System.out.println("Enter new contact name:");
		Scanner scanner = new Scanner(System.in);
		String newName = scanner.nextLine();
		System.out.println("Enter phone number:");
		String newPhoneNumber = scanner.nextLine();
		
		// loop through all the existing contacts
		// check if this contact already exits
		for (Contact currentContact : myContacts) {
			if (currentContact.getName().equals(newName) && currentContact.getPhoneNumber().equals(newPhoneNumber)) {
				// contact already exists
				System.out.println("Contact already exists in the list.");
				return;
			} // end of if
			
		} // end of for
		
		// add the new contact to the list
		Contact newContact = new Contact(newName, newPhoneNumber);
		myContacts.add(newContact);
		System.out.println("New contact added:");
		System.out.println("Name: " + newName + ", Phone: " + newPhoneNumber);
	
	} // end of addNewContact() method
	
	// method to update existing contact in the list
	// if the contact is found in the list, updates the oldContact with the newContact information
	// if the contact doesn't exist, prompts the user: contact doesn't exist
	public void updateContact() {
		// read the existing contact details
		System.out.println("Enter contact name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Enter new contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phone number:");
		String newPhoneNumber = scanner.nextLine();
		
		// loop through all the existing contacts
		// check if this contact already exits
		for (Contact currentContact : myContacts) {
			if (currentContact.getName().equals(name)) {
				// contact found in the list
				// form an object and over-write the existing object with the new one 
				Contact newContact = new Contact(newName, newPhoneNumber);
				myContacts.set(myContacts.indexOf(currentContact), newContact);
				System.out.println("Successfully updated record.");
				return;
			} // end of if 
			
		} // end of for
		
		// contact not found in the list to update
		System.out.println("Contact is not found in the list.");
		
	} // end of updateContact() method
	
	// method to delete an existing contact in the list
	// if the contact is found in the list, removes it
	// if the contact doesn't exist, prompts the user: contact doesn't exist
	public void removeContact() {
		// read the existing contact details
		System.out.println("Enter existing contact name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		// loop through all the existing contacts
		// check if this contact already exits
		for (Contact currentContact : myContacts) {
			if (currentContact.getName().equals(name)) {
				// contact found in the list, just remove it from the list
				myContacts.remove(currentContact);
				System.out.println(name + " was deleted.");
				System.out.println("Successfully deleted.");
				return;
			} // end of if
			
		} // end of for
		
		// contact not found in the list to remove
		System.out.println("Contact is not found in the list.");
		
	} // end of removeContact() method
	
	// method to search for a contact in the list
	// if the contact is found in the list, prints the contact information
	// if the contact doesn't exist, prompts the user: contact doesn't exist
	public int searchContact() {
		// read the existing contact details
		System.out.println("Enter existing contact name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		// loop through all the existing contacts
		// check if this contact already exits
		for (Contact currentContact : myContacts) {
			if (currentContact.getName().equals(name)) {
				// contact found in the list, display the contact information
				System.out.println("Name: " + name + ", phone number: " + currentContact.getPhoneNumber());
				// return 1 on success
				return 1;
			} // end of if
			
		} // end of for
		
		// contact not found in the list to remove
		System.out.println("Contact is not found in the list.");
		// return 0 on failure
		return 0;
	} // end of searchContact() method
	
	// method to display all the contacts in the list
	public void printContacts() {
		System.out.println("Contact List");
		// loop through all the existing contacts and display each of them
		for (Contact currentContact : myContacts) {
			System.out.println(myContacts.indexOf(currentContact)+1 + "." + currentContact.getName() + " -> " + currentContact.getPhoneNumber());
		} // end of for
		
	} // end of printContacts() method
	
} // end of MobilePhone class 
