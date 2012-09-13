package controller.servlet.telecommuter.forms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EqipmentUsage
 */
@WebServlet(name = "EquipmentUsage",
        urlPatterns = {"/equipment_usage"})
public class EquipmentUsage extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EquipmentUsage() {
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
                        "/WEB-INF/telecommuter/equipment_usage.jsp")
                .forward(request, response);
    }
}
