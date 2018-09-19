package lab_programs;

public class ex122 extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String sr[])
	{
		ex122 g=new ex122();
		ex122 g1=new ex122();
		g.setPriority(Thread.MIN_PRIORITY);
		g1.setPriority(Thread.MAX_PRIORITY);
		g.start();
		g1.start();
	}
}

