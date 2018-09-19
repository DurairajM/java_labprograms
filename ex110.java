
package lab_programs;
import java.io.IOException;
public class ex110 {
	void m() throws IOException
	{
		throw new IOException("Device Error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String ar[])
{
	ex110 l=new ex110();
	l.p();
}
}
