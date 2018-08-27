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
@WebServlet("/iphone/index")
/*
    获取所有数据
 */
public class IphoneList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IphoneDAO dao = new IphoneInMemoryDAO();
        List<Iphone> iphones = dao.listAll();
        req.setAttribute("iphones",iphones);
        req.getRequestDispatcher("/jsp/iphone_list.jsp").forward(req,resp);
    }
}
