import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet3 doget");
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/servlet3.jsp");
        rd.forward(req, resp);
    }

}