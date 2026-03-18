/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationship.inheritance;

/**
 * 
 */
public final class SoftwareTester extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String company;
	static String branch;
	static {
		department = "Software Tester";
		branch = "Jaipur";
		company = "Capgemini";
		city = "Jaipur";
		state = "Rajasthan";
		country = "India";
		
	}
	public void task() {
		System.out.println("Software Development");
	}
	public void reverseTk() {
		System.out.println("Explaination about latest Software Development Tools and Technique");
	}
	public void displaySoftwareDeveloperDetails() {
		System.out.println("Software Developer");
		System.out.println("======================");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Mail Id: "+mailId);
		System.out.println("Contact: "+contactNumber);
		System.out.println("Department: "+department);
		System.out.println("Branch: "+branch);
		System.out.println("Company: "+company);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Country: "+country);
		
	}

}
