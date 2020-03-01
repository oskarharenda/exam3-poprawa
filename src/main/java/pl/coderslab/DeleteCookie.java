package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/deleteCookie")
public class DeleteCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/deletecookie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        boolean isCookie = false;
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(name)){
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
                isCookie = true;
                return;
            }
        }
        if(!isCookie ){
            resp.getWriter().println("brak cookie o takiej nazwie");
        }
        for(Cookie cookie2 : cookies) {
            resp.getWriter().println(cookie2.getName());
            resp.getWriter().println(cookie2.getValue());
        }
    }
}
