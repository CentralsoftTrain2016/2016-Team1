package service;

import java.sql.SQLException;

import db.LoginDao;

public class LoginService extends Service {
	private LoginDao ldao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.ldao = new LoginDao(this.con);

	}

	public boolean idComparison(int id){
		boolean kekka = false;
		start();
		try {
			kekka = ldao.idComparison(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return kekka;
	}

	public boolean passComparison(int id , String pass){
		boolean kekka = false;
		start();
		try {
			kekka = ldao.passComparison(id,pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return kekka;
	}

	public String getUserName(int id) {
		String roginusername;
		start();
		try {
			roginusername = ldao.getUserName(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return roginusername;

	}
}