//Abstract class having constructor, data member, methods etc.
package lab_programs;
abstract class animal2
{
	abstract void get();
	animal2()
	{
		System.out.println("Car started");
	}
	void changed()
	{
		System.out.println("gear changed ");
	}
}

public class ex47 extends animal2 {
  void get()
	{
		System.out.println("Running Successfully");
	}
	public static void main(String ar[])
	{
		animal2 l=new ex47();
        l.get();
        l.changed();
	}
}