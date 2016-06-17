package domain;

import domain.value.UserID;
import domain.value.UserName;

public class User {
	private UserID	UserID	;
	private UserName	UserName	;

	public UserID getUserID() {
		return UserID;
	}
	public void setUserID(UserID userID) {
		UserID = userID;
	}
	public UserName getUserName() {
		return UserName;
	}
	public void setUserName(UserName userName) {
		UserName = userName;
	}
}
