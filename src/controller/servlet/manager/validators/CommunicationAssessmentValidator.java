package controller.servlet.manager.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommunicationAssessment
 */
@WebServlet(name = "CommunicationAssessmentValidator",
        urlPatterns = {"/communication_assessment_validator"})
public class CommunicationAssessmentValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunicationAssessmentValidator() {
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
    	// TODO : read all the input data from the jsp
    	// create the related object and fill them
    	// do validation if needed
    	// 
    	
    	
        // TODO : if good, else.
        response.sendRedirect("job_commitment");
        // if not good then go to the same form but with the filled datas and errors
    
    }
}
