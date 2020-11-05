package servlets;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Book;
import org.bson.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BooksServlet", urlPatterns = "/books")
public class BooksServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MongoClient mongoClient = MongoClients.create(System.getenv("DB_LOCATION"));
        MongoDatabase db = mongoClient.getDatabase("Books");

        MongoCollection<Document> collection = db.getCollection("book");

        collection.insertOne(new Document()
                .append("title", request.getParameter("title"))
                .append("author", request.getParameter("author")));

//        handleRequest(request, response);
        response.sendRedirect("books");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MongoClient mongoClient = MongoClients.create(System.getenv("DB_LOCATION"));
        MongoDatabase db = mongoClient.getDatabase("Books");

        MongoCollection<Document> collection = db.getCollection("book");

        StringBuilder sb = new StringBuilder();

        for (Document doc : collection.find()) {
            System.out.println(doc.get("title"));
            System.out.println(doc.get("author"));
            sb.append("<tr><td class='title'>").append(doc.get("title").toString()).append("</td><td class='author'>").append(doc.get("author").toString()).append("</td></tr>");
            System.out.println(sb.length() + " of 2147483647 max characters");
        }

        System.out.println((2147483647-sb.length())/66 + " more entries can be added to this string builder.");
        request.setAttribute("DATA", sb);

//        handleRequest(request, response);
        getServletContext().getRequestDispatcher("/books.jsp").forward(request, response);
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
