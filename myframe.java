import javax.swing.*;
import java.awt.*;
class myframe extends JFrame
{ 
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4;
public myframe()
{ super("my first frame");
setSize(400,300);
setVisible(true);
setLayout(new FlowLayout());
l1=new JLabel("First Number");
l2=new JLabel("Second Number");
l3=new JLabel("Result");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("+");
add(l1); add(t1);
add(l2); add(t2);
add(l3); add(t3);
add(b1); 
add(b2);
add(b3); 
add(b4);
}

public static void main(String[] str)
{ new myframe();
}
}