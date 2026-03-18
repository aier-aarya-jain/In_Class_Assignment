/**
 * 
 */
package multi_threading;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		
		Thread t1 = new Thread1();
		t1.start();
		System.out.println();
		System.out.println();
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i = 1; i<=5 ; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(" Predefined Thread : "+i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
