package service;

import java.sql.SQLException;

import db.AccountDao;

public class AccountDeleteService extends Service {

	private AccountDao adao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.adao = new AccountDao(this.con);
	}

	public void accountDelete(int userID) throws SQLException {

		try {

			adao.delete(userID);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
