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

@WebServlet("/controllerdel")
public class ControllerDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("jsp/homedel.jsp");
        rd.forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserEntity userEntity = new UserEntity();
        Service service = new UserService();
        boolean result = false;
        Long userId = Long.parseLong(req.getParameter("userId"));
        userEntity.setUserId(userId);


        if (userEntity != null) {
            try {
                result = service.deleteUserByIdService(userEntity);
            } catch (Exception e) {
                e.printStackTrace();
            }
            req.getSession().setAttribute("result", result);

        } else if (userEntity == null) {
            //doesn't work:
            req.getSession().setAttribute("userId", userId);
            RequestDispatcher rd = req.getRequestDispatcher("jsp/userNotFound.jsp");
            rd.forward(req, resp);
        }

        if (!result) {
            req.getSession().setAttribute("userId", userId);
            RequestDispatcher rd = req.getRequestDispatcher("jsp/userNotFound.jsp");
            rd.forward(req, resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("jsp/resultDelete.jsp");
            rd.forward(req, resp);
        }

    }
}