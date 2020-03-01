package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/createCookie")
public class CreateCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/createCookie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String value = req.getParameter("value");
        Cookie cookie = new Cookie(name,value);

        Cookie[] cookies = req.getCookies();
        resp.addCookie(cookie);
        for(Cookie cookie2 : cookies) {
            resp.getWriter().println(cookie2.getName());
            resp.getWriter().println(cookie2.getValue());
        }
    }
}
