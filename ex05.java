package lab_programs;

public class ex05 {
	void fact(int  n){  
			  int fact=1;  
			  for(int i=1;i<=n;i++){  
			   fact=fact*i;  
			  }  
			 System.out.println("factorial is "+fact);  
			}  
			  
			public static void main(String args[]){  
		 new ex05().fact(7);//calling method with annonymous object  
			}  
			}  


