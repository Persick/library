import com.mysoft.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Daria on 25.10.2016.
 */
@WebServlet(name = "AddBookServlet", urlPatterns = "/add")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt = request.getParameter("txt");
        DAO.addBook(txt);
        response.sendRedirect("/books");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
