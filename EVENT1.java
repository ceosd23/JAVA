import java.awt.*;
import java.awt.event.*;  
public class EVENT1 extends Frame implements ActionListener{
TextField tf;
EVENT1(){
	super("HI SANSKRITI");
	tf=new TextField();
	tf.setBounds(60,50,170,20);
	Font font = new Font("Times New Roman", Font.ITALIC,12);
	tf.setFont(font);
	tf.setForeground(Color.PINK);
	tf.setBackground(Color.white);
	Button b=new Button("CLICK ME");
	b.setBounds(100,120,80,30);
	b.addActionListener(this);
	b.setBackground(Color.RED);
	b.setForeground(Color.white);
	this.setSize(325,300);
	this.setLayout(null);
	add(b);
	add(tf);
	setVisible(true);
	
}
public void actionPerformed(ActionEvent e) {
tf.setText("I LOVE YOU");	
}
public static void main(String args[]){
	new EVENT1();
}
}
