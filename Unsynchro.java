class Callme{
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
class Caller implements Runnable{
	String n;
	Callme target;
	Thread t;
	Caller(Callme tar,String s){
		target=tar;
		n=s;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		target.call(n);
	}
}
public class Unsynchro{

	public static void main(String[] args) {
		Callme target=new Callme();
		Caller ob1=new Caller(target,"Hello");
		Caller ob2=new Caller(target,"Synchronised");
		Caller ob3=new Caller(target,"World");
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
