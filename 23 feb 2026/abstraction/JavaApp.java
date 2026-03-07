/**
 * 
 */
package edu.jecrc.sdt_java.oops.abstraction;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		//State s = new State(); // cannot instantiate abstract class object
		/*Rajasthan r = new Rajasthan();
		Karnataka k = new Karnataka();
		
		r.regionalLanguage();
		k.regionalLanguage();*/
		
		
		Concrete c = new Concrete();
		c.incomplete();
		Interface.complete();
	}
}
