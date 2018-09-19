package lab_programs;
public class ex117 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		ex116 g=new ex116();
		Thread t=new Thread(g);
		t.run();
	}

}