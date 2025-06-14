import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
class p {
public static void main (String args[]) {
JFrame f = new JFrame("Student Details");
f.setSize(700,800);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
JLabel l1 = new JLabel("Name: ");
l1.setBounds(100,100,100,50);
f.add(l1);
JTextField tf1 = new JTextField();
tf1.setBounds(225,100,100,50);
f.add(tf1);
JLabel l2 = new JLabel("Branch: ");
l2.setBounds(100,200,100,50);
f.add(l2);
String[] subs = {"CSE","IT","DS"};
JComboBox<String> cb = new JComboBox<>(subs);
cb.setBounds(225,200,100,50);
f.add(cb);
JLabel l3 = new JLabel("Teaching: ");
l3.setBounds(100,300,100,50);
f.add(l3);
JRadioButton rb1 = new JRadioButton("Good");
rb1.setBounds(200,300,100,50);
JRadioButton rb2 = new JRadioButton("Poor");
rb2.setBounds(325,300,100,50);
ButtonGroup bg = new ButtonGroup();
bg.add(rb1);bg.add(rb2);
f.add(rb1);f.add(rb2);
JLabel l4 = new JLabel("Facilities: ");
l4.setBounds(100,400,100,50);
f.add(l4);
JCheckBox c1 = new JCheckBox("Lib");
c1.setBounds(225,400,100,50);
f.add(c1);
JCheckBox c2 = new JCheckBox("Sports");
c2.setBounds(350,400,100,50);
f.add(c2);
JButton submit = new JButton("Submit");
submit.setBounds(100,500,100,50);
f.add(submit);
submit.addActionListener( e -> {
String n = tf1.getText();
String m = cb.getSelectedItem().toString();
String a;
if(rb1.isSelected()) {
 a = "Good";
} else if(rb2.isSelected()) {
a = "Poor";
} else {
a = "NOT SELECTED";
}
String c="";
if(c1.isSelected()) 
c += "Lib ";
if(c2.isSelected()) 
c += "Sports";
JOptionPane.showMessageDialog(f,"Name: "+n+"\nBranch: "+m+"\nTeaching Quality: "+a+"\nFacilities: "+c);
});
f.setVisible(true);
}
}















