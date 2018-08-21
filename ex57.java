//Object cloning
package lab_programs;
public class ex57 implements Cloneable{
	int rollno;  
	String name;  
	  
	ex57(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
		ex57 s1=new ex57(18,"rj");  
	  
		 ex57 s2=( ex57)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  

}
