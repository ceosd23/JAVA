import javax.swing.*;

public class OptionPaneExample {

JFrame f;

OptionPaneExample(){

f=new JFrame();

//JOptionPane.showMessageDialog(f,"Hello, Welcome");
JOptionPane.showConfirmDialog(f,"WARNING");
}

public static void main(String[] args) {

new OptionPaneExample();
}
}