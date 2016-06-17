package domain;

import domain.value.CategoryID;
import domain.value.CategoryName;

public class Category {
	public Category(CategoryID cATEGORYID, CategoryName cATEGORYNAME) {
		super();
		CATEGORYID = cATEGORYID;
		CATEGORYNAME = cATEGORYNAME;
	}
	private CategoryID	CATEGORYID	;
	private CategoryName	CATEGORYNAME	;

	public CategoryID getCategoryID() {
		return CATEGORYID;
	}
	public void setCategoryID(CategoryID cATEGORYID) {
		CATEGORYID = cATEGORYID;
	}
	public CategoryName getCategoryName() {
		return CATEGORYNAME;
	}
	public void setCategoryName (CategoryName cATEGORYNAME) {
		CATEGORYNAME = cATEGORYNAME;
	}

}
