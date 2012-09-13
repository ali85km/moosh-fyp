package controller.servlet.login.validators;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
