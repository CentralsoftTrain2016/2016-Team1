package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QuestionModifyService;
import service.bean.QuestionModifyBean;

/**
 * Servlet implementation class QuestionSevlet
 */
@WebServlet("/QuestionModifyServlet")
public class QuestionModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/* インスタンス生成 */
		QuestionModifyService questionModifyService = new QuestionModifyService();
		QuestionModifyBean bean = null;

		/* jspから値を受け取る */
		int questionID = Integer.parseInt(request.getParameter("QuestionID"));
		String questionDetail = request.getParameter("QuestionDetail");

		/* 文字化けのおまじない */
		questionDetail =new String(questionDetail.getBytes("ISO8859-1"),"UTF-8");

		/* beanにセット */
		bean = questionModifyService.setBean(questionID, questionDetail);

		request.setAttribute("bean", bean);
		RequestDispatcher disp = request.getRequestDispatcher("questionModify.jsp");
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
