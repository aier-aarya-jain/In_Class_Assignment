/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association;

/**
 * 
 */
public class Car {
	
	private String brand;
	private String name;
	private String make;
	private double price;
	private MediaPlayer mediaPlayer;
	private Engine engine;
	/**
	 * @param brand
	 * @param name
	 * @param make
	 * @param price
	 * @param engine
	 */
	public Car(String brand, String name, String make, double price, Engine engine) {
		super();
		this.brand = brand;
		this.name = name;
		this.make = make;
		this.price = price;
		this.engine = engine;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the mediaPlayer
	 */
	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	
	/**
	 * @param mediaPlayer the mediaPlayer to set
	 */
	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void displayCarDetails() {
		
	    System.out.println("Car Details:");
	    System.out.println("-----------");
	    System.out.println("Brand: " + brand);
	    System.out.println("Name: " + name);
	    System.out.println("Make: " + make);
	    System.out.println("Price: " + price);
	    System.out.println();

	    
	   /* System.out.println("\nEngine Information:");
	    if (engine != null) {
	        engine.displayEngineDetails();
	    } else {
	        System.out.println("No Engine Details Available");
	    }*/
	}

	
}
