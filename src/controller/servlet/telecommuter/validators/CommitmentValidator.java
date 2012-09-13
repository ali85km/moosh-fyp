package controller.servlet.telecommuter.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Commitment
 */
@WebServlet(name = "CommitmentValidator",
        urlPatterns = {"/commitment_validator"})
public class CommitmentValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommitmentValidator() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO : validate.

        // TODO : if good, else.
        this.getServletContext()
                .getRequestDispatcher("/work_life")
                .forward(request, response);
    }
}
