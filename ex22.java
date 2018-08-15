//Where to use this() constructor call?
package lab_programs;

public class ex22 {
	
			  
				    int id;  
				    String name;  
				    String city;  
			      
				    ex22(int id,String name){  
				    this.id = id;  
		    	    this.name = name;  
				    }  
				    ex22(int id,String name,String city){  
				    this(id,name);//now no need to initialize id and name  
				    this.city=city;  
				    }  
			        void display(){System.out.println(id+" "+name+" "+city);}  
				      
				    public static void main(String args[]){  
				    	ex22 e1 = new ex22(1,"dinesh");  
			            ex22 e2 = new ex22(2,"durai","PmR");  
				    e1.display();  
				    e2.display();  
				   }  

}
