package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountService;

/**
 * Servlet implementation class AccountRegistrationEndServlet
 */
@WebServlet("/AccountRegistrationEndServlet")
public class AccountRegistrationEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountRegistrationEndServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;
		int c = 1;
		String d = "";

		AccountService aService = new AccountService();
		String id = request.getParameter("id");
		int id1 = Integer.parseInt(id);
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");
		String sex = request.getParameter("sex");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String usertype = request.getParameter("usertype");

		if (userName.equals(d)) {
			String userNamemessage = "*ユーザ名を入力してください";
			request.setAttribute("userNamemessage", userNamemessage);
			a = 0;
		}

		if (pass.equals(d)) {
			String passwordmessage = "*パスワードを入力してください";
			request.setAttribute("passwordmessage", passwordmessage);
			b = 0;
		}


		if (aService.comparison(id1) == true) {
			String message = "*このIDは現在使われています";
			request.setAttribute("message", message);
			c = 0;
		}

		if (a == 1 && b == 1 && c == 1) {
			String birthday = year + "/" + month + "/" + day;
			aService.signup(id1, pass, userName, sex, birthday, usertype);
			RequestDispatcher disp = request.getRequestDispatcher("accountRegistrationEnd.jsp");
			disp.forward(request, response);
		} else {
			RequestDispatcher disp = request.getRequestDispatcher("accountRegistration.jsp");
			disp.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
