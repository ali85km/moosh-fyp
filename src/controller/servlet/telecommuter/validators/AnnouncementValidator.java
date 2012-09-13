package controller.servlet.telecommuter.validators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Announcement
 */
@WebServlet(name = "AnnouncementValidator",
        urlPatterns = {"/annoucement_validator"})
public class AnnouncementValidator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnouncementValidator() {
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
        // TODO : here we must validate everything, and go to the main menu.
        this.getServletContext().getRequestDispatcher("......????")
                .forward(request, response);
    }
}
