//Multiple inheritance is not supported through class in java but it is possible by interface, why?
package lab_programs;
interface printable
{
	void print();
}
public class ex49 implements printable {
	public void print()
	{
		System.out.println("Hiiii..");
	}
	public static void main(String ar[])
	{
		ex49 v=new ex49();
		v.print();
	}
	
	

}

