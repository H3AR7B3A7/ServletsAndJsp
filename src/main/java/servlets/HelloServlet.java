package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello", "/hi", "/ola/*"})
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("POST request was made to /hello");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("GET request was made to /hello");

        String first = request.getParameter("first");
        String last = request.getParameter("last");

        String contextParam = getServletContext().getInitParameter("availableEverywhere");

        response.setContentType("text/html");

        if(first == null || last == null) {
            response.getWriter().println("<h1>Hello beautiful world!</h1>");
        }else{
            response.getWriter().println("<h1>Hello " + first + " " + last + "</h1><br>" + contextParam);
        }

    }
}
