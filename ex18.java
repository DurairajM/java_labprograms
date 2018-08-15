//Java static method
		//Program of changing the common property of all objects(static field).  
	
package lab_programs;

public class ex18 {
	
	  
		     int rollno;  
		     String name;  
		     static String college = "ITS";  
		       
		     static void change(){  
		     college = "RIT";  
		     }  
		  
		     ex18(int r, String n){  
		     rollno = r;  
		     name = n;  
		     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		    public static void main(String args[]){  
		    ex18.change();  
		  
	        ex18 s1 = new ex18 (1,"durai");  
		    ex18 s2 = new ex18 (2,"dinesh");  
		    ex18 s3 = new ex18 (3,"Sathish");  
	  
		    s1.display();  
		    s2.display();  
	    s3.display();  
		    }  

}
