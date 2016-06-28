package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Question;
import domain.value.QuestionDetail;
import domain.value.QuestionID;

public class FavoriteDao extends Dao{
	public FavoriteDao(Connection con) {
		super(con);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public List<Question> getFavorite(int userID) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rset = null;

		List<Question> list = new ArrayList<Question>();

		try {

			/* Statementの作成 */
			stmt = con.prepareStatement(
					  " select "
					+ " Favorites.QuestionID, QuestionDetail "
					+ " from"
					+ " Questions, Favorites"
					+ " where"
					+ " Questions.QuestionID = Favorites.QuestionID "
					+ " and"
					+ " Favorites.userID = ? "
					);

			stmt.setInt(1, userID);

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

			/* 取得したデータを表示します。 */
			while (rset.next()) {
				Question em = new Question();
				em.setQUESTIONID(new QuestionID(rset.getInt(1)));
				em.setQUESTIONDETAIL(new QuestionDetail(rset.getString(2)));

				list.add(em);

			}
		}

		catch (SQLException e) {
			throw e;
		} finally {
			/* クローズ処理 */
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (rset != null) {
				rset.close();
				rset = null;
			}
		}

		return list;
	}
	public void setFavorite(int userID,int QuestionID) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rset = null;

		try {

			/* Statementの作成 */
			stmt = con.prepareStatement(
					 " INSERT INTO Favorites( "
					+" userID, QuestionID) "
					+" VALUES( "
					+" ?,?)"
					);
			stmt.setInt(1, userID);
			stmt.setInt(2, QuestionID);

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

		}

		catch (SQLException e) {
			throw e;
		} finally {
			/* クローズ処理 */
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (rset != null) {
				rset.close();
				rset = null;
			}
		}

	}

	public boolean whyNull (int userID,int questionID) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rset = null;
		boolean flg;

		try {

			/* Statementの作成 */
			stmt = con.prepareStatement(
					 " SELECT * "
					+ " FROM Favorites "
					+ " WHERE UserID = ? "
					+ " AND QuestionID = ? "
					);

			stmt.setInt(1, userID);
			stmt.setInt(2, questionID);

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

			flg = rset.next();

		}

		catch (SQLException e) {
			throw e;
		} finally {
			/* クローズ処理 */
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (rset != null) {
				rset.close();
				rset = null;
			}
		}
		return flg;
	}

}
