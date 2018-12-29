import java.util.*;
public class Str {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String h=sc.nextLine();
int dist=0;
for(int i=0;i<h.length();){
	for(int j=0;j<h.length();j++) {
		if(h.charAt(i)==h.charAt(j)) {
			dist++;
		}}
	System.out.println(h.charAt(i)+"--"+dist);
    String d=String.valueOf(h.charAt(i)).trim();
    h=h.replaceAll(d,"");
    dist = 0;
}

}
}
