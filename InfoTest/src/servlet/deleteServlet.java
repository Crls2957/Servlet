package servlet;

import dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 接受删除数据请求
 */
public class deleteServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        UserDaoImp userDaoImp=new UserDaoImp();
        boolean deleteFlag=userDaoImp.deleteUser(id);
        req.setAttribute("deleteSuccess",deleteFlag);
        req.getRequestDispatcher("showServlet").forward(req,resp);
    }
}
