//*Example of Method Overloading by changing data type of argument*//
package lab_programs;

public class ex08 {

	  
		  void sum(int a,int b)
		  {
			  System.out.println(a+b);
			  }  
		  void sum(double a,double b)
		  {
			  System.out.println(a+b);
			  }  
		  
		  public static void main(String args[]){  
		  ex08 obj=new ex08();  
		  obj.sum(10.5,10.5);  
		  obj.sum(20.5,20.5);  
	  
		  }  

}
