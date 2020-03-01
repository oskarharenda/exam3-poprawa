package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet ("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servlet = req.getParameter("servlet");
        String jsp = req.getParameter("jsp");
        String java = req.getParameter("java");
        String loginGit = req.getParameter("loginGit");


        if (verifyLogin(loginGit) && (servlet!=null || jsp!=null || java!=null) ){
            resp.sendRedirect("/success");
        } else {
            getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
        }

    }

    public static boolean verifyLogin (String login){
        Pattern pattern = Pattern.compile("^[a-zA-Z_-]+$");
        return pattern.matcher(login).matches();
    }
}
