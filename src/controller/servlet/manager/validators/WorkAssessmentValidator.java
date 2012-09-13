package controller.servlet.manager.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkAssessment
 */
@WebServlet(name = "WorkAssessmentValidator",
        urlPatterns = {"/work_assessment_validator"})
public class WorkAssessmentValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkAssessmentValidator() {
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
                .getRequestDispatcher("/communication_assessment")
                .forward(request, response);
    }
}
