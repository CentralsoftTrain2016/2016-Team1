package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QuestionService;
import service.bean.SearchResultBean;

/**
 * Servlet implementation class SearchResultSevlet
 */
@WebServlet("/SearchResultServlet")
public class SearchResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// リクエストから検索カテゴリを取得
		String searchCategory = request.getParameter("searchCategory");
//		// リクエストから検索文字列を取得
		String searchWord = request.getParameter("searchWord");


		//文字化けのおまじない
		searchWord =new String(searchWord.getBytes("ISO8859-1"),"UTF-8");
		searchCategory =new String(searchCategory.getBytes("ISO8859-1"),"UTF-8");

		SearchResultBean bean = null;
		try{
			// qServiceのインスタンス生成
			QuestionService qService = new QuestionService();
			// beanに質問一覧を入れる。
			bean = qService.getSearchResultBean(searchCategory, searchWord);
		} catch( Throwable t ) {
			t.printStackTrace();
		};

		request.setAttribute("bean", bean);
		RequestDispatcher disp = request.getRequestDispatcher("searchResult.jsp");
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
