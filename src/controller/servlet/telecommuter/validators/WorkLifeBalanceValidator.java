package controller.servlet.telecommuter.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkLifeBalance
 */
@WebServlet(name = "WorkLifeBalanceValidator",
        urlPatterns = {"/work_life_balance_validator"})
public class WorkLifeBalanceValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkLifeBalanceValidator() {
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
        System.out.println(request.getParameter("button"));

        this.getServletContext().getRequestDispatcher("/work_life_balance")
                .forward(request, response);
    }
}
