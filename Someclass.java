import java.lang.annotation.*;
import java.lang.reflect.*;
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}
@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}
@Target(ElementType.TYPE_USE)
@interface Unique{}
@Target(ElementType.TYPE_USE)
@interface MaxLen{ int val();}
@Target(ElementType.TYPE_PARAMETER)
@interface wh{
	String Description();
}
@Target(ElementType.FIELD)
@interface EmptyOK{}
@Target(ElementType.METHOD)
@interface Recommended{}

class TypeAnnoDemo<@wh(Description="Generic data type") T>{
	public @Unique TypeAnnoDemo(){}
	@TypeAnno String str;
	@EmptyOK String test;
	public int f(@TypeAnno TypeAnnoDemo<T> this,int x) {
		return 10;
	}
	public @TypeAnno Integer f2(int j,int k) {
		return j+k;
	}
	public @Recommended Integer f3(String str) {
		return str.length()/2;
	}
	public void f4()throws @TypeAnno NullPointerException{}
/*THIS LLINE NEED TO BE UNDERSTOOD*/
	String @MaxLen(val=10)[] @NotZeroLen [] w;
@TypeAnno Integer[] vec;
public static void metho(int i) {
	TypeAnnoDemo<@TypeAnno Integer> ob=new TypeAnnoDemo<@TypeAnno Integer>();
	@Unique TypeAnnoDemo<Integer> ob2=new @Unique TypeAnnoDemo<Integer>();
	Object x=new Integer(10);
	Integer y;
	y=(@TypeAnno Integer)x;
	}
	public static void main(String args[]) {
	metho(10);
}
public class Someclass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}
