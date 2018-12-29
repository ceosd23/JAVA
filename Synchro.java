class Call{
	void call(String msg) {
		System.out.print("["+msg);
	
	try {
		Thread.sleep(1000);
		
	}
	catch(InterruptedException e) {
		System.out.println("Interrupted");
	}
	System.out.println("]");
	}
	
	
}
class Caler implements Runnable{
	String n;
	Call target;
	Thread t;
	Caler(Call tar,String s){
		target=tar;
		n=s;
		t=new Thread(this);
		t.start();
	}
	/*888888888888888888888888 Synchronised block8888888*/
	public void run() {
		synchronized(target) {
		target.call(n);
	}
}
	}
public class Synchro{

	public static void main(String[] args) {
		Call target=new Call();
		Caler ob1=new Caler(target,"Hello");
		Caler ob2=new Caler(target,"Synchronised");
		Caler ob3=new Caler(target,"World");
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted Main");
		}
System.out.println("Exiting Main");
		
	}

}

