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
public class JDBCConnection {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
                String query = "select * from log";
                Class.forName("com.mysql.jdbc.Driver"); //load the driver
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3310/bankaccount","kbk","ytkd0CSIK656f2ZL");
                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery(query);
                int i = 0;
                while (true) {
                        resultset.next();
                        System.out.println(resultset.getString(1) + " " + resultset.getString(2));
                        if (resultset.isLast()) {
                                break;
                        }
                }
        }
}
