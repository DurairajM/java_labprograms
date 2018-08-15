//Example of this keyword that you return as a statement from the method
package lab_programs;

class ex1 {
	ex1 getA(){  
		return this;  
		}  
		void msg(){System.out.println("Hello java");}  
		}  
		  
		public class ex26{  
		public static void main(String args[]){  
		new ex1().getA().msg();  
		}  
		}  
