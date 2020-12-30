package servlets;

import org.junit.jupiter.api.Test;

import javax.servlet.ServletException;
import java.io.IOException;

public class XMLServletTest {
    @Test
    public void testDoPost() throws IOException, ServletException {
        // TODO: This test is incomplete.

        (new XMLServlet()).doPost(null, null);
    }

    @Test
    public void testDoGet() throws IOException, ServletException {
        // TODO: This test is incomplete.

        XMLServlet xmlServlet = new XMLServlet();
        xmlServlet.init(new BooksServlet());
        xmlServlet.doGet(null, null);
    }
}

