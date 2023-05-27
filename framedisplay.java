class framedisplay implements Runnable
{
String data;

public framedisplay(String dt)
{
data=dt;
}

public void run()
{
new messageframe(data);
}
}