import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Ann{int val() default 1000;}
@Retention(RetentionPolicy.RUNTIME)
@interface What{String des();}
@Retention(RetentionPolicy.RUNTIME)
@interface Hi{double dou();}
@Ann()
@What(des="This is Annotation default checker")
@Hi(dou=3.14)
public class META {
	
	@Ann(val=252)
	@What(des="THIS IS METHOD ANNOTATION")
	@Hi(dou=2.17)
public static void mymeth() {
		META me=new META();
	try{
	Annotation a[]=me.getClass().getAnnotations();
	System.out.println("THIS IS FOR CLASS");
	for(Annotation an: a) {
		System.out.println(an);
	}
	System.out.println("THIS IS FOR METHOD");
	a=me.getClass().getMethod("mymeth").getAnnotations();
	for(Annotation an: a) {
		System.out.println(an);
	}
	
}
	catch(NoSuchMethodException e) {
System.out.println("Method not found");
}

}
	public static void main(String args[]) {
		mymeth();
	}
}