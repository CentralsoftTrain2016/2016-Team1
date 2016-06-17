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
 * Servlet implementation class QuestionPostingSevlet
 */
@WebServlet("/QuestionPostingServlet")
public class QuestionPostingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionPostingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TopService topService = null;
		try{
			TopBean bean;
			topService = new TopService();
			topService.start();
			bean = topService.createTopBean();

			request.setAttribute("bean", bean);
			RequestDispatcher disp = request.getRequestDispatcher("questionPosting.jsp");
			disp.forward(request, response);

		}catch( Throwable t){
			topService.rollebackEnd();
			throw t;
		}
		finally{
			topService.end();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
