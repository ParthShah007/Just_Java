import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class exp14a {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Labels
        JLabel lblLogin = new JLabel("Login :");
        lblLogin.setBounds(30, 30, 80, 25);
        frame.add(lblLogin);
        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setBounds(150, 30, 80, 25);
        frame.add(lblPassword);
        // Text fields
        JTextField txtLogin = new JTextField();
        txtLogin.setBounds(80, 30, 60, 25);
        frame.add(txtLogin);
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(230, 30, 80, 25);
        frame.add(txtPassword);
        // Display field (initially hidden)
        JTextField txtDisplay = new JTextField();
        txtDisplay.setBounds(30, 70, 280, 25);
        txtDisplay.setEditable(false);
        txtDisplay.setVisible(false);
        frame.add(txtDisplay);
        // Buttons
        JButton btnOK = new JButton("OK");
        btnOK.setBounds(80, 110, 80, 25);
        frame.add(btnOK);
        JButton btnReset = new JButton("RESET");
        btnReset.setBounds(180, 110, 80, 25);
        frame.add(btnReset);
        // Action for OK
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String pass = new String(txtPassword.getPassword());
                txtDisplay.setText("Login: " + login + ", Password: " + pass);
                txtDisplay.setVisible(true);
            }
        });
        // Action for RESET
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtLogin.setText("");
                txtPassword.setText("");
                txtDisplay.setVisible(false);
            }
        });
        frame.setVisible(true);
    }
}

