package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.FavoriteListService;

/**
 * Servlet implementation class AddFavoriteServlet
 */
@WebServlet("/AddFavoriteServlet")
public class AddFavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFavoriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//sessionからuseid取得
		int userID = (int) request.getSession().getAttribute("userID");

		/* questionIDを取得 */
		int questionID = Integer.parseInt(request.getParameter("questionID"));

		FavoriteListService fls = new FavoriteListService();
		fls.setFavorite(userID, questionID);
		RequestDispatcher disp = request.getRequestDispatcher("QuestionServlet");
		disp.forward(request, response);

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
