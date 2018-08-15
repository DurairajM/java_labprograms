//Example of Method Overloading with TypePromotion
package lab_programs;

public class ex10 {
	
	 
		  void sum(int a,long b){System.out.println(a+b);}  
	      void sum(int a,int b,int c){System.out.println(a+b+c);}  
		  
		  public static void main(String args[]){  
		  ex10 obj=new ex10();  
		  obj.sum(21,21);//now second int literal will be promoted to long  
		  obj.sum(21,21,21);  
		  
		  }  
	 

}
