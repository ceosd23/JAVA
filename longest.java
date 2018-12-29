import java.util.*;
public class longest {

	public static void main(String[] args) {
	Scanner sn =new Scanner(System.in);
	String n=sn.nextLine();
	int l=n.length();
	String[] a=new String[l+l];
	int x=0;
	for(int i=0;i<l;i++) {
		char b=n.charAt(i);
		for(int j=i;j<l;j++) {
			if(n.charAt(j)==b) { if(i!=j) {
				a[x]=n.substring(i+1, j);
				x++;
			}
		}
		
	}
	}
	for(int i=0;i<x;i++) {
		for(int j=1+i;j<x;j++) {
		if(a[i].length()>a[j].length()) {
			String ne=a[i];
			a[i]=a[j];
			a[j]=ne;
			
			
		}
	}
	

	}
System.out.println(a[x-1]);
	}
}
