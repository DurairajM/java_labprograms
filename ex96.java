package lab_programs;

class stud1
{
	int rno;
	String name;
	stud1(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public String toString()
	{
		return rno+" "+name;
	}
}
public class ex96 {

public static void main(String ar[])
{
	stud1 s=new stud1(18,"rj");
	System.out.println(s);
}
}
