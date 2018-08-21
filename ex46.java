//Example of abstract class that has abstract method
package lab_programs;
abstract class animal1
{
	abstract void get();
}
public class ex46 extends animal1 {
  void get()
	{
		System.out.println("Running Successfully");
	}
	public static void main(String ar[])
	{
		animal1 l=new ex46();
		l.get();
	}
}
