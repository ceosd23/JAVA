import java.awt.*;

import javax.swing.*;

public class PanelExample {

PanelExample()

{

JFrame f= new JFrame("Panel Example");

JPanel panel=new JPanel();

panel.setBounds(40,80,200,200);

panel.setBackground(Color.gray);

JButton b1=new JButton("Button 1");

b1.setBounds(50,100,80,30);

b1.setBackground(Color.yellow);

panel.add(b1);

f.add(panel);

f.setSize(400,400);

f.setLayout(null);

f.setVisible(true);

}

public static void main(String args[])

{

new PanelExample();
}
}