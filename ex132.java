package lab_programs;
import java.io.IOException;


public class ex132 {
	public static void main(String sr[]) throws IOException
	{
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory:"+r.totalMemory());
		System.out.println("Free Memory:"+r.freeMemory());
		for(int i=0;i<100;i++)
		{
			new ex132();
		}
		System.out.println("After creating 100 instances"+r.freeMemory());
		System.gc();
		System.out.println("After garabage collection"+r.freeMemory());
	}
}