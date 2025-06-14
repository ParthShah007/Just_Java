import java.io.*;
import java.awt.*;
import javax.swing.*;
class New {
public static void main (String args[]) {
//Frame
JFrame f = new JFrame("ParthShahgg");
f.setLayout(null);
f.setSize(1000,800);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Label
JLabel l = new JLabel("Select: ");
l.setBounds(50,50,100,50);
//RadioButton
JRadioButton a = new JRadioButton("Paneer");
JRadioButton b = new JRadioButton("Mutton");
JRadioButton c = new JRadioButton("Chicken");
ButtonGroup g = new ButtonGroup();
a.setBounds(150, 100, 100, 50);
b.setBounds(150, 100, 100, 50);
c.setBounds(150, 100, 100, 50);
//Button
JButton btn = new JButton("Click Me");
btn.setBounds(200,400,100,50);
btn.addActionListener(e -> {
String msg = a.isSelected() ? "Paneer":
		     b.isSelected() ? "Mutton":
		     c.isSelected() ? "Chicken":
			"Nothing selected";
JOptionPane.showMessageDialog(f, "You selected: "+msg);
});
//add
f.add(btn);
f.add(l);
g.add(a);
g.add(b);
g.add(c);
f.add(a);f.add(b);f.add(c);

f.setVisible(true);
}
}