//call by value in java
package lab_programs;
class operatio
{
	int data=50;
void change(int data)
{
this.data=data+100;	
}
}
public class ex65 {

public static void main(String ar[])
{
	operatio op=new operatio();
	System.out.println("before" + op.data);
	op.change(500);
	System.out.println("after " + op.data);
}
}