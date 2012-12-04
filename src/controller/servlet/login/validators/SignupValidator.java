package controller.servlet.login.validators;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.database.insert.GeneralInsertQueries;
import model.database.select.GeneralSelectQueries;

/**
 * Servlet implementation class SignupValidator
 */
@WebServlet(name = "SignupValidator", urlPatterns = { "/signupvalidator" })
public class SignupValidator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupValidator() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		User user = new User(request.getParameter("fname"),
				request.getParameter("lname"), 
				request.getParameter("uname"),
				request.getParameter("password"),
				request.getParameter("gender"), 
				request.getParameter("bdday")
						+ "/" + request.getParameter("bdmonth") + "/"
						+ request.getParameter("bdyear"),
				request.getParameter("citizen"),
				request.getParameter("passport"),
				request.getParameter("homephone"),
				request.getParameter("cellphone"),
				request.getParameter("email"), request.getParameter("address"));

		System.out.println(user);

		// DBConnection.connectDB();

		try {
			GeneralInsertQueries.insertUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		 try {
		 User copy = GeneralSelectQueries.selectUser(
		 request.getParameter("uname"),
		 request.getParameter("password"));
		 System.out.println(copy.toString());
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }

		// TODO : make the validation.

		// TODO : if the validation is good {
		// FIXME : I don't know if redirect is the good way to make this kind of
		// redirection.
		response.sendRedirect("/index");
		// } else {
		// TODO : return to signup, but display the errors.
		// response.sendRedirect("signup");
		// }
	}
}
