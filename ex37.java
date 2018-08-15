//Java final method
package lab_programs;

class bike6 {
	int speed=50;  
	final void run()
	{
		System.out.println("Karthikeyan");
	}
}  
public class ex37 extends bike6
{
  int speed=100;  
  void run(){  
   System.out.println(super.speed);  
  }  
  public static void main(String args[]){  
   ex37 b=new ex37();  
   b.run();  
}  


}
