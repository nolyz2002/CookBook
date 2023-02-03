package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class FrontPage  {
    private JPanel panel1;
    private JScrollPane scrollPane;
    private JScrollPane otherUserRecipes;
    private JButton button1;


    JFrame f = new JFrame("Test HTML");
    JEditorPane jep = new JEditorPane();


    public FrontPage() throws IOException {

        jep.setEditable(false);

        try {
            jep.setPage("https://github.com/nolyz2002");
        }catch (IOException e) {
            jep.setContentType("text/html");
            jep.setText("<html>Could not load</html>");
        }
        scrollPane.setViewportView(jep);
        scrollPane.setPreferredSize(new Dimension(250,900));
        otherUserRecipes.setPreferredSize(new Dimension(250,250));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserRecipes ur = new UserRecipes();
                f.dispose();

            }
        });

        run();

    }


    public void run(){





        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel1);
        f.setSize(new Dimension(1920,1080));
        f.setVisible(true);

    }
}
