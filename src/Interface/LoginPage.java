package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import DB.SqlLiteConnection;
public class LoginPage extends JFrame {
    JFrame loginFrame = new JFrame();
    private JPanel panel1;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccountButton;

    Connection connection = null;
    public LoginPage(){
        run();
        connection = SqlLiteConnection.dbConnector();


    }



    public void run(){


        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(panel1, BorderLayout.CENTER);
        loginFrame.setSize(720,500);

        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String query = "select * from rc_table where username=? and password=? ";
                    PreparedStatement pst = connection.prepareStatement(query);
                    pst.setString(1,usernameTextField.getText());
                    pst.setString(2,passwordField.getText());

                    ResultSet rs = pst.executeQuery();
                    int count =0;
                     while(rs.next()){
                         count +=1;
                     }
                     if(count == 1){
                         JOptionPane.showMessageDialog(null, "corrent");
                         FrontPage frame1 = new FrontPage();
                         loginFrame.dispose();
                     }else if (count > 1){
                         JOptionPane.showMessageDialog(null, "duplicate");
                     }else {
                         JOptionPane.showMessageDialog(null, "Username or Password incorrect");
                     }
                     rs.close();
                     pst.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String query = "select * from rc_table where username=? and password=?";
                    PreparedStatement pst = connection.prepareStatement(query);
                    pst.setString(1,usernameTextField.getText());
                    pst.setString(2,passwordField.getText());

                    ResultSet rs = pst.executeQuery();
                    int count =0;
                    while(rs.next()){
                        count +=1;
                    }
                    if(count >= 1){
                        JOptionPane.showMessageDialog(null, "User Already Exists");

                    }else {

                        try{
                            String query1 = "insert into rc_table (username, password) values (?,?)";
                            PreparedStatement pst1 = connection.prepareStatement(query1);
                            pst1.setString(1,usernameTextField.getText());
                            pst1.setString(2,passwordField.getText());

                            pst1.execute();

                            JOptionPane.showMessageDialog(null, "Data Saved");

                            pst1.close();

                        }catch(Exception ex){

                        }
                    }
                    rs.close();
                    pst.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });
    }

}
