package Interface;

import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class FrontPage {
    private JPanel panel1;
    private JScrollPane scrollPane;
    private JScrollPane otherUserRecipes;
    private JButton button1;


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

        run();
    }

    public void run(){


        JFrame f = new JFrame("Test HTML");


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.getContentPane().add(scrollPane).setSize(100,100);
        f.add(panel1);
        f.setSize(new Dimension(1920,1080));
        f.setVisible(true);

    }
}
