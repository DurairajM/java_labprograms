package lab_programs;
import javax.swing.*;  

public class ex179 extends JFrame{  
  
public ex179() {  
JSlider slider = new JSlider(JSlider.VERTICAL, 0, 50, 25);  
JPanel panel=new JPanel();  
panel.add(slider);  
  
add(panel);  
}  
  
public static void main(String s[]) {  
ex179 frame=new ex179();  
frame.pack();  
frame.setVisible(true);  
}  
}