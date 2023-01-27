package Interface;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    JFrame loginFrame = new JFrame();
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;


    public void run(){

        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(panel1, BorderLayout.CENTER);
        loginFrame.setSize(720,500);
    }
}
