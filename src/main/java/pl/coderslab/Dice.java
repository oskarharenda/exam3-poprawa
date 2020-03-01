package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet ("/dice")
public class Dice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random r = new Random();
        int a = r.nextInt(6)+1;
        HttpSession sess = req.getSession();

        sess.setAttribute("random", a);
        getServletContext().getRequestDispatcher("/dice.jsp").forward(req, resp);
    }
}
