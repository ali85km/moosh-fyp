package controller.servlet.manager.forms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalAssessment
 */
@WebServlet(name = "PersonalAssessment",
        urlPatterns = {"/personal_assessment"})
public class PersonalAssessment extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalAssessment() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext()
                .getRequestDispatcher(
                        "/WEB-INF/manager/personal_assessment.jsp")
                .forward(request, response);
    }
}
