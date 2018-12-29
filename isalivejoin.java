class New_Thread implements Runnable{
	String n;
	Thread t;
	New_Thread(String name){
		n=name;
		t=new Thread(this,n);
		System.out.println(n+" "+t);
		t.start();
		
	
	}
	public void run(){
		try {
			for(int i=5;i>0;i--) {
				System.out.println("CHILD THREAD "+n+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted "+n);
			
		}
		System.out.println("Exiting child thread "+ n);
	}
	
}
public class isalivejoin {
public static void main(String args[]) {
	New_Thread ob1=new New_Thread("ONE");
	New_Thread ob2=new New_Thread("TWO");
	New_Thread ob3=new New_Thread("THREE");
	System.out.println("Thread one is running "+ob1.t.isAlive());
	System.out.println("Thread two is running "+ob2.t.isAlive());
	System.out.println("Thread three is running "+ob3.t.isAlive());
	try {
		System.out.println("Waiting for thread to close");
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
		}
	catch(Exception e) {
		System.out.println("Main Interrupted");
	}
	System.out.println("Thread one is running "+ob1.t.isAlive());
	System.out.println("Thread two is running "+ob2.t.isAlive());
	System.out.println("Thread three is running "+ob3.t.isAlive());
	System.out.println("Exiting main");
	
	
}
}
