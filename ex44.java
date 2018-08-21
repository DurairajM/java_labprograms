//Simple example of java instanceof
package lab_programs;
public class ex44 {
	 void get(ex44 l)
	{
		System.out.println(l instanceof ex44);
	}
	public static void main(String ar[])
	{
		ex44 l=new ex44();
		l.get(l);
	}
}