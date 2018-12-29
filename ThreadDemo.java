/*class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread: "+t);
		t.start();
		}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread "+i);
			Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread Interrupteed");
		}
	
	System.out.println("Exiting Child Thread");
}
}
public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main thread ;" +i);
				Thread.sleep(1);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
			
		}
		System.out.println("Exiting Main Thread");

	}

}
*/