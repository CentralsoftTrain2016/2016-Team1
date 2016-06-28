package service;

import java.sql.SQLException;

import db.QuestionDao;

public class QuestionModifyEndService extends Service {
	private QuestionDao qdao;

	@Override
	void prePare() {
		// TODO 自動生成されたメソッド・スタブ
		this.qdao = new QuestionDao(this.con);
	}

	public void questionModify(int questionID, String questionDetail){
		start();
		try {

			qdao.questionModify(questionID, questionDetail);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			end();
		}
	}

}
