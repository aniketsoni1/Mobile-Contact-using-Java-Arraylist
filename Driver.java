// this is a driver class definition to simulate the job of
// IT Support Administrator Specialist. This class implements
// a simple mobile phone contacts management with the following
// capabilities:  
// Add new contact
// Modify contact
// Search contact
// Remove contact
// Print all contact list information
// for complete details of the application, please refer to HW6.pdf

// import necessary packages
import java.util.Scanner;

// Driver - class definition
public class Driver {
	
	// method to display the menu options
	public static void printMenu() {
		// display the menu options
		System.out.println("0 - Quit the program.");
		System.out.println("1 - Print list of contacts.");
		System.out.println("2 - Add new contact.");
		System.out.println("3 - Update existing contact.");
		System.out.println("4 - Remove contact.");
		System.out.println("5 - Search/find contact.");
		System.out.println("6 - Print the menu.");
		
	} // end of printMenu() method
	
	// main method definition
	public static void main (String[] args) {
		
		// display the menu options
		printMenu();
		
		// instantiate the class: MobilePhone 
		MobilePhone mobilephone = new MobilePhone();
		// flag to indicate if the application must quit
		boolean quit = false;
		
		// as long as user choice is not to quit the application
		while(!quit){
			// read the choice of the user
			System.out.println("Please enter option:");
			System.out.println("(Enter 6 to display the menu)");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			scanner.nextLine();
			
			// switch structure to handle the user choice
			switch(option)
			{
				case 0: // terminate the program
						System.out.println("Quit the program...");
						quit = true;
						break;
						
				case 1: // display the contacts
						mobilephone.printContacts();
						break;
						
				case 2: // add new contact
						mobilephone.addNewContact();
						break;
						
				case 3: // update an existing contact
						mobilephone.updateContact();
						break;
						
				case 4: // remove an existing contact
						mobilephone.removeContact();
						break;
						
				case 5: // search for an existing contact
						mobilephone.searchContact();
						break;
						
				case 6: // display the menu options
						printMenu();
						break;
						
			} // end of switch
			
		} // end of while
		
	} // end of main
	
} // end of class
