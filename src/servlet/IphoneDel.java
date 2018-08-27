package servlet;
/*
    删除
 */

import dao.IphoneDAO;
import dao.IphoneInMemoryDAO;
import entity.Iphone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/iphone/del")
public class IphoneDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        IphoneDAO dao = new IphoneInMemoryDAO();
        Iphone iphone = dao.getIphoneById(id);

        dao.delete(id);
        resp.sendRedirect("/iphone/index");
    }
}
