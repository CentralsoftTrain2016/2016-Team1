/* Replyテーブルに関するDAO
 */

package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.value.InvisiblePeriod;

public class AnswerDao extends Dao {

	public AnswerDao(Connection con) {
		super(con);
	}

	/**
	 * 回答を入力するメソッド
	 * @param questionID    	 質問ID
	 * @param answerDetail       質問内容
	 * @param viewableDate       閲覧制限
	 * @param adviceDetail    アドバイス
	 * @param postDate  		 日時
	 * @param userId      		 ユーザーID
	 * @throws SQLException
	 */
	public void setAnswer(
					int questionID,
					String answerDetail,
					InvisiblePeriod ip,
					String adviceDetail,
					int userId,
					String postDate
					) throws  SQLException {

		  PreparedStatement stmt = null;
		  ResultSet rset = null;



		  try{

			/* Statementの作成 */
			stmt = con.prepareStatement(
						    "insert into Answers("
						+ "  AnswerID, QUESTIONID,AnswerDetail,InvisiblePeriod,AdviceDetail,PostDate,UserID) "
						+ "values"
						+ "    ( AnswerID_seq.nextval,?,?,?,?,?,? ) "
						);

			stmt.setInt(1, questionID);
			stmt.setString(2, answerDetail);
			stmt.setString(3, ip.get());
			stmt.setString(4, adviceDetail);
			stmt.setString(5, postDate);
			stmt.setInt(6, userId);

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

		  }

		catch (SQLException e) {
			throw e;
		}
		finally{
			/* クローズ処理 */
			if(stmt != null){
			  stmt.close();
			  stmt = null;
			}
			if(rset != null){
			  rset.close();
			  rset = null;
			}
		}

		}




//	//未解答の質問を取ってくる
//	public List<UnansweredBean> unanswered() throws  SQLException {
//
//		  PreparedStatement stmt = null;
//		  ResultSet rset = null;
//
//		  List<UnansweredBean>  list = new ArrayList<UnansweredBean> ();
//
//		  try{
//
//			/* Statementの作成 */
//			stmt = con.prepareStatement(
//						    "select "
//						+ "    q.QuestionID, q.QuestionDetail "
//						+ "from"
//						+ "    Questions as q, Categories as c, QuestionsCategories as qc "
//						+ "where"
//						+ "    q.QuestionID = qc.QuestionID and qc.CategoryID = c.CategoryID "
//						+ "and"
//						+ "     c.CategoryName = ? "
//						+ "and"
//						+ "    q.QuestionDetail Like '%?%' "
//						);
//
//
//			/* ｓｑｌ実行 */
//			rset = stmt.executeQuery();
//
//			/* 取得したデータを表示します。 */
//			while (rset.next())
//				{
//					Question em = new Question();
//					em = new Question();
//					em.setQuestionID( new QuestionID (rset.getInt(1)) );
//					em.setQuestionDetail( new QuestionDetail(rset.getString(2)));
//
//					list.add(em);
//
//				}
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
//			if(rset != null){
//			  rset.close();
//			  rset = null;
//			}
//		}
//
//		return list;
//		}
//
//
//
//
//
//




}
