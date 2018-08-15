package lab_programs;

class ex {
	ex25 obj;  
		 ex(ex25 obj){  
		    this.obj=obj;  
		  }  
		  void display(){  
		    System.out.println(obj.data);//using data member of A4 class  
		  }  
		}  
		  
	    public class ex25{  
		  int data=10;  
		  ex25(){  
			  	   ex b=new ex(this);  
			  	   b.display();  
			  	  }  
			  	  public static void main(String args[]){  
			  		ex25 a=new ex25();  
			  	  }  



}