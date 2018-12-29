import javax.swing.*;
import java.awt.event.*;
public class SWING implements ActionListener{
	 JFrame f;JButton b;JLabel l;JLabel ps;JTextField un;JPasswordField pp; JCheckBox p;
	SWING(){
	f=new JFrame("SWING");
	b=new JButton("LOG IN");
	l=new JLabel("USERNAME");
	l.setBounds(0,0,80,10);
	 ps=new JLabel("PASSWORD");
	 ps.setBounds(0,32,100,20);
	un=new JTextField();
	un.setBounds(0,11,80,20);
	pp=new JPasswordField();
	pp.setBounds(0,52,100,20);
	b.setBounds(101,73,80,20);
	f.setSize(300,300);
	p=new CheckBox
	f.add(b);f.add(l);f.add(ps);f.add(un);f.add(pp);
	f.setLayout(null);
	f.setVisible(true);
	b.addActionListener(this);
	f.addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e) {
	        System.exit(0);
	    }
		});
	}
	public void actionPerformed(ActionEvent e) {
		String h=un.getText();
		String p=String.valueOf(pp.getPassword());
		JOptionPane m=new JOptionPane();
		if((h.length()>0) && p.length()>0) {
			
			m.showMessageDialog(f,"LOGIN SUCCESSFULL");
			System.exit(0);
			
			}
		else {
			m.showMessageDialog(f,"USERNAME PASSWORD CANNOT BE EMPTY");
		}
	}
public static void main(String args[]) {
SWING s=new SWING(); 

}
}