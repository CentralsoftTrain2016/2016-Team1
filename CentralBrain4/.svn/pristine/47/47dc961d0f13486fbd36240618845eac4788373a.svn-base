package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QuestionModifyEndService;

/**
 * Servlet implementation class QuestionSevlet
 */
@WebServlet("/QuestionModifyEndServlet")
public class QuestionModifyEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionModifyEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/* インスタンス生成 */
		QuestionModifyEndService questionModifyEndService = new QuestionModifyEndService();

		/* 値を取得 */
		int questionID = Integer.parseInt(request.getParameter("questionID"));
		String questionDetail = request.getParameter("QuestionDetail");

		// 文字化けのおまじない
		questionDetail = new String(questionDetail.getBytes("ISO8859-1"), "UTF-8");

		/* Serviceへ投げる */
		questionModifyEndService.questionModify(questionID, questionDetail);

		request.setAttribute("questionID", questionID);
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
