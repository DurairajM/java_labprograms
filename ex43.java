//dynamic binding
package lab_programs;
class lab {
	 void get()
	{
		System.out.println("Raining.,.,!!!");
	}
}
public class ex43 extends lab
{
	void get()
	{
		System.out.println("Raining with Thundering.,.,!!!");
	}
	public static void main(String ar[])
	{
		ex43 l=new ex43();
		l.get();
	}

}
