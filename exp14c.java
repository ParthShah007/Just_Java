import javax.swing.*;
import java.awt.event.*;

public class exp14c {
    public static void main(String[] args) {
        JFrame f = new JFrame("Welcome to fahmidaclassroom");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 80, 25);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 30, 200, 25);
        JLabel l2 = new JLabel("Gender:");
        l2.setBounds(30, 70, 80, 25);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(100, 70, 60, 25);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(160, 70, 80, 25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        JLabel l3 = new JLabel("Interest: ");
        l3.setBounds(30, 110, 80, 25);
        JCheckBox c1 = new JCheckBox("Music");
        c1.setBounds(100, 110, 80, 25);
        JCheckBox c2 = new JCheckBox("Swimming");
        c2.setBounds(180, 110, 100, 25);
        JLabel l4 = new JLabel("Favourite Place:");
        l4.setBounds(30, 150, 120, 25);
        String[] places = { "Bangladesh", "India", "Japan", "USA" };
        JComboBox<String> cb = new JComboBox<>(places);
        cb.setBounds(150, 150, 100, 25);
        JLabel l5 = new JLabel("Details:");
        l5.setBounds(30, 190, 80, 25);
        JTextArea area = new JTextArea();
        area.setBounds(100, 190, 200, 80);
        JButton submit = new JButton("Submit");
        submit.setBounds(80, 290, 80, 30);
        JButton exit = new JButton("Exit");
        exit.setBounds(180, 290, 80, 30);
        submit.addActionListener(e -> {
            String name = t1.getText();
            String gender = r1.isSelected() ? "Male" : (r2.isSelected() ? "Female" : "Not selected");
            String interest = "";
            if (c1.isSelected()) interest += "Music ";
            if (c2.isSelected()) interest += "Swimming ";
            String place = cb.getSelectedItem().toString();
            String msg = "Name: " + name + "\nGender: " + gender + "\nInterest: " + interest + "\nFavourite Place: " + place;
            area.setText(msg);
        });
        exit.addActionListener(e -> System.exit(0));
        f.add(l1); f.add(t1);
        f.add(l2); f.add(r1); f.add(r2);
        f.add(l3); f.add(c1); f.add(c2);
        f.add(l4); f.add(cb);
        f.add(l5); f.add(area);
        f.add(submit); f.add(exit);
        f.setVisible(true);
    }
}
