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

@WebServlet("/controllerupd")
public class ControllerUserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("jsp/userupdate.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserEntity userEntity = null;

        try {
            userEntity = new UserService().getUserByIdService(Long.parseLong(req.getParameter("userId")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.getSession().setAttribute("userEntity", userEntity);


        RequestDispatcher rd = req.getRequestDispatcher("jsp/previewupdate.jsp");
        rd.forward(req, resp);
    }
}
