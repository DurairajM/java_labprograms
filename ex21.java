 //this() can be used to invoked current class constructor.
		//Program of this() constructor call (constructor chaining)  
package lab_programs;

public class ex21 {
	
	 	    int id;  
		    String name;  
		    ex21(){System.out.println("default constructor is invoked");}  
		      
		    ex21(int id,String name){  
		    this ();//it is used to invoked current class constructor.  
		    this.id = id;  
		    this.name = name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  
		      
		    public static void main(String args[]){  
		    	ex21 e1 = new ex21(1,"durai");  
		    	ex21 e2 = new ex21(2,"dinesh");  
		    e1.display();  
		    e2.display();  
		   }  

}
