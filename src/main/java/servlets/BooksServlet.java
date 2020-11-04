package servlets;

import model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BooksServlet", urlPatterns = "/books")
public class BooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        handleRequest(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        handleRequest(request, response);
    }

    private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");

        // This code is just to use an example of using attribute and post.
        // Changing one row in a table isn't a useful implementation.
        // Neither is mapping 2 params to an object and making them an attribute.
        if (title != null && author != null) {
            request.setAttribute("book", new Book(title, author));
        }

        getServletContext().getRequestDispatcher("/books.jsp").forward(request, response);
    }
}
