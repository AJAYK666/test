import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println(username);
        
            // User user = userService.find(username, password);
            String dbUser = "baraneetharan.r";
            System.out.println(username);
            System.out.println(request.getContextPath());

            if (dbUser != null) {
                // HttpSession session=request.getSession();  
                // session.setAttribute("uname",username); 
        
                request.getSession().setAttribute("user", username);
                // response.sendRedirect(request.getContextPath() + "/home");
                String n=(String) request.getSession().getAttribute("user");  

                System.out.println("Session getAttribute "+n);
                response.sendRedirect("/home");
                return;
            } 
        }

        // request.setAttribute("messages", messages);
        // request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }