package FoodHome;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omi6a
 */
public class DbConnect {
   
    public static Connection connectDb(){
        Connection conn;
     try
        {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/foodHome");
           
            return conn;
//            JOptionPane.showConfirmDialog(null,"Connected successfully");
}catch(Exception e){
     e.printStackTrace();
    }
     return null;
}
}
