/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Engine engine = new Engine(1500,"Water Based",4);
	
		//Associaton :: engine and mediaplayer object in car object
		Car car=new Car("Hyundai","Creta","Made in India",963963.963973,engine);
		car.displayCarDetails();
		car.getEngine().displayEngineDetails();
		
		MediaPlayer media=new MediaPlayer("Music Player","Boat",369369.369);
		
		//setter Method INjection
		car.setMediaPlayer(media);
		car.getMediaPlayer().displayMediaPlayerDetails();
	}
}
