package lab_programs;


public class ex130 extends Thread{
	public void finalize()
	{
		System.out.println("Object is garbage Collected");
	}
	public static void main(String sr[])
	{
		ex130 g=new ex130();
		ex130 g1=new ex130();
		g=null;
		g1=null;
		System.gc();
	}
}