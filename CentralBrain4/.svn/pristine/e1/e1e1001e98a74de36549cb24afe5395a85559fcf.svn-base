package service;

import java.io.IOException;
import java.sql.SQLException;

import db.QuestionDao;

public class QuestionPostingService extends Service {
	private QuestionDao qdao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.qdao = new QuestionDao(this.con);

	}

	public void questionPostiong(String QuestionDetail, String PostDate,int UserID, String[] arrayCategory) throws IOException {

		String qd = QuestionDetail;
		String pd = PostDate;
		int ui = UserID;
		String categoryName = "";
		int categoryId = 0;
		int questionId = 0;

		start();
		try {
			// 質問をQuestionsテーブルに追加
			qdao.postingQuestion(qd,pd,ui);
			// 最新のQuestionID取得
			questionId = qdao.getQuestionID();
			// 「なし」タグをQuestionsCategoriesテーブルに追加
			qdao.questionsCategoriesInsert(questionId, 0);
			for( String category : arrayCategory){
				categoryName = new String(category.getBytes("ISO8859-1"),"UTF-8");
				categoryId = this.category(categoryName);
				// 「なし」が選択されていない場合挿入
				if( categoryId != 0 ){
					// QuestionIDとCategoryIDをQuestionsCategoriesテーブルに挿入
					qdao.questionsCategoriesInsert(questionId, categoryId);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			end();
		}
	}

	public String time(){
		String postDate;
//		LocalDateTime dateTime = LocalDateTime.now();
//		postDate = new SimpleDateFormat().format(dateTime);
		postDate = "aa";
		return postDate;

	}

	public int category(String category) throws  IOException{
		start();
//		category =new String(category.getBytes("ISO8859-1"),"UTF-8");
		int categoryID = 0;
		try {
			 categoryID = qdao.category(category);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categoryID;
	}

}
