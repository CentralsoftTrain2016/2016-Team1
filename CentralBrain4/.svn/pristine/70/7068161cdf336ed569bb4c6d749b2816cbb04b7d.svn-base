package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QuestionListService;
import service.bean.UnansweredListBean;

/**
 * Servlet implementation class UnansweredListServlet
 */
@WebServlet("/UnansweredListServlet")
public class UnansweredListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UnansweredListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// QuestionListServiceのインスタンスを生成する
		QuestionListService qls = new QuestionListService();

//		qls.start(); // 検索バーのカテゴリ追加分

		// beanの中にインスタンス生成したサービスクラスから持ってきたものを入れる
		UnansweredListBean question = qls.unanswered();

		request.setAttribute("bean", question);
		RequestDispatcher disp = request.getRequestDispatcher("unansweredList.jsp");
		disp.forward(request, response);



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
