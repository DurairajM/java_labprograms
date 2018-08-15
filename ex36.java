// java final variable
package lab_programs;

public class ex36 {
	final int speedlimit=50;
	void run()
	{
		speedlimit=200;
	}
	
  public static void main(String args[]){  
   ex36 ob=new ex36();  
   ob.run();  
}  
}

