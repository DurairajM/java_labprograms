package lab_programs;

public class ex121 extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String sr[])
	{
		ex121 g=new ex121();
		ex121 g1=new ex121();
		g.start();
		g1.start();
	}
}