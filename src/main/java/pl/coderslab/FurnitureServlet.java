package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet ("/furniture")
public class FurnitureServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FurnitureDao furnitureDao = new FurnitureDao();
        List<Furniture> furniture = furnitureDao.getList();
        HttpSession sess = req.getSession();

        sess.setAttribute("furniture", furniture);
        getServletContext().getRequestDispatcher("/furniture.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.getWriter().println(name);
    }
}
