package controller.servlet.telecommuter.forms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkLifeBalance
 */
@WebServlet(name = "WorkLifeBalance",
        urlPatterns = {"/work_life_balance"})
public class WorkLifeBalance extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkLifeBalance() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("button"));

        this.getServletContext()
                .getRequestDispatcher(
                        "/WEB-INF/telecommuter/work_life_balance.jsp")
                .forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("Previous"));

        this.getServletContext().getRequestDispatcher("/WorkLifeBalance.jsp")
                .forward(request, response);
    }

}
