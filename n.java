import javax.swing.*;
import java.awt.*;
class n {
public static void main (String args[]) {
JFrame f = new JFrame("ParthShahgg");
f.setSize(300,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(new FlowLayout());
JLabel l = new JLabel("Choose Color: ");
f.add(l);
String[] color = {"Red","Green","Blue"};
JComboBox<String> cb1 = new JComboBox<>(color);
JTextArea ta = new JTextArea();
ta.setEditable(false);
f.add(cb1);
JButton b = new JButton("Submit");
b.addActionListener( e -> {
String m = cb1.getSelectedItem().toString();
ta.setText("Your favrite color: "+m);
});
f.add(b);
f.add(ta);
f.setVisible(true);
}
}


