/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationship.inheritance;

/**
 * 
 */
public class Employee {
		int id;
		String name ;
		String mailId;
		long contactNumber;
		static String city;
		static String state;
		static String country;
		public void entry()
		{
			System.out.println("Employee entered into the campus..");
		}
		public void login()
		{
			System.out.println("Employee logged into the office..");
		}
		public void meeting()
		{
			System.out.println("Employee is attending the meeting..");
		}
		public void logout()
		{
			System.out.println("Employee logged out from the office..");
		}
		public void exit()
		{
			System.out.println("Employee exited from the campus..");
		}
}
