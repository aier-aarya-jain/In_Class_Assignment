/**
 * 
 */
package edu.jecrc.sdt_java.oops.class_and_object;

/**
 * 
 */
public class Student {
	

	    // Instance variables
		int id;
	    String name;
	    String mailId;
	    long  contactNumber;

	    // Static variables
	    static String city;
	    static String state;
	    static String country;
	    static {
	    	city="Jaipur";
	    	state="Rajasthan";
	    	country="India";
	    }
	   	    // Entry method
	    public void entry() {
	        System.out.println("Student Entered Into The Campus!");
	    }

	    // Login method
	    public void login() {
	        System.out.println("Student Logged Into The Class!");
	    }

	    // Attending method
	    public void attending() {
	        System.out.println("Student is attending in the Lecture!");
	    }

	    // Exit method
	    public void exit() {
	        System.out.println("Student Exited From The Campus!");
	    }

	    // Logout method
	    public void logout() {
	        System.out.println("Student Logged Out From The Class!");
	    }

	    // Display student details
	    public void displayStudentDetails() {
	        System.out.println("\n--- Student Details ---");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Mail ID: " + mailId);
	        System.out.println("Contact Number: " + contactNumber);
	        System.out.println("City: " + city);
	        System.out.println("State: " + state);
	        System.out.println("Country: " + country);
	    }

	    
}

