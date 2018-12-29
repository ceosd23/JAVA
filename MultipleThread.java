class Ne_Thread implements Runnable{
	String name;
	Thread t;
	Ne_Thread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread "+t);
		t.start();
	}
public void run() {
	try {
		for(int i=5;i>0;i--) {
			System.out.println(name+" "+i);
			Thread.sleep(500);
		}
	}
		catch(InterruptedException e ) {
			System.out.println("Child Interrupoeted");
	
	}
System.out.println("Exiting "+name);	
}
}

public class MultipleThread {
	public static void main(String args[]) {
new Ne_Thread("One");
new Ne_Thread("Two");
new Ne_Thread("Three");
try {
	
		System.out.println("Main THREAD ");
		Thread.sleep(10000);
	}

	catch(InterruptedException e ) {
		System.out.println("Main Interrupoeted");

}
System.out.println("Exiting Child");	
}
}
