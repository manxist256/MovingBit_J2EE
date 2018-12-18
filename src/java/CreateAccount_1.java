/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JDBC.JDBC_CreateAccount;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mankank
 */
@WebServlet(urlPatterns = {"/CreateAccount_1"})
public class CreateAccount_1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException, ServletException {
            String username = request.getParameter("u1");
            String password = request.getParameter("p1");
            JDBC_CreateAccount connection = new JDBC_CreateAccount();
            try {
                connection.createAccount(username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CreateAccount_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher rd = request.getRequestDispatcher("server_communication/accountcreated.html");
            rd.forward(request,response);
    }
}
