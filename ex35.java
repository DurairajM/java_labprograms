//super can be used to invoke parent class method
package lab_programs;
import java.util.*;
class bike5 {
	void display()
	{
		System.out.println("Welcome ");
	}
	
}  
class ex35 extends bike5
{
 int speed=100;  
 void display(){  
	  super.display();
  System.out.println("Welcome to my home");//will print speed of Bike   
 }  
 public static void main(String args[]){  
  ex35 b=new ex35();  
  b.display();  
}  

}
