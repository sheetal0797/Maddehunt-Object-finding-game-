import javax.swing.*;
class showtime implements Runnable
{
JFrame frm;
int time;
public showtime(JFrame obj,int tm)
{
frm=obj;
time=tm;
}

public void run()
{
try
{
for(int i=(time*60);i>=0;i--)
{
frm.setTitle("Time Remaining"+i+" Seconds");
Thread.sleep(1000);
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}

JOptionPane.showMessageDialog(null,"Sorry! Try Again");
//new f3N();


}
}
