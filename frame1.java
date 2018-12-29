import java.awt.*;
import javax.swing.*;
public class frame1 extends JFrame {
frame1(String s){
	super(s);
	this.setSize(400,400);
	this.setVisible(true);
}
public static void main(String args[]) {
	frame1 a=new frame1("First Window");
}
}

