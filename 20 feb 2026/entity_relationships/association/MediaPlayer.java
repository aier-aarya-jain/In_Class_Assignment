/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association;

/**
 * 
 */
public class MediaPlayer {
	
	private String brand;
	private String name;
	private double price;
	/**
	 * @param brand
	 * @param name
	 * @param price
	 */
	public MediaPlayer(String brand, String name, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	public void displayMediaPlayerDetails() {
	    System.out.println("Media Player Details:");
	    System.out.println("------------------");
	    System.out.println("Brand: " + brand);
	    System.out.println("Name: " + name);
	    System.out.println("Price: " + price);
	    System.out.println();
	}


}
