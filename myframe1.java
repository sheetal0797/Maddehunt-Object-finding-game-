import javax.swing.*;
import java.awt.*;
class myframe1 extends JFrame
{ 
JLabel l1,l2,l3,l4;
public myframe1()
{ super("my first frame");
setSize(400,300);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
l1=new JLabel(new ImageIcon("axe.jpg"));
l2=new JLabel(new ImageIcon("belll copy.png"));
l3=new JLabel(new ImageIcon("bucket.gif"));
l4=new JLabel(new ImageIcon("BELLL.jpg"));
setLayout(new FlowLayout());
add(l1);
add(l2);
add(l3);
add(l4);
}
public static void main(String[] str)
{ new myframe1();
}

}