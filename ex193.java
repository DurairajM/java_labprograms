package lab_programs;

import java.awt.*;  
import javax.swing.*;  
  
public class ex193 extends Frame {  
 Button buttons[];  
  
 public ex193() {  
   buttons = new Button [5];  

   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
  
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
setSize(400,400);  
setVisible(true);  
}  
  
public static void main(String args[]){  
ex193 b=new ex193();  
}  
}  