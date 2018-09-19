package lab_programs;
import java.util.*;
public class ex126 implements Runnable{
	private String msg;
	public ex126(String s)
	{
		this.msg=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Start Message="+msg);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"END");
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String ar[])
	{
		ex126 p=new ex126("rj");
		ex126 p1=new ex126("...");
		Thread t=new Thread(p);
		Thread t1=new Thread(p1);
		t.start();
		try
		{
			t.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1.start();
		
	}

}