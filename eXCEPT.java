/*WAP to accept name and age of a person from the command prompt and ensure the age entered is>=18 And less than 60.
Display proper error messages.
The program must exit gracefully after displaying passed are not proper.(hint : Create a user defined exception class for handling errors.)*/


import java.util.Scanner;
class Myexception extends Exception{
	public Myexception(String s) {
		super(s);
	}
}
public class eXCEPT {
public static void main(String... args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the age");
	int a=sc.nextInt();
	try
	{if(a>=18 &&a<60) {
		System.out.println(name+"HI THERE IS NO ERROR");
	}
	else if(a<=18) {
		throw new Myexception("BELOW AGE 18");
		
	}
	else {
		throw new Myexception("ABOVE AGE 60");
	}
	
}
	catch(Myexception e) {
		System.out.println("HI "+name+" EXCEPTION OCCURED BECAUSE "+e.getMessage());		
	}
finally {
	sc.close();	
}
	
	}
}
