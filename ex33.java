//Solution by super keyword
package lab_programs;
class bike3 {
	int speed=50;  
}  
class ex33 extends bike3
{
  int speed=100;  
  void display(){  
   System.out.println(super.speed);//will print speed of Bike   
  }  
  public static void main(String args[]){  
   ex33 b=new ex33();  
   b.display();  
}  

}
