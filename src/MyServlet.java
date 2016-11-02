import com.mysoft.DAO;

import java.io.IOException;

/**
 * Created by Daria on 20.10.2016.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = "/books")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("books", DAO.getBooks());
        request.getRequestDispatcher("WEB-INF/books.jsp").forward(request, response);
    }
}
