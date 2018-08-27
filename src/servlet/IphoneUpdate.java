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
import java.util.List;

/*
    修改
 */
@WebServlet("/iphone/update")
public class IphoneUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/iphone_update.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String resolution = req.getParameter("resolution");
        String camera = req.getParameter("camera");
        String system = req.getParameter("system");
        String memory = req.getParameter("memory");
        IphoneDAO dao = new IphoneInMemoryDAO();
        Iphone iphoneNew = new Iphone(id,name,resolution,camera,system,memory);
         dao.update(iphoneNew);

        req.getRequestDispatcher("/iphone/index").forward(req,resp);
    }
}
