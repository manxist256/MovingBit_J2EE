/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mankank
 */
public class JDBC_1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new JDBC_1().isUserNamePresent("mankank");
    }
    public boolean isUserNamePresent(String username) throws ClassNotFoundException, SQLException {
        String query = "select * from log";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/bankaccount","kbk","ytkd0CSIK656f2ZL");
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (true) {
            rs.next();
            if (rs.getString(1).equals(username)) {
                return true;
            }
            if (rs.isLast()) {
                break;
            }
        }
        return false;
    }
}
