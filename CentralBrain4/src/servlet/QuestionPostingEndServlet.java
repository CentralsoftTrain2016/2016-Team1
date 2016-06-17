package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.value.Message;
import service.QuestionPostingService;
import service.Service;
import service.TopService;
import service.bean.Bean;

/**
 * Servlet implementation class QuestionPostingEndSevlet
 */
@WebServlet("/QuestionPostingEndServlet")
public class QuestionPostingEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionPostingEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionPostingService qps = new QuestionPostingService();

		// セレクトリストから選択された値を配列に挿入
		String[] arrayCategory = request.getParameterValues("category");

		int userID = (int) request.getSession().getAttribute("userID");   //セッションからユーザIDを引っ張ってくる
		String questiondetail = request.getParameter("detail");
		String nowtime = qps.time(); //現在の時間を取ってくるメソッド
		//文字化けのおまじない
		questiondetail =new String(questiondetail.getBytes("ISO8859-1"),"UTF-8");
		//入力値なしの場合
		if(questiondetail == null ||questiondetail.equals("") || questiondetail.length()<10)
		{
			String message = "10文字以上2000字以内で入力してください。";
			Bean bean;

				bean = new Bean();
				bean.setMessage(new Message(message));
			RequestDispatcher disp = request.getRequestDispatcher("/QuestionPostingServlet");
			request.setAttribute("bean", bean);
			disp.forward(request, response);
			return;
		}

		Service service = null;
		try{
				service = new TopService();
				service.start();
				Bean bean = service.createBean();

				//サービスクラスのメソッドを呼び出す
				qps.questionPostiong(questiondetail, nowtime, userID, arrayCategory);

				RequestDispatcher disp = request.getRequestDispatcher("questionPostingEnd.jsp");
				request.setAttribute("bean", bean);
				disp.forward(request, response);

		}catch( Throwable t)
		{
			service.rollebackEnd();
			throw t;
		}
		finally
		{
			service.end();
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
