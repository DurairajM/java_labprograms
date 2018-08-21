package lab_programs;
class lab1
{
	
}
public class ex45 extends lab1 {
  void get(ex45 l)
	{
		System.out.println(l instanceof lab1);
	}
	public static void main(String ar[])
	{
		ex45 l=new ex45();
		l.get(l);
	}
}
