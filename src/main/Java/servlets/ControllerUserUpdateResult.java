package servlets;

import entity.UserEntity;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/controllerresult")
public class ControllerUserUpdateResult extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher rd = req.getRequestDispatcher("jsp/userupdate.jsp");
//        rd.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  Long currentUserId =Long.parseLong(req.getParameter("userId"));
        Long userId = Long.parseLong(req.getParameter("userId"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        UserEntity userEntity = new UserEntity (userId, name, age);
        boolean updateResult = false;
        try {
            updateResult = new UserService().userUpdate(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  UserEntity user = new UserService().getUserByIdService(2);
//        req.getSession().setAttribute("name", user.getName());
//        req.getSession().setAttribute("id", user.getUserId());
//        req.getSession().setAttribute("age", user.getAge());

        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("age", age);
        req.getSession().setAttribute("userId", userId);
        req.getSession().setAttribute("updateResult", updateResult);

        RequestDispatcher rd = req.getRequestDispatcher("jsp/resultUpdate.jsp");
        rd.forward(req, resp);

    }
}
