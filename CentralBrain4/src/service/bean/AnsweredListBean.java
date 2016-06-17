package service.bean;

import java.util.List;

import domain.Question;

public class AnsweredListBean extends Bean {
	private  List<Question>	QUESTIONDETAIL	;

	public List<Question> getAnswered() {
		return QUESTIONDETAIL;
	}
	public void setAnswered(List<Question> question) {
		QUESTIONDETAIL = question;
	}
}
