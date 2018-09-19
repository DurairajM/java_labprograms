package lab_programs;

import java.util.*; 
import java.io.*;
public class ex154 {
public static void main(String ar[]) throws FileNotFoundException
{
	FileOutputStream fout=new FileOutputStream("abc.txt");
	PrintStream out=new PrintStream(fout);
	int a=20;
	System.out.printf("%d",a);
}
}