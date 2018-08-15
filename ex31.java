//Example of method overriding
package lab_programs;

	import java.util.*;
	 class bike1 {
			void run(){System.out.println("Vehicle is running");}  
			}  
			public class ex31 extends bike1{  
				bike1 b=new bike1();
			void run(){System.out.println("Bike is running safely");
			}  
			  
			public static void main(String args[]){  
			ex31 obj = new ex31();  
			obj.run();  
			}  

}
