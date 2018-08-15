//Understanding the problem without this keyword

package lab_programs;

public class ex19 {
	
	
		    int id;  
		    String name;  
		      
		    ex19(int id,String name){  
		    id = id;  
		    name = name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  
		  
		    public static void main(String args[]){  
		    ex19 s1 = new ex19(1,"durai");  
		    ex19 s2 = new ex19(2,"dinesh");  
		    s1.display();  
		    s2.display();  
	}
}
