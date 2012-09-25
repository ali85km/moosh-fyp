package controller.servlet.manager.forms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommunicationAssessment
 */
@WebServlet(name = "CommunicationAssessment",
        urlPatterns = {"/communication_assessment"})
public class CommunicationAssessment extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunicationAssessment() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
      
    	// check if any error has been sent, then show on the form 
    	
    	this.getServletContext()
                .getRequestDispatcher(
                        "/WEB-INF/manager/communication_assessment.jsp")
                .forward(request, response);
    }
}
