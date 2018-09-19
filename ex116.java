package lab_programs;

public class ex116 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		ex116 g=new ex116();
		g.run();
	}

}