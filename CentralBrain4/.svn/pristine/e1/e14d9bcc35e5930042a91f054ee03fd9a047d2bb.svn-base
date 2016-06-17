/**
 * Categoriesテーブルに関するDAO
 */

package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Category;
import domain.value.CategoryID;
import domain.value.CategoryName;

public class CategoryDao extends Dao {

	public CategoryDao(Connection con) {
		super(con);
	}

	/**
	 * カテゴリーを出すメソッド
	 * @return List
	 * @throws SQLException
	 */
	public List<Category> getCategories() throws  SQLException {

		  List<Category>  list = new ArrayList<Category> ();
		   getCategories(list);

		  return list;
	}

	public void getCategories(List<Category> list) throws SQLException {

	  PreparedStatement stmt = null;
	  ResultSet rset = null;



	  try{

		  /* Statementの作成 */
		  stmt = con.prepareStatement(
					    "select "
				    + "    categoryID, "
					+ "    categoryName "
					+ "from"
					+ "    Categories "
					+ "order by categoryID asc"
					);

		  /* ｓｑｌ実行 */
		  rset = stmt.executeQuery();

		  /* 取得したデータを表示します。 */
		  while (rset.next())
		  {
			  Category em = new Category(
					  new CategoryID(rset.getInt(1)),
					  new CategoryName(rset.getString(2))
					  );

			  list.add(em);

		  }
	  }catch (SQLException e) {
		  e.printStackTrace();
		  throw e;

	  }finally{
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
}
