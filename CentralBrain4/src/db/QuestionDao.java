/**
 * Questionテーブルに関するDAO
 */

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

public class QuestionDao extends Dao {

	public QuestionDao(Connection con) {
		super(con);
	}

	/**
	 * 質問を検索するメソッド
	 *
	 * @param categoryName
	 *            カテゴリー名
	 * @param searchWord
	 *            検索文字列
	 * @return List
	 * @throws SQLException
	 */
	public List<Question> getSearchQuestion(String categoryName, String searchWord) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rset = null;

		List<Question> list = new ArrayList<Question>();

		try {

			/* Statementの作成 */
			stmt = con.prepareStatement("select " + "    q.QuestionID, q.QuestionDetail " + "from"
					+ "    Questions q, Categories c, QuestionsCategories qc " + "where"
					+ "    q.QuestionID = qc.QuestionID and qc.CategoryID = c.CategoryID " + "and"
					+ "     c.CategoryName = ? " + "and" + "    q.QuestionDetail Like ? ");

			stmt.setString(1, categoryName);
			stmt.setString(2, "%" + searchWord +"%");

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

			/* 取得したデータを表示します。 */
			while (rset.next()) {
				Question em = new Question();
				em.setQuestionID(new QuestionID(rset.getInt(1)));
				em.setQuestionDetail(new QuestionDetail(rset.getString(2)));

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

	// 未解答の質問を取ってくる
	public List<Question> unanswered() throws SQLException {

		// 初期値の設定
		PreparedStatement stmt = null;
		ResultSet rset = null;

		List<Question> list = new ArrayList<Question>();

		try {

			/* Statementの作成 */
			// 未回答の質問を取り出すSQL
			stmt = con.prepareStatement(
					"select " + "    QuestionID,QuestionDetail " + "from" + "    Questions " + "where" + "    AnswerFlag = 0 order by QuestionID desc" );

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

			if (rset == null) {
				return null;
			} else {
				/* 取得したデータを表示します。 */
				while (rset.next()) {
					Question em = new Question();
					em.setQuestionID(new QuestionID(rset.getInt(1)));
					em.setQuestionDetail(new QuestionDetail(rset.getString(2)));
					list.add(em);
				}

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

	// 解答済みの質問を取ってくる
	public List<Question> answered() throws SQLException {

		// 初期値の設定
		PreparedStatement stmt = null;
		ResultSet rset = null;

		List<Question> list = new ArrayList<Question>();

		try {

			/* Statementの作成 */
			// 未回答の質問を取り出すSQL
			stmt = con.prepareStatement(
					"select " + "    QuestionID,QuestionDetail " + "from" + "    Questions " + "where" + "    AnswerFlag = 1 order by QuestionID desc");

			/* ｓｑｌ実行 */
			rset = stmt.executeQuery();

			/* 取得したデータを表示します。 */
			while (rset.next()) {
				Question em = new Question();
				em.setQuestionID(new QuestionID(rset.getInt(1)));
				em.setQuestionDetail(new QuestionDetail(rset.getString(2)));
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

	public void postingQuestion( String questionDetail, String postDate, int userId) throws  SQLException {
		PreparedStatement stmt = null;
		int rset = 0;

		try{
			/* Questionsテーブルに追加 */
			stmt = con.prepareStatement(
						"INSERT INTO Questions( "
					+	"QuestionID, QuestionDetail, Postdate, userID ) "
					+	"VALUES( "
					+	"	QuestionID_seq.nextval,?,?,?)"
			);

			stmt.setString( 1, questionDetail );
			stmt.setString( 2, postDate);
			stmt.setInt(3, userId );

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

	/**
	 *  最新の投稿された質問のIDを取得するメソッド
	 * @return String questionId
	 */
	public int getQuestionID() throws SQLException{
		PreparedStatement stmt = null;
		ResultSet rset = null;
		int questionId = 0;
		try{
			/* Questionsテーブルから最新のQuestionIDを取得 */
			stmt = con.prepareStatement(
						"SELECT QuestionID "
					+	"FROM Questions "
					+	"WHERE rownum = 1 order by QuestionID desc"

					);
			// SQL実行
			rset = stmt.executeQuery();
			rset.next();
			questionId = rset.getInt(1);
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
		return questionId;
	}


	/**
	 * 質問投稿する際にQuestionsCategorisに質問idとカテゴリidを挿入するメソッド
	 * @param questionId
	 * @param categoryId
	 * @throws SQLException
	 */
	public void questionsCategoriesInsert( int questionId, int categoryId ) throws SQLException{

		PreparedStatement stmt = null;
		int rset = 0;
	try {

		stmt = con.prepareStatement(
				"INSERT INTO QuestionsCategories( "
			+	"QuestionID, CategoryID )"
			+	"VALUES( "
			+	"	?,? )"
			);
		stmt.setInt( 1, questionId);
		stmt.setInt( 2, categoryId );
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

	public int category(String category) throws  SQLException {
		// 初期値の設定
				PreparedStatement stmt = null;
				ResultSet rset = null;
				int id;

				try {
					stmt = con.prepareStatement(
							"select " + "    CategoryID " + "from" + "    Categories " + "where" + "   CategoryName = ? " );

					/* ｓｑｌ実行 */

					stmt.setString( 1, category );
					rset = stmt.executeQuery();
					rset.next();
					 id = rset.getInt(1);
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
				return id;
	}




}
