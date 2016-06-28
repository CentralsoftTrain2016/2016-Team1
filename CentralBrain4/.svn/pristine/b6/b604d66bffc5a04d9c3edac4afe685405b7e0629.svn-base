package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodDao extends Dao {

	public GoodDao(Connection con) {
		super(con);
	}

	/**
	 * アカウント登録メソッド
	 *
	 * @throws SQLException
	 *
	 */
	public boolean good() throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rset ;
		boolean a = true;

		try {
			/* LoginUsersテーブルに追加 */
			stmt = con.prepareStatement(
				    "select "
				+ "    username "
				+ "from"
				+ "   loginusers "
				+ "where"
				+ "    userid = ? "
				);
			// SQL実行
			rset = stmt.executeQuery();
			if(rset.next() == true){
				a = true;
			}else{
				a = false;
			}
		} catch (SQLException e) {
			throw e;

		} finally {
			/* クローズ処理 */
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				stmt = null;
			}
		}
		return a;

	}

	/**
	 * NumberOfGoodの値を1上げるメソッド
	 * @param AnswerID
	 * @throws SQLException
	 */
	public void goodCounter(String AnswerID) throws SQLException {

		int answerID = Integer.parseInt(AnswerID);
		PreparedStatement stmt = null;
		int rset = 0;
		try {

			stmt = con.prepareStatement(
						"UPDATE Answers "
					+ "SET NumberOfGood = NumberOfGood + 1 "
					+ "WHERE AnswerID = ?"
			);

			stmt.setInt(1, answerID);

			// SQL実行
			rset = stmt.executeUpdate();

		} catch ( SQLException e ){
			throw e;
		} finally {
			/* クローズ処理 */
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				stmt = null;
			}
		}
	}

}
