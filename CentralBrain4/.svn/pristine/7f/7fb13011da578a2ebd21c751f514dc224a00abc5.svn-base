package service;

import java.sql.SQLException;

import db.AccountDao;

public class AccountService extends Service {
	private AccountDao adao;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.adao = new AccountDao(this.con);
	}

	public void signup(int id,String password,String name,String sex,String birthday,String userType){
		start();
		try {
			adao.registration(id,password,name,sex,birthday,userType);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			end();
		}

	}




	public boolean comparison(int id){
		boolean kekka = false;
		start();
		try {
			kekka = adao.comparison(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return kekka;

	}
}