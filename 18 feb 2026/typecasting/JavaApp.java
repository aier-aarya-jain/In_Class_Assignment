package edu.jecrc.sdt_java.oops.typecasting;

public class JavaApp {
	
	public static void execution() {
		/*Typecasting.widening();
		Typecasting.narrowing();
		Typecasting.boxing();
		Typecasting.unboxing();*/
		// Generalisation single object of super class can store any of the sub classes
		Employee e ;
		e= new SoftwareDeveloper();
		e.entry();
		e.meeting();
		e.exit();
		
		SoftwareDeveloper sd = (SoftwareDeveloper)e ;
		sd.task();
		sd.reverseTk();
		
		e= new SoftwareTester();
		e.entry();
		e.meeting();
		e.exit();
		
		SoftwareTester st = (SoftwareTester)e ;
		st.task();
		st.reverseTk();
		
		/*Employee e1 = new SoftwareTester();
		e1.entry();
		e1.meeting();
		e1.exit();
		
		SoftwareTester st = (SoftwareTester)e1 ;
		st.task();
		st.reverseTk();
		*/
	}
	
	
}
