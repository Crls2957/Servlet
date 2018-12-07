package servlet;
import dao.UserDaoImp;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 接受添加数据请求
 */
public class addServlet extends HttpServlet{

    private static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id=Integer.parseInt(req.getParameter("userId"));
       String name=req.getParameter("userName");
       String passwd=req.getParameter("userPasswd");
       String tel=req.getParameter("userTel");
       String address=req.getParameter("userAddress");
        User user=new User(id,name,passwd,tel,address);
        UserDaoImp userDaoImp=new UserDaoImp();
        Boolean result=userDaoImp.addUser(user);
        req.setAttribute("addSuccess",result);
        req.getRequestDispatcher("showServlet").forward(req,resp);
    }
}
