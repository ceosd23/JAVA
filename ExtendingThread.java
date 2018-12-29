class NewThread extends Thread{
	NewThread(String name){
		super(name);
		System.out.println(this);
		start();
	}

	public void run() {
		try {
			if(this.getName()=="t1") {
			for(int i=1;i<=10;i+=2) {
				System.out.println(i);
				Thread.sleep(500);}
			}
		else if(this.getName()=="t2") {
			for(int i=2;i<=10;i+=2) {
				System.out.println(i);
				Thread.sleep(500);}
			}
			
		}
		
			catch(InterruptedException e ) {
				System.out.println("INTRUPPTED");
		
		}
	System.out.println("Exiting thread");	
	}
}
class ExtendingThread {
public static void main(String args[]) {
	NewThread t1=new NewThread("t1");
	NewThread t2=new NewThread("t2");


}
}
