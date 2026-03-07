package Task_One;
import java.util.Scanner;
/*public class JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter University ID");
            int uid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter University Name");
            String uname = sc.nextLine();

            System.out.println("Enter number of colleges");
            int ccount = sc.nextInt();

            College[] colleges = new College[ccount];

            for (int i = 0; i < ccount; i++) {

                System.out.println("Enter College ID");
                int cid = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter College Name");
                String cname = sc.nextLine();

                colleges[i] = new College(cid, cname, null);
            }

            University university = new University(uid, uname, colleges);

            System.out.println("\n--- Displaying Data ---");
            university.display();

        }

        catch (Exception e) {

            System.out.println("Invalid Input Occurred");
            e.printStackTrace();
        }

        finally {

            sc.close();
            System.out.println("Program Finished Successfully");
        }
    
	}
}*/




public class JavaApp {

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        try {

            // ---------- UNIVERSITY ----------
            System.out.println("Enter University ID:");
            int uid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter University Name:");
            String uname = sc.nextLine();

            System.out.println("Enter number of Colleges:");
            int ccount = sc.nextInt();

            College[] colleges = new College[ccount];

            // ---------- COLLEGE LOOP ----------
            for (int i = 0; i < ccount; i++) {

                System.out.println("\nEnter College ID:");
                int cid = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter College Name:");
                String cname = sc.nextLine();

                System.out.println("Enter number of Departments:");
                int dcount = sc.nextInt();

                Department[] departments = new Department[dcount];

                // ---------- DEPARTMENT LOOP ----------
                for (int j = 0; j < dcount; j++) {

                    System.out.println("\nEnter Department ID:");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Department Name:");
                    String dname = sc.nextLine();

                    System.out.println("Enter number of Students:");
                    int scount = sc.nextInt();

                    Student[] students = new Student[scount];

                    // ---------- STUDENT LOOP ----------
                    for (int k = 0; k < scount; k++) {

                        System.out.println("\nEnter Student ID:");
                        int sid = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Name:");
                        String sname = sc.nextLine();

                        System.out.println("Enter Student Email:");
                        String email = sc.nextLine();

                        System.out.println("Enter Contact Number:");
                        long contact = sc.nextLong();

                        System.out.println("Enter number of Projects:");
                        int pcount = sc.nextInt();

                        Project[] projects = new Project[pcount];

                        // ---------- PROJECT LOOP ----------
                        for (int l = 0; l < pcount; l++) {

                            System.out.println("\nEnter Project ID:");
                            int pid = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter Project Name:");
                            String pname = sc.nextLine();

                            projects[l] = new Project(pid, pname);
                        }

                        students[k] = new Student(sid, sname, email, contact, projects);
                    }

                    departments[j] = new Department(did, dname, students);
                }

                colleges[i] = new College(cid, cname, departments);
            }

            University university = new University(uid, uname, colleges);

            System.out.println("\n====== DISPLAYING COMPLETE DATA ======");
            university.display();
        }

        catch (Exception e) {

            System.out.println("Invalid Input Occurred");
            e.printStackTrace();
        }

        finally {

            sc.close();
            System.out.println("\nProgram Finished Successfully");
        }
    }
}
