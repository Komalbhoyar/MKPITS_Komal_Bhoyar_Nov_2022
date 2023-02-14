import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class eventDemo1 implements ActionListener{
JFrame f;
JButton bt1;

 eventDemo1()
{
f=new JFrame();
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.setLayout(new FlowLayout());
bt1=new JButton("ok");

f.add(bt1);
bt1.addActionListener(this);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bt1)
	{
		System.out.println("button pressed");
	}
}
public static void main(String[] args)
{
  new eventDemo1();
}
}