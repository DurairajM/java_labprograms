package lab_programs;

import java.io.*;
public class ex140 {
		    
		  public static void main(String args[]){  
		   try{  
	     FileOutputStream fout=new FileOutputStream("abc.txt");  
	     String s="Sachin Tendulkar is my favourite player";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
		}  
