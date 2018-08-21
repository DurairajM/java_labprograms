//abstract class and interface in Java
package lab_programs;

interface inter1
{
	void car();
	void bike();
}
abstract class Abs implements inter1
{
	public void car()
	{
		System.out.println(" i ridied BMW Car");
	}
}
 class rk extends Abs{
	/*public void car()
	{
		System.out.println("The second car which I bought is Benz");
	}*/
	public void bike()
	{
		System.out.println("The bike which I rided is Pulsar...");
	}

}
 public class ex50 
 {
	 public static void main(String ar[])
	 {
		 inter1 s=new rk();
         s.car();
         s.bike();
		 
	 }
 }