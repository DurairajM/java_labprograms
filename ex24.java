package lab_programs;

public class ex24 {
	 
		  void m(ex24 obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
		    
     	  public static void main(String args[]){  
		  ex24 s1 = new ex24();  
		  s1.p();  
		  }  

}
