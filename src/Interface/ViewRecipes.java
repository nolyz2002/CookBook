package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ViewRecipes {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextPane textPane1;
    private JButton backButton;
    JFrame frame = new JFrame();

    public ViewRecipes(){

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FrontPage fp = new FrontPage();
                    frame.dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        run();
    }

    private void run(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.setSize(new Dimension(1920,920));
        frame.setVisible(true);
    }

}
