import javax.swing.*;
 import java.awt.*;

class Frame1
{

JFrame f;

JTextField t1;

JLabel l1;

Frame1()
{
	//Create Frame
JFrame.setDefaultLookAndFeelDecorated(true);
f=new JFrame();
Container c=f.getContentPane();
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//int of object
l1=new JLabel("enter your name");
t1=new JTextField(20);

//seting layout
c.setLayout(new FlowLayout(FlowLayout.LEFT));

c.add(l1);
c.add(t1);



//visible and size of iframe
f.setSize(1000,500);
f.setVisible(true);
}
}

public class fr2_demo{
public static void main(String[] args){
new Frame1();
}
}