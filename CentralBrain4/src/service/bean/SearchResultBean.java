package service.bean;

import java.util.List;

import domain.Question;

public class SearchResultBean extends Bean {
	private List<Question> Question;
	private String searchCategory;

	public int getHit(){
		return Question.size();
	}

	public int getAllPageCount(){
		return Question.size()/20+1;
	}

	public String getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	private String searchWord;
	public List<Question> getQuestion() {
		return Question;
	}

	public void setQuestion(List<Question> question) {
		Question = question;
	}
}
