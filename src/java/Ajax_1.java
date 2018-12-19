/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JDBC.JDBC_1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mankank
 */
@WebServlet(urlPatterns = {"/Ajax_1"})
public class Ajax_1 extends HttpServlet {
   @Override
   public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String username = request.getParameter("user");
       PrintWriter writer = response.getWriter();
       JDBC_1 jdbc = new JDBC_1();
       boolean data = false;
       try {
           data = jdbc.isUserNamePresent(username);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Ajax_1.class.getName()).log(Level.SEVERE, null, ex);
       }
       if (data) {
           writer.println(username + " already exists!");
       } else {
           writer.println("good to go!");
       }
   }
}
