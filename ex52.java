//private access modifier
package lab_programs;
class c1
{
	public void cc()
	{
		System.out.println("hello");
	}
}
public class ex52 extends c1{
public static void main(String ar[])
{
	ex52 b=new ex52();
	b.cc();
}
}