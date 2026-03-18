/**
 * 
 */
package edu.jecrc.sdt_java.oops.class_and_object;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * 
 */
public class JavaApp {

	    public static void execution() throws IOException {
	    	/*Student.city="Jaipur";
	    	Student.state="Rajasthan";
	    	Student.country="India";*/
	    	
	        Student s1 = new Student();
/*	        System.out.println("JavaApp Execution Called");
	        System.out.println(s1);*/
	        s1.id=001;
	        s1.name="Aarya";
	        s1.mailId="aarya@gmail.com";
	        s1.contactNumber = 554556552;
	        s1.displayStudentDetails();
	        
	        Student s2 =new Student();
	        s2.id=002;
	        s2.name="Aditya";
	        s2.mailId="aditya@gmail.com";
	        s2.contactNumber = 656556552;
	        s2.displayStudentDetails();
	        
	        
	        Student s3=new Student();
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter name:: ");
	        String nm=s.nextLine();
	        System.out.println("Enter id:: ");
	        int i=s.nextInt();
	        System.out.println("Enter email:: ");
	        String em=s.nextLine();
	        System.out.println("Enter contact number:: ");
	        long cn=s.nextLong();
	        s3.name=nm;
	        s3.id=i;
	        s3.mailId=em;
	        s3.contactNumber =cn;
	        s3.displayStudentDetails();
	        s.close();
	      //  Student s4 = new Student();
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter id:");
	        String data = br.readLine();
	        int id =Integer.parseInt(data);
	        System.out.println("Id:"+id);
	        br.close();
	    }
	
}
