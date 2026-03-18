/**
 * 
 */
package collections_framework_list;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * 
 */
public class JavaApplication {
		public static void execution() {
			 
			 	Scanner sc = new Scanner(System.in);

		        ArrayList<Student> al = new ArrayList<>();

		        System.out.print("How many students you want to add?: ");
		        int n = sc.nextInt();

		        // CREATE
		        for (int i = 0; i < n; i++) {

		            System.out.print("Enter Student ID: ");
		            int id = sc.nextInt();

		            System.out.print("Enter Name: ");
		            String name = sc.next();

		            System.out.print("Enter Mail ID: ");
		            String mail = sc.next();

		            System.out.print("Enter Contact Number: ");
		            long contact = sc.nextLong();

		            al.add(new Student(id, name, mail, contact));
		        }

		        System.out.println("Total Students Added: " + al.size());
		        System.out.println();

		        int choice;

		        do {

		            System.out.println("\n1. Display Student");
		            System.out.println("2. Update Student");
		            System.out.println("3. Delete Student");
		            System.out.println("4. Exit");

		            System.out.println("Enter your choice:");
		            choice = sc.nextInt();

		            switch (choice) {

		                // READ
		                case 1:

		                    System.out.print("Enter Student ID to display: ");
		                    int sid = sc.nextInt();

		                    boolean found = false;

		                    for (Student s : al) {

		                        if (s.getId() == sid) {

		                            System.out.println("ID: " + s.getId());
		                            System.out.println("Name: " + s.getName());
		                            System.out.println("Mail: " + s.getMailid());
		                            System.out.println("Contact: " + s.getContactnumber());

		                            found = true;
		                        }
		                    }

		                    if (!found)
		                        System.out.println("Student not found");
		                    System.out.println();

		                    break;

		                // UPDATE
		                case 2:

		                    System.out.println("Enter Student ID to update:");
		                    int uid = sc.nextInt();

		                    for (Student s : al) {

		                        if (s.getId() == uid) {

		                            System.out.println("1.Update Mail ID");
		                            System.out.println("2.Update Contact Number");

		                            int uchoice = sc.nextInt();

		                            if (uchoice == 1) {

		                                System.out.println("Enter new Mail ID:");
		                                String newMail = sc.next();

		                                s.setMailid(newMail);
		                            }

		                            else if (uchoice == 2) {

		                            	System.out.println("Enter new Contact Number:");
		                            	long newContact = sc.nextLong();
		                            	s.setContactnumber(newContact);
		                            }

		                            System.out.println("Record Updated");
		                        }
		                    }
		                    System.out.println();

		                    break;

		                // DELETE
		                case 3:

		                    System.out.println("Enter Student ID to delete:");
		                    int did = sc.nextInt();

		                    Iterator<Student> it = al.iterator();

		                    boolean deleted = false;

		                    while (it.hasNext()) {

		                        Student s = it.next();

		                        if (s.getId() == did) {

		                            it.remove();
		                            deleted = true;
		                            System.out.println("Student Deleted");
		                        }
		                    }

		                    if (!deleted)
		                        System.out.println("Student not found");
		                    System.out.println();

		                    break;

		            }

		        } 
		        while (choice != 4);

		        sc.close();
		}
}
