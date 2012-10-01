package controller.servlet.login.validators;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.database.DBQueries;

/**
 * Servlet implementation class SignupValidator
 */
@WebServlet(name = "SignupValidator",
        urlPatterns = {"/signup_validator"})
public class SignupValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupValidator() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        User user = new User(request.getParameter("username"),
                request.getParameter("name"), request.getParameter("userid"),
                request.getParameter("password"),
                request.getParameter("gender"), request.getParameter("bdday")
                        + "/" + request.getParameter("bdmonth") + "/"
                        + request.getParameter("bdyear"),
                request.getParameter("citizen"),
                request.getParameter("passport"),
                request.getParameter("homePhone"),
                request.getParameter("cellPhone"),
                request.getParameter("email"), request.getParameter("address"));

        System.out.println(user);

        DBQueries.connectDB();

        try {
            DBQueries.insertUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // TODO : make the validation.

        // TODO : if the validation is good {
        // FIXME : I don't know if redirect is the good way to make this kind of
        // redirection.
        response.sendRedirect("login");
        // } else {
        // TODO : return to signup, but display the errors.
        // response.sendRedirect("signup");
        // }
    }
}
