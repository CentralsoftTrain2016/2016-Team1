package service.bean;

import java.util.List;

import domain.Question;

public class SearchResultBean extends Bean {
	private List<Question> Question;

	public List<Question> getQuestion() {
		return Question;
	}

	public void setQuestion(List<Question> question) {
		Question = question;
	}
}
