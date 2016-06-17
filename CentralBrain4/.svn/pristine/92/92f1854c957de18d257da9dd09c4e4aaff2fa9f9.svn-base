package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.QuestionDao;
import domain.Question;
import service.bean.SearchResultBean;

public class QuestionService extends Service {
public	QuestionService(){
	}
	private QuestionDao qdao;

	//使用するDaoをnewする
	@Override
	void prePare() {
		this.qdao = new QuestionDao( this.con);
	}


public SearchResultBean getSearchResultBean( String category,String searchWord ){
	start();
	List<Question> question = new ArrayList<Question>();

	SearchResultBean bean = null;
	try {
		if( searchWord.equals("") || searchWord == null ){
			searchWord = "%";
		}

		question = qdao.getSearchQuestion(category,searchWord);

		bean = new SearchResultBean();

		this.getCategories(bean);	// 検索バーのカテゴリ追加分
	}
	catch (SQLException e)
	{
		throw new RuntimeException(e);
	} finally {
		end();
	}

	bean.setQuestion(question);
	return bean;
}
}


