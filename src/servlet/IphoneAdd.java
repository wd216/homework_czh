package servlet;

import dao.IphoneDAO;
import dao.IphoneInMemoryDAO;
import entity.Iphone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    新增
 */
@WebServlet("/iphone/add")
public class IphoneAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/iphone_add_form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String resolution = req.getParameter("resolution");
        String camera = req.getParameter("camera");
        String system = req.getParameter("system");
        String memory = req.getParameter("memory");

        Iphone iphone = new Iphone(id,name,resolution,camera,system,memory);

        IphoneDAO dao = new IphoneInMemoryDAO();
        dao.add(iphone);

        resp.sendRedirect("/iphone/index");

    }
}
