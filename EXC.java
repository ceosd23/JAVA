import java.util.Scanner;
public class EXC{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=1;
while(i!=0) {		
		System.out.println("Press 1 to check Arithmatic exception\n"
				+ "Press 2 to check NullPointer Exception"
				+ "\nPress 3 to check array Index Out Of bound exception");
		i=sc.nextInt();
	try {
		switch(i) {
		case 1:
			int a,b;
			a=sc.nextInt();
			b=sc.nextInt();
					int c=a/b;
			System.out.println(c);
			
			break;
		case 2:
			String h=null;
			if(h.equals("Hi"))
			break;
		case 3:
			int d[]=new int[2];
			d[10]=0;
			break;
		}
		
	}
	catch(ArithmeticException e){
		System.out.println("Arithmatic exception occured don't divide by zero");
	}
		
	
	catch(NullPointerException n) {
		System.out.println("Null Pointer Exception Occured");
	}
	catch(IndexOutOfBoundsException o) {
		System.out.println("IndexOutOfBoundsException occured");
	}
	
	
	}
sc.close();
	}
}