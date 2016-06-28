package service.bean;

import java.util.List;

import domain.Question;

public class FavoriteListBean extends Bean{
	private  List<Question> 	QUESTIONDETAIL	;

	public List<Question> getQUESTIONDETAIL() {
		return QUESTIONDETAIL;
	}

	public void setQUESTIONDETAIL(List<Question> qUESTIONDETAIL) {
		QUESTIONDETAIL = qUESTIONDETAIL;
	}
}
