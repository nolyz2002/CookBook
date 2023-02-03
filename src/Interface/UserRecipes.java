package Interface;

import javax.swing.*;
import java.awt.*;

public class UserRecipes {
    private JPanel panel1;
    private JTextArea labelTextArea;
    private JTextArea labelTextArea1;
    private JButton addButton;
    public JFrame frame = new JFrame();
    public UserRecipes(){
        run();
    }

    public void run(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.setSize(new Dimension(1920,1080));
        frame.setVisible(true);
    }
}
