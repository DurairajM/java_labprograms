package lab_programs;
public class ex127 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		ex127 g=new ex127();
		ex127 g1=new ex127();
		g.start();
		g1.start();
	}
}
