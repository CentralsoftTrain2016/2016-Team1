package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TopService;
import service.bean.TopBean;

/**
 * Servlet implementation class Top
 */
@WebServlet("/TopServlet")
public class TopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId ="123";
		//String userId = request.getParameter("id");
		TopService topService = null;
		try{
				TopBean bean;
				topService = new TopService();
				topService.start();
				bean = topService.createTopBean();
				//userIDをintに変換してセッションに入れる
				int userID = Integer.parseInt(userId);
				request.getSession().setAttribute("userID", userID);

				RequestDispatcher disp = request.getRequestDispatcher("top.jsp");
				request.setAttribute("bean", bean);
				disp.forward(request, response);
		}catch( Throwable t)
		{
			topService.rollebackEnd();
			throw t;
		}
		finally
		{
			topService.end();
		}


		RequestDispatcher disp = request.getRequestDispatcher("top.jsp");
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
