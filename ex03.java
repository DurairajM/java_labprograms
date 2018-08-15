package lab_programs;

public class ex03 {
	 
			 int rollno;  
			 String name;  
			  
			 void insertRecord(int r, String n){  //method  
			  rollno=r;  
			  name=n;  
			 }  
		  
			 void displayInformation(){System.out.println(rollno+" "+name);}//method  
			  
			 public static void main(String args[]){  
			  ex03 s1=new ex03();  
			  ex03 s2=new ex03();  
			  
			  s1.insertRecord(01,"Durai");  
			  s2.insertRecord(02,"Dinesh");  
			  
			  s1.displayInformation();  
			  s2.displayInformation();  
		  

}
}