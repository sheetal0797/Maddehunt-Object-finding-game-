
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
   
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class bksong implements Runnable {
   
   // Constructor
   public bksong() {
     /* this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Test Sound Clip");
      this.setSize(300, 200);
      this.setVisible(true);*/
}
   public void run()
    {  try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource("bksongf.wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         //clip.start();
//(clip.isRunning()) clip.stop();


String z1=null;  
FileInputStream fin;

	try
		{
		    fin = new FileInputStream("slider.txt");
      z1=new DataInputStream(fin).readLine();
		    fin.close();		
		}
		catch (IOException e)
		{
			System.err.println ("Unable to read from file");
			System.exit(-1);
		}
int foo = Integer.parseInt(z1);
System.out.println (foo);
//foo=(foo-102);
foo=foo/2-44;
FloatControl gainControl=(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
gainControl.setValue(foo+0f);
	clip.loop(Clip.LOOP_CONTINUOUSLY);
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
   
  /* public static void main(String[] args) {
      new bksong();*/
   
}