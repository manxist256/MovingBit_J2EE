/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mankank
 */
@WebServlet(urlPatterns = {"/LoginController"})
public class LoginServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException {
            String username = request.getParameter("u1");
            String password = request.getParameter("p1");
            PrintWriter writer = response.getWriter();
            writer.println(username);
            writer.println(password);
            writer.flush();
    }
    
}
