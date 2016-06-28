package service;

import service.bean.QuestionModifyBean;

public class QuestionModifyService extends Service {

	@Override
	void prePare() {
		// TODO 自動生成されたメソッド・スタブ
	}

	public QuestionModifyBean setBean(int questionID, String questionDetail){
		start();
		QuestionModifyBean bean = null;
		try {

			bean = new QuestionModifyBean();
			bean.setQuestionID(questionID);
			bean.setQuestionDetail(questionDetail);
			this.getCategories(bean);	// 検索バーのカテゴリ追加分

		} catch (NullPointerException e) {
			throw new RuntimeException(e);
		} finally {
			end();
		}
		return bean;
	}

}
