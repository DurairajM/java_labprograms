//*Example of Method Overloading by changing the no. of arguments*//
package lab_programs;

public class ex07 {

		  void sum(int a,int b)
		  {
			  System.out.println(a+b);
			  }  
		  void sum(int a,int b,int c)
		  {
			  System.out.println(a+b+c);
			  }  
		  
		  public static void main(String args[]){  
		  ex07 obj=new ex07();  
		  obj.sum(11,11,11);  
		  obj.sum(22,22);  
		  
		  }  

}
