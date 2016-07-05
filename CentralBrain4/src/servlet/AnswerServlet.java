package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AnswerService;
import service.bean.QuestionBean;

/**
 * Servlet implementation class AnswerSevlet
 */
@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String QuestionID = "1";
		String QuestionID = request.getParameter("questionID");
		int questionID = Integer.parseInt(QuestionID);
		QuestionBean bean;
		AnswerService aService = new AnswerService();
		aService.start();
		try{
			bean = aService.getMyAnswerQuestionID( questionID );
		} finally{
			aService.end();
		}


		request.setAttribute("bean", bean);
		RequestDispatcher disp = request.getRequestDispatcher("answer.jsp");
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
