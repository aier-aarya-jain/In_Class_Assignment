/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association;

/**
 * 
 */
public class Engine {
	private double cc;
	private String coolingSystem;
	private int CyinderNumber;
	/**
	 * @param cc
	 * @param coolingSystem
	 * @param cyinderNumber
	 */
	public Engine(double cc, String coolingSystem, int cyinderNumber) {
		super();
		this.cc = cc;
		this.coolingSystem = coolingSystem;
		CyinderNumber = cyinderNumber;
	}
	/**
	 * @return the cc
	 */
	public double getCc() {
		return cc;
	}
	/**
	 * @return the coolingSystem
	 */
	public String getCoolingSystem() {
		return coolingSystem;
	}
	/**
	 * @return the cyinderNumber
	 */
	public int getCyinderNumber() {
		return CyinderNumber;
	}
	public void displayEngineDetails() {
		
	    System.out.println("Engine Details:");
	    System.out.println("-------------");
	    System.out.println("CC: " + cc);
	    System.out.println("Cooling System: " + coolingSystem);
	    System.out.println("Cylinder Number: " + CyinderNumber);
	    System.out.println();
	    
	}

}
