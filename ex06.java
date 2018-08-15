package lab_programs;

public class ex06 {
		 int length;  
		 int width;  
		  
		 void insert(int l,int w){  
		  length=l;  
		  width=w;  
		 }  
		  
		 void calculateArea(){System.out.println(length*width);}  
	 public static void main(String args[]){  
		  ex06 r1=new ex06(),r2=new ex06();//creating two objects  
			    
		  r1.insert(4,5);  
			  r2.insert(3,4);  
		  
			  r1. calculateArea();  
			  r2. calculateArea();  
		}  

}

