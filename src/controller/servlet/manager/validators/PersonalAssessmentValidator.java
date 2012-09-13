package controller.servlet.manager.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalAssessment
 */
@WebServlet(name = "PersonalAssessmentValidator",
        urlPatterns = {"/personal_assessment_validator"})
public class PersonalAssessmentValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalAssessmentValidator() {
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
        this.getServletContext().getRequestDispatcher("/job_commitment")
                .forward(request, response);
    }
}
