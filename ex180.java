package lab_programs;

import javax.swing.*;  

public class ex180 extends JFrame{  
  
public ex180() {  
  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
  
slider.setPaintTicks(true);  
slider.setPaintLabels(true);  
  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
  
public static void main(String s[]) {  
ex180 frame=new ex180();  
frame.pack();  
frame.setVisible(true);  
  
}  
}  

