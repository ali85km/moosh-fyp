package controller.servlet.login.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name = "LoginValidator",
        urlPatterns = {"/login_validator"})
public class LoginValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidator() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        // TODO : make the validation.

        // TODO : if the validation is good {
        // FIXME : how to go from here to the ... page.

        // } else {
        // TODO : return to signup, but display the errors.
        // this.getServletContext()
        // .getRequestDispatcher("/signup").forward(request, response);
        // }
    }
}
