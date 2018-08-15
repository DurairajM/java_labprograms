//super is used to invoke parent class constructor.
package lab_programs;
class bike4 {
	//int speed=50;
	 bike4()
	 {
		 System.out.println("Vehicle is created");
	 }
}  
public class ex34 extends bike4{  
  //int speed=100;  
  ex34(){
	  super();
   System.out.println("Bike is created by vehicle");//will print speed of Bike   
  }  
  public static void main(String args[]){  
   ex34 b=new ex34();  
   
}  

}
