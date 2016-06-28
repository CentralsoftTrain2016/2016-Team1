package service;

import java.sql.SQLException;

import db.GoodDao;

public class GoodService extends Service {
	private GoodDao ldao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.ldao = new GoodDao(this.con);

	}

	public void good(String answerID){
		start();
		try {
			ldao.goodCounter(answerID);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			end();
		}
	}
}