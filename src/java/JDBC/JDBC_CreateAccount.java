/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mankank
 */
public class JDBC_CreateAccount {
        public void createAccount(String username, String password) throws ClassNotFoundException, SQLException {
            String query = "insert into logindetails values ('" + username + "','" + password + "')";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/studentlogin","mankank","gmpwothah");
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
        }
}
