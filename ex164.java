package lab_programs;

import java.io.*;  
import java.net.*;  

public class ex164 {
	public static void main(String[] args){  
		try{  
		InetAddress ip=InetAddress.getByName("www.gmail.com");  
		  
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
		}catch(Exception e){System.out.println(e);}  
		}  

}