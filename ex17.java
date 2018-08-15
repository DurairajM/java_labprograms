//Program of counter by static variable
package lab_programs;

public class ex17 {
	
	
		static int count=0;//will get memory only once and retain its value  
		  
		ex17(){  
		count++;  
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		  
		ex17 c1=new ex17();  
		ex17 c2=new ex17();  
		ex17 c3=new ex17();  
		  
		 }  
		}  

