import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import javax.swing.event.ChangeListener.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.net.URL;
import javax.sound.sampled.*;


class BoundedChangeListener implements ChangeListener {


  public void stateChanged(ChangeEvent changeEvent) {

    Object source = changeEvent.getSource();
    if (source instanceof BoundedRangeModel) {
      BoundedRangeModel aModel = (BoundedRangeModel) source;
      if (!aModel.getValueIsAdjusting()) {
        System.out.println("Changed: " + aModel.getValue());
      }
    } else if (source instanceof JSlider) {
      JSlider theJSlider = (JSlider) source;
      if (!theJSlider.getValueIsAdjusting()) {
        System.out.println("Slider changed: " + theJSlider.getValue());
int a1=theJSlider.getValue();
FileOutputStream fout;		

		try
		{
		    fout = new FileOutputStream ("slider.txt");
		    new PrintStream(fout).print(a1);
		    fout.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
		}


      }
    } else {
      System.out.println("Something changed: " + source);
    }
  }
}

class fmenu extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b6;
    JLabel l1,s;
// e1;
bksong d1;
Thread e1;
public fmenu()
{}
    public fmenu(JFrame tt,int t) {
        setSize(1366,740);
        setVisible(true);
	JPanel panel = (JPanel)getContentPane();  
        panel.setLayout(null);  
	setTitle("Welcome to Madde Hunt");
if (t==0)tt.dispose();
s=new JLabel("Volume");
  s.setFont(new Font("times new roman", Font.BOLD,24));
      s.setForeground(Color.yellow); 
b1=new JButton("NEW GAME");
b2=new JButton("CONTINUE");
b3=new JButton("EXIT"); 
//b5=new JButton("REFRESH");
b4=new JButton("SCORE");
b6=new JButton("Stop");
add(b1); b1.addActionListener(this);
add(b2);b2.addActionListener(this);
add(b3); b3.addActionListener(this);
add(b4);b4.addActionListener(this);
add(s);
//add(b5);b5.addActionListener(this);
//add(b6);b6.addActionListener(this);
 Dimension size = b1.getPreferredSize();
 JSlider jSliderOne = new JSlider();
    jSliderOne.addChangeListener(new BoundedChangeListener());
    panel.add(jSliderOne, BorderLayout.NORTH);
jSliderOne.setBounds(330, 480,size.width+50, size.height );
	  b1.setBounds(350, 220,size.width, size.height );
	  b2.setBounds(345, 280, size.width, size.height);	
         b3.setBounds(340, 340, size.width, size.height);
         b4.setBounds(335, 410, size.width, size.height);
   s.setBounds(240, 480, size.width, size.height);
 // b5.setBounds(335, 450, size.width, size.height);
  b6.setBounds(385, 450, size.width, size.height);
/*AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
    new File("bksong.wav"));
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
FloatControl gainControl = 
    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
gainControl.setValue(-6.0f); // Reduce volume by 10 decibels.
clip.start();*/
       setLayout(new BorderLayout());
	 JLabel background=new JLabel(new ImageIcon("fmenu1.jpg"));
        add(background);
    pack(); 
bksong d1=new bksong();
Thread e1=new Thread(d1);
e1.start();

    }
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1)
  {new f1();}
else if(ae.getSource()==b2)
  {new ff();}
else if(ae.getSource()==b3)
  {System.exit(0);}

else if(ae.getSource()==b4)
{
String r1=null; 
 String r2=null;
FileInputStream finput;

	try
		{
		    finput = new FileInputStream("score name.txt");
      r1=new DataInputStream(finput).readLine();

		    finput.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}

FileInputStream fin;

	try
		{
		    fin = new FileInputStream("score.txt");
      r2=new DataInputStream(fin).readLine();

		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
      

JOptionPane.showMessageDialog(null,"HIGH SCORE:"+r1+":"+r2);

}
//else if(ae.getSource()==b5)
{e1.stop();
e1.start();
}
}

    public static void main(String args[]) 
    {fmenu frame=new fmenu(new JFrame(),1);

}
}