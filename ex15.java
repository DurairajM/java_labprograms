//Java Copy Constructor
package lab_programs;

public class ex15 {
	
	 
		    int id;  
		    String name;  
		    ex15(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		      
		    ex15(ex15 s){  
		    id = s.id;  
		    name =s.name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  
		   
		    public static void main(String args[]){  
		    ex15 s1 = new ex15(1,"durai");  
		    ex15 s2 = new ex15(s1);  
		    s1.display();  
		    s2.display();  
		   }  

}
