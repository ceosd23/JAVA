import java.util.Scanner;
public class ARITHMATIC_EXCEPTION {
	public static void main(String... args) {
	Scanner sc=new Scanner(System.in);	
	
	try {
		int a,b,c;
		System.out.println("Enter the two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Quotient "+c);
	}
	
	
	catch(ArithmeticException e){
		System.out.println("Arithmatic exception occured don't divide by zero");
	}
finally {
	System.out.println("Inside Finally Block");
}
	
}
}