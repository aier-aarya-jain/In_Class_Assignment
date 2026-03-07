package multi_threading;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5 ; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(" User defined Thread 2 : "+i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
