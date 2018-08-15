//Java parameterized constructor
package lab_programs;

public class ex13 {
	
	 
		    int id;  
	    String name;  
	      
		    ex13(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
	    void display(){System.out.println(id+" "+name);}  
		   
		    public static void main(String args[]){  
		    ex13 s1 = new ex13(01,"durai");  
		    ex13 s2 = new ex13(02,"dinesh");  
		    s1.display();  
		    s2.display();  
		   }  

}
