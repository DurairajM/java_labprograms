package lab_programs;
//TreeSet class:
	import java.util.*;  

public class Exp224 {
	 public static void main(String args[]){  
	   
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  


}