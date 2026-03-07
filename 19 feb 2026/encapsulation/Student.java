/**
 * 
 */
package edu.jecrc.sdt_java.oops.encapsulation;

/**
 * 
 */
public class Student {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private static String city;
	private static String state;
	private static String country;
	
	// Parameterized constructor
    public Student(int id, String name,
                   String mailId, long contactNumber) {

        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    // Default constructor
    public Student() {
    }
    
    //getters and setters method 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mi) {
		this.mailId=mi;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long cn) {
		this.contactNumber=cn;
	}
	public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Student.city = city;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Student.state = state;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Student.country = country;
    }

    // Display method
    public void displayStudentDetails() {

        System.out.println("\n--- Student Details ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }
}
