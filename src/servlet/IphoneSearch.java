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
    查询
 */
@WebServlet("/iphone/search")
public class IphoneSearch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        IphoneDAO dao = new IphoneInMemoryDAO();
        List<Iphone> iphones = dao.getIphonesByName(name);
        req.setAttribute("iphones",iphones);
        req.getRequestDispatcher("/jsp/iphone_list.jsp").forward(req,resp);
    }
}
