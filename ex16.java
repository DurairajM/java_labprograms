//Program of counter without static variable
package lab_programs;

public class ex16 {
	
	 
		int count=0;//will get memory when instance is created  
		  
		ex16(){  
		count++;  
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		  
		ex16 c1=new ex16();  
		ex16 c2=new ex16();  
		ex16 c3=new ex16();  
		  
		 }  

}
