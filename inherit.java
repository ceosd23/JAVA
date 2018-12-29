
public class inherit {

	public static void main(String[] args) {
		def x=new def();
		abc y=new abc();
		abc y1;
		y1=x;
		y1.show();

	}

}
class abc{
	void show() {
		System.out.println("Hi");
	}
}
class def extends abc{
	void show() {
		System.out.println("Hello");
	}
}
