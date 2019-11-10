package servlets;

import entity.UserEntity;
import service.Service;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controllercreate")
public class CreateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("jsp/createuser.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserEntity userEntity = new UserEntity();
        Service service = new UserService();
      //  PrintWriter writer = resp.getWriter();


       String name = req.getParameter("name");
       int age = Integer.parseInt(req.getParameter("age"));
        userEntity.setName(name);
        userEntity.setAge(age);
        boolean createResult = false;
        try {
              createResult=service.createUser(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("age", age);
        req.getSession().setAttribute("createResult", createResult);

        RequestDispatcher rd = req.getRequestDispatcher("jsp/resultCreate.jsp");
        rd.forward(req, resp);
    }
}
