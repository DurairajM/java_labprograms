package lab_programs;

import java.io.*;
public class ex153 {
		 public static void main(String args[])throws Exception{  
			  
			   FileOutputStream fout=new FileOutputStream("mfile.txt");  
			   int a=10;
			   PrintStream pout=new PrintStream(fout);  
			   pout.println(1900);  
			   pout.println("Hello Java");  
			   pout.println("Welcome to Java");  
			   //System.out.printf("%d",a);
			   pout.close();  
			   fout.close();  
			      
			 }  

}