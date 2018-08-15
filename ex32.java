//super is used to refer immediate parent class instance variable.
//Problem without super keyword

package lab_programs;

	import java.util.*;
	 class bike2 {
			  int speed=50;  
			}  
			class ex32 extends bike2{  
			  int speed=100;  
			  void display(){  
			   System.out.println(speed);//will print speed of Bike   
			  }  
			  public static void main(String args[]){  
			   ex32 b=new ex32();  
			   b.display();  
			}  

	}
