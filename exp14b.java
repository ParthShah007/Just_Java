import javax.swing.*;
import java.awt.event.*;

public class exp14b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(30, 30, 80, 25);
        JTextField t1 = new JTextField();
        t1.setBounds(120, 30, 100, 25);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(30, 70, 80, 25);
        JTextField t2 = new JTextField();
        t2.setBounds(120, 70, 100, 25);

        JLabel result = new JLabel("Result: ");
        result.setBounds(30, 170, 200, 25);

        JButton add = new JButton("+");
        add.setBounds(30, 110, 50, 25);
        JButton sub = new JButton("-");
        sub.setBounds(90, 110, 50, 25);
        JButton mul = new JButton("*");
        mul.setBounds(150, 110, 50, 25);
        JButton div = new JButton("/");
        div.setBounds(210, 110, 50, 25);

        // Action Listeners
        ActionListener action = e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                String op = e.getActionCommand();
                double res = 0;
                switch (op) {
                    case "+": res = num1 + num2; break;
                    case "-": res = num1 - num2; break;
                    case "*": res = num1 * num2; break;
                    case "/": res = num2 != 0 ? num1 / num2 : 0; break;
                }
                result.setText("Result: " + res);
            } catch (NumberFormatException ex) {
                result.setText("Invalid input!");
            }
        };

        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(add); frame.add(sub);
        frame.add(mul); frame.add(div);
        frame.add(result);

        frame.setVisible(true);
    }
}
