package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserRecipes {
    private JPanel panel1;
    private JTextArea labelTextArea;
    private JTextArea labelTextArea1;
    private JButton addButton;
    private JButton backButton;
    public JFrame frame = new JFrame();
    public UserRecipes(){
        run();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FrontPage frame1 = new FrontPage();
                    frame.dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    public void run(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.setSize(new Dimension(1920,1080));
        frame.setVisible(true);
    }
}
