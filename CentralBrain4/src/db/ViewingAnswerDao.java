package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.ViewingAnswer;
import domain.value.ViewStartDateTime;

public class ViewingAnswerDao extends Dao{

	public ViewingAnswerDao(Connection con) {
		super(con);
	}

//	public void insertViewingAnswer( int userID, String QuestionID ){
//		  PreparedStatement stmt = null;
//		  int rset = 0;
//
//		  try{
//
//			/* Statementの作成 */
//			stmt = con.prepareStatement(
//							"INSERT INTO ViewingAnswer("
//						+			""
//					);
//
//			stmt.setInt(1, userID);
//			stmt.setString(2, QuestionID);
//
//			/* ｓｑｌ実行 */
//			rset = stmt.executeUpdate();
//
//		  }
//
//		catch (SQLException e) {
//			throw e;
//		}
//		finally{
//			/* クローズ処理 */
//			if(stmt != null){
//			  stmt.close();
//			  stmt = null;
//			}
//		}
//	}


	/**
	 * viewStartDateTimeを取得メソッド
	 * @throws SQLException
	 */
	public ViewingAnswer getViewStartTime( int answerId ) throws SQLException{

		PreparedStatement stmt = null;
		ResultSet rset = null;

		ViewingAnswer viewingAnswer = new ViewingAnswer();

		try{
			/* ViewingAnswerテーブルからviewStartDateTimeを取得 */
			stmt = con.prepareStatement(
						"SELECT "
					+		"VIEWSTARTDATETIME "
					+	"FROM "
					+		"VIEWINGANSWER "
					+	"WHERE "
					+		"ANSWERID = ? "
					);

			// 回答IDセット
			stmt.setInt(1, answerId);
			// SQL実行
			rset = stmt.executeQuery();

			// データがあるなら閲覧可能時間取得
			// ないなら何もないまま
			if( rset.next() ){
				viewingAnswer.setVIEWSTARTDATETIME(new ViewStartDateTime(rset.getString(1)));
			}

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

		return viewingAnswer;

	}

	/**
	 * ViewingAnswerにデータを挿入するメソッド
	 * @param answerId  回答ID
	 * @param userId    自分のID
	 * @param ldt       閲覧制限時刻
	 * @throws SQLException
	 */
	public void setViewingAnswer(int answerId, int userId, String ldt) throws SQLException{

		PreparedStatement stmt = null;
		int rset = 0;

		try{
			/* Questionsテーブルに追加 */
			stmt = con.prepareStatement(
							"INSERT INTO ViewingAnswer( "
						+		"AnswerID, UserID, viewStartDateTime ) "
						+	"VALUES( "
						+	"	?,?,? )"
			);

			stmt.setInt( 1, answerId );
			stmt.setInt( 2, userId);
			stmt.setString(3, ldt );

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
