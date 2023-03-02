import javax.swing.*;
import java.awt.*;

class Notepad{
// declare
JFrame f;

JTextArea ta;


JMenuBar menubar;


JMenu file_mnu;
//file menu items

JMenuItem file_new;
JMenuItem file_open;
JMenuItem file_save;
JMenuItem file_run;

JMenu edit_mnu;

JMenuItem edit_copy;
JMenuItem edit_paste;
JMenuItem edit_delete;

JMenu tool_menu;

JMenuItem tool_run;
JMenuItem tool_compile;

JMenu view_menu;

JMenuItem view_zoom;
JMenuItem view_line;

Notepad(){
	//initialize name

JFrame.setDefaultLookAndFeelDecorated(true);
f=new JFrame("My Notepad");
Container c=f.getContentPane();
//f.setDefaultCloseOperation(WindowConstants.EXIT_ON_ClOSE);

ta=new JTextArea();

menubar=new JMenuBar();

file_mnu=new JMenu("menu");


file_new=new JMenuItem("new");
file_open=new JMenuItem("open");
file_save=new JMenuItem("save");

edit_mnu=new JMenu("edit");

edit_copy=new JMenuItem("copy");
edit_paste=new JMenuItem("paste");
edit_delete=new JMenuItem("delete");

tool_menu=new JMenu("tool");

tool_run=new JMenuItem("run");
tool_compile=new JMenuItem("compile");

view_menu=new JMenu("view");

view_zoom=new JMenuItem("zome");
view_line=new JMenuItem("line");


menubar.add(file_mnu);

file_mnu.add(file_new);
file_mnu.add(file_open);
file_mnu.add(file_save);

edit_mnu.add(edit_copy);
edit_mnu.add(edit_paste);
edit_mnu.add(edit_delete);

tool_menu.add(tool_run);
tool_menu.add(tool_compile);

view_menu.add(view_zoom);
view_menu.add(view_line);

f.setJMenuBar(menubar);

c.add(ta);
f.setSize(500,500);
f.setVisible(true);

}
class Notepad1{
public static void main(String[] args)
{
new Notepad();
}
}
}






