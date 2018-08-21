//Java interface
package lab_programs;
interface getting
{
	void get(int a);
}
interface putting
{
	void put();
}
public class ex48 implements getting,putting {
	int c;
	public void get(int a)
	{
		c=a;
	}
	public void put()
	{
		System.out.println("The value passed is "+c);
	}
	public static void main(String ar[])
	{
		ex48 b=new ex48();
		b.get(10);
		b.put();
	}

}