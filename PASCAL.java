import java.util.*;
public class PASCAL {
	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of column");
		int coeff=0;
		int c=sc.nextInt();
		for(int i=1;i<c;i++) {
			for(int s=c;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(i==0||j==0) {
					coeff=1;
				}
				else {
					coeff=coeff*(i-j+1)/j;
				}
				System.out.print(coeff+" ");
			}
		System.out.println();
		}
		
		
	}
}
