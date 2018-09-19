package lab_programs;

public class ex139 extends Thread{  
	  
	public void run(){  
	for(int i=1;i<=2;i++){  
	if(Thread.interrupted()){  
	System.out.println("code for interrupted thread");  
	}  
	else{  
	System.out.println("code for normal thread");  
	}  
	  
	}//end of for loop  
	}  
	  
	public static void main(String args[]){  
	  
	ex139 t1=new ex139();  
	ex139 t2=new ex139();  
	  
	t1.start();  
	t1.interrupt();  
	  
	t2.start();  
	  
	}  
	} 