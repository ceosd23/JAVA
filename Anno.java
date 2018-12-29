import java.lang.annotation.*; 
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}
public class Anno {
 @MyAnno(str="HELLO",val=1000)
public static void mymeth() {
	 Anno ob=new Anno();
	 try {
		 Class<?> c=ob.getClass();
		 Method m=c.getMethod("mymeth");
		 MyAnno a=m.getAnnotation(MyAnno.class);
		 System.out.println(a.str()+"  "+a.val());
	 }
	 catch(NoSuchMethodException e) {
		 System.out.println("Method Not found");
	 }
 }
 public static void main(String args[]) {
	 mymeth();
 }
}
