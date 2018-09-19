package lab_programs;

public class ex128 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		ex127 g=new ex127();
		ex127 g1=new ex127();
		Thread t=new Thread(g);
		Thread t1=new Thread(g1);
		t.start();
		t1.start();
	}
}