package lab_programs;

public class ex04 {
	 
	 int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea(){System.out.println(length*width);}  
	  
	 public static void main(String args[]){  
	 ex04 r1=new ex04();  
	  ex04 r2=new ex04();  
  
	  r1.insert(4,5);  
	  r2.insert(3,4);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  

