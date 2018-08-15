//Is final method inherited?
package lab_programs;
class bike8 {
	//int speed=50;  
	final void display(){  
		   System.out.println("HIIII");   
		  }  
}  
class ex39 extends bike8
{   
  public static void main(String args[]){  
   ex39 b=new ex39();  
   b.display();  
}  

}
