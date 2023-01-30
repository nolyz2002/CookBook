package DB;

import javax.swing.*;
import java.sql.*;

public class SqlLiteConnection {

    Connection conn = null;

    public static Connection dbConnector(){
            try{
                Class.forName("org.sqlite.JDBC");
                String url = ("jdbc:sqlite:C:/Users/howen/OneDrive/Desktop/SQLite/mydatabase.db");
                Connection conn = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "success");
                return conn;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                return null;
            }
    }
}
