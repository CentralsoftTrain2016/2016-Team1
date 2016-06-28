package domain;

import domain.value.AnswerID;
import domain.value.QuestionID;
import domain.value.ViewStartDateTime;

public class ViewingAnswer {

	private AnswerID	ANSWERID	;
	private QuestionID	QUESTIONID	;
	private ViewStartDateTime VIEWSTARTDATETIME;

	public AnswerID getANSWERID() {
		return ANSWERID;
	}
	public void setANSWERID(AnswerID aNSWERID) {
		ANSWERID = aNSWERID;
	}
	public QuestionID getQUESTIONID() {
		return QUESTIONID;
	}
	public void setQUESTIONID(QuestionID qUESTIONID) {
		QUESTIONID = qUESTIONID;
	}
	public ViewStartDateTime getVIEWSTARTDATETIME() {
		return VIEWSTARTDATETIME;
	}
	public void setVIEWSTARTDATETIME(ViewStartDateTime vIEWSTARTDATETIME) {
		VIEWSTARTDATETIME = vIEWSTARTDATETIME;
	}

}
