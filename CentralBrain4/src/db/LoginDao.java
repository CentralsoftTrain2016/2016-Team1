package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao extends Dao {

	public LoginDao(Connection con) {
		super(con);
	}

	/**
	 * アカウント登録メソッド
	 *
	 * @throws SQLException
	 *
	 */
	public boolean idComparison(int id) throws SQLException {
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


	public boolean passComparison(int id ,String pass) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rset ;
		boolean a = true;

		try {
			/* LoginUsersテーブルに追加 */
			stmt = con.prepareStatement(
				    "select "
				+ "    username "
				+ "from"
				+ "   LOGINUSERS "
				+ "where"
				+ "    PASS = ? AND"
				+"    USERID = ? "
				);
			stmt.setString(1, pass);
			stmt.setInt(2, id);
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

	private static final String GETUSERNAMESQL =
			  "select "
			+ "    username "
			+ "from"
			+ "   LOGINUSERS "
			+ "where"
			+"    USERID = ? ";
	public String getUserName(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rset = null ;
		String username = null;

		try {
			/* LoginUsersテーブルに追加 */
			stmt = con.prepareStatement(GETUSERNAMESQL);
			stmt.setInt(1, id);
			// SQL実行
			rset = stmt.executeQuery();


			while(rset.next()){
				username = rset.getString(1);
			}
		} finally {
			if(rset != null){
				rset.close();
			}
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
		return username;
	}

//	public boolean comparison(int id) throws SQLException {
//		PreparedStatement stmt = null;
//		ResultSet rset ;
//		boolean a = true;
//
//		try {
//			/* LoginUsersテーブルに追加 */
//			stmt = con.prepareStatement(
//				    "select "
//				+ "    username "
//				+ "from"
//				+ "   loginusers "
//				+ "where"
//				+ "    userid = ? "
//				);
//			stmt.setInt(1, id);
//			// SQL実行
//			rset = stmt.executeQuery();
//			if(rset.next() == true){
//				a = true;
//			}else{
//				a = false;
//			}
//		} catch (SQLException e) {
//			throw e;
//
//		} finally {
//			/* クローズ処理 */
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//					throw new RuntimeException(e);
//				}
//				stmt = null;
//			}
//		}
//		return a;
//
//	}
}
