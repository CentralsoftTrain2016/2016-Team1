package service;

import java.sql.SQLException;

import db.QuestionDao;

public class QuestionDeleteService extends Service {
	private QuestionDao qdao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.qdao = new QuestionDao(this.con);
	}

	public void questionDelete(int questionID) {
		start();
		try {
			qdao.delete(questionID);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			end();
		}
	}

}
