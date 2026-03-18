/**
 * 
 */
package edu.jecrc.sdt_java.oops.class_and_object;

import java.io.IOException;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		
	//	JavaApp.execution();
		/*	System.out.println(Members.sv);
			Members.sm();
			
			Members m = new Members();
			System.out.println(m.nsv);
			// m.nsm();*/
		
		int num=2020;
		 boolean res= JavaAppBL.ab(num);
		 if(res) {
			 System.out.println(num+" is a Autobiographical number");
		 }
		 else {
			 System.out.println(num+" is not a Autobiographical number");
			 
		 }
		 num=123;
		 res=JavaAppBL.spy(num);
		 if(res) {
			 System.out.println(num+" is a Spy number");
		 }
		 else {
			 System.out.println(num+" is not a Spy number");
		 }
		 num = 1234;
		 res= JavaAppBL.xylem(num);
	     if (res) {
	            System.out.println(num+" is a Xylem Number");
	        }
	     else {
	    	 System.out.println(num+" is not a Xylem Number");
	     }
	    num = 135;
		 res= JavaAppBL.disarium(num);
	     if (res) {
	            System.out.println(num +" is a Disarium Number");
	     }
	     else {
	    	 System.out.println(num +" is not a Disarium Number");
	     
	     }
	 
	}

}
