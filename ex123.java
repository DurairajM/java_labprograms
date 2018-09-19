package lab_programs;
public class ex123 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon is created"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User thread works");
		}
	}
	public static void main(String ar[])
	{
		ex123 b=new ex123();
		ex123 b1=new ex123();
		b.setDaemon(true);
		b.start();
		b1.start();
	}

}
