package service.bean;

import java.util.ArrayList;
import java.util.List;

import domain.Category;
import domain.value.Message;

public class Bean {
	private Message message;
	private int userid;
	private String username;
	private String pass;
	private String birthday;
	private String usertype;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Bean() {
		message = new Message("");
	}

	List<Category> categories = new ArrayList<Category>();
	public Object setUserID;



	public List<Category> getCategories() {
		return categories;
	}
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public int getUserID() {
		return userid;
	}
	public void setUserID(int userID) {
		this.userid = userID;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String pass) {
		this.pass = pass;
	}
	public String getBirthDay() {
		return birthday;
	}
	public void setBirthDay(String birthday) {
		this.birthday = birthday;
	}
	public String getUserType() {
		return usertype;
	}
	public void setUserType(String usertype) {
		this.usertype = usertype;
	}

}
