package Interface;

import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class FrontPage {
    private JPanel panel1;
    private JScrollPane scrollPane;


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


        run();
    }

    public void run(){


        JFrame f = new JFrame("Test HTML");


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.getContentPane().add(scrollPane).setSize(100,100);
        f.add(panel1);
        f.setSize(new Dimension(1000,800));
        f.setVisible(true);

    }
}
