/**
 * 
 */
package edu.jecrc.sdt_java.oops.encapsulation;

/**
 * 
 */
public class JavaApp {
	
	public static void execution()
	{
		// Static values via setters
        Student.setCity("Mumbai");
        Student.setState("Maharashtra");
        Student.setCountry("India");

        // Object 1
        Student s1 =new Student(1,"Rohit","rohit@gmail.com", 9876543210L);

        // Object 2 using setters
        Student s2 = new Student();

        s2.setId(2);
        s2.setName("Rani Sharma");
        s2.setMailId("rani@gmail.com");
        s2.setContactNumber(9876543211L);

        // Display
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        
	}

}
