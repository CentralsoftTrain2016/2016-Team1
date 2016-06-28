package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.FavoriteDao;
import domain.Question;
import service.bean.FavoriteListBean;

public class FavoriteListService extends Service {

	private FavoriteDao fdao;

	//使用するDaoをnewする
	@Override
	void prePare() {
		this.fdao = new FavoriteDao( this.con);
	}

	//お気に入りの質問を取ってくる
	public FavoriteListBean getFavorite(int userID){
		start();
		//お気に入りのuseId,questiondetail
		List<Question> question = new ArrayList<Question>();
		FavoriteListBean bean = null;
		try {
			//お気に入りのuseId,questiondetailを入れる
			question = fdao.getFavorite(userID);
			bean = new FavoriteListBean();
			this.getCategories(bean);	// 検索バーのカテゴリ追加分

		}
		catch (SQLException e){
			throw new RuntimeException(e);
		}
		finally {
		end();
		}
		//お気に入りのuseId,questiondetailをbeanに格納
		bean.setQUESTIONDETAIL(question);
		return bean;
	}

	//お気に入りのuseId,questionIDをdbにセット
	public void setFavorite(int userID,int questionID){
		start();
		boolean flg;
		try {

			flg = fdao.whyNull(userID, questionID);

			if( flg == false ){
				fdao.setFavorite(userID,questionID);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			end();
		}

	}

}
