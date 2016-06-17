package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao extends Dao {

	public AccountDao(Connection con) {
		super(con);
	}

	/**
	 * アカウント登録メソッド
	 *
	 * @throws SQLException
	 *
	 */
	public void registration(int id, String password, String name, String sex, String birthday, String userType)
			throws SQLException {
		PreparedStatement stmt = null;
		int rset = 0;

		try {
			/* LoginUsersテーブルに追加 */
			stmt = con.prepareStatement("INSERT INTO LOGINUSERS( "
					+ "   UserID, Pass, UserName, Sex, BirthDay, UserType ) " + "VALUES( " + "	?,?,?,?,?,? )");

			stmt.setInt(1, id);
			stmt.setString(2, password);
			stmt.setString(3, name);
			stmt.setString(4, sex);
			stmt.setString(5, birthday);
			stmt.setString(6, userType);

			// SQL実行
			rset = stmt.executeUpdate();
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
	}

	public boolean comparison(int id) throws SQLException {
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
			stmt.setInt(1, id);
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
}
