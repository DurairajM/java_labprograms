//The this keyword can be used to invoke current class method (implicitly).

package lab_programs;

public class ex23 {
		  
		  void m(){  
		  System.out.println("method is invoked");  
		  }  
    	  void n(){  
		  this.m();//no need because compiler does it for you.  
    	  }  
		  void p(){  
		  n();//complier will add this to invoke n() method as this.n()  
		  }  
		  public static void main(String args[]){  
			  ex23 s1 = new ex23();  
		  s1.p();  
		  }  

}
