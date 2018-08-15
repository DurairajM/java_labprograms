//Why multiple inheritance is not supported in java?

package lab_programs;

class A {
	void msg(){System.out.println("Hello");}  
	}  
	class B{  
	void msg(){System.out.println("Welcome");}  
	}  
	public class ex28 extends A,B{//suppose if it were  
	   
	 public static void main(String args[]){  
   ex28 obj=new ex28();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  


