import java.io.*;
class Wthread extends Thread{
Wthread(String s){
	this.setName(s);
	
}
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(this.getName()+" "+i);
	}
}
}
public class THREADNEW{
public static void main(String args[]) {
	Wthread nt1=new Wthread("FIRST");
	Wthread nt2=new Wthread("Second");
	Wthread nt3=new Wthread("Third");
try {	nt1.start();
	nt1.join();
	nt2.start();
	nt2.join();
	nt3.start();
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}
