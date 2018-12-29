import java.awt.*;
public class FIRST extends Frame{
	FIRST(String s){
		super(s);
		this.setSize(600,600);
		this.setLayout(null);
		Button b=new Button(" Marlo Meri gand GAND");
		b.setBounds(200,200, 200, 50);
		b.setBackground(Color.cyan);
		this.add(b);
		this.setSize(600,600);
		setVisible(true);
	}
	public static void main(String args[]) {
		FIRST f=new FIRST("I AM RAJAT");
	}
	
}
