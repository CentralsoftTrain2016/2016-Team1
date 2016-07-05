package service;

import java.sql.Connection;
import java.sql.SQLException;

import db.Dao;

public abstract class Service
{
	protected Connection con =null;

	public void start(Service connectService)
	{
		con = connectService.con;
		prePare();
	}

	public void start()
	{
		try {
			con = Dao.getConnection();
			con.setAutoCommit(true);
			prePare();
		} catch ( SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	//サブクラスでサービスの準備を行う。（Daoの参照を取得する）
	abstract void prePare();

	public void rollebackEnd()
	{
		try {
			if( con != null && con.isClosed())
			{
				throw new RuntimeException("すでにコネクションが閉じています。ロールバックができません。");
			}

			if( con != null )
				con.rollback();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally
		{
			try {
				if( con != null )
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	public void end()
	{
		try {
			if( con != null && !con.isClosed())
			{
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

//	public void getCategories(Bean bean){
//		List<Category> list = bean.getCategories();
//		CategoryDao cdao = new CategoryDao(con);
//		try {
//			cdao.getCategories(list);
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	public Bean createBean(){
//		Bean bean = new Bean();
//		this.getCategories(bean);
//		return bean;
//	}

}