
import java.util.*;
public class sorted {
    
    static void mini(int[] arr) {
  Arrays.sort(arr);
  System.out.println(arr[0]);
    }   
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter the number of elements");
    	int n=scan.nextInt();
        int[] arr = new int[n];

        for (int arrItr = 0; arrItr < n; arrItr++) {
          arr[arrItr]=scan.nextInt();
        }
        mini(arr);
    }
}
