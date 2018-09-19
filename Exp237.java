package lab_programs;

import java.util.*;  
import java.io.*;  

public class Exp237 {
public static void main(String[] args)throws Exception{  
  
Properties p=new Properties();  
p.setProperty("name","Durai");  
p.setProperty("email","durairajm.2016.it@ritchennai.edu.in");  
  
p.store(new FileWriter("info.properties"),"My Properties Example");  
  
}  

}
