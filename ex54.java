//protected access modifier
package lab_programs;

class c3
{
	protected void cc()
	{
		System.out.println("hello");
	}
}
public class ex54 extends c3{
public static void main(String ar[])
{
	ex54 b=new ex54();
	b.cc();
}
}