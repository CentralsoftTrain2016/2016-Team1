package domain;

import domain.value.AdviceDetail;
import domain.value.AnswerDetail;
import domain.value.AnswerID;
import domain.value.BestAnswerFlag;
import domain.value.NumberOfGood;
import domain.value.PostDate;
import domain.value.QuestionID;
import domain.value.UserID;
import domain.value.ViewableDate;

public class Answer {
	private AnswerID ANSWERID;
	private QuestionID QUESTIONID;
	private NumberOfGood NUMBEROFGOOD;
	private BestAnswerFlag BESTANSWERFLAG;
	private AnswerDetail ANSWERDETAIL;
	private ViewableDate VIEWABLEDATE;
	private AdviceDetail ADVICEDETAIL;
	private PostDate POSTDATE;
	private UserID USERID;
	public AnswerID getAnswerID() {
		return ANSWERID;
	}
	public void setAnswerID(AnswerID aNSWERID) {
		ANSWERID = aNSWERID;
	}
	public QuestionID getQuestionID() {
		return QUESTIONID;
	}
	public void setQuestionID(QuestionID qUESTIONID) {
		QUESTIONID = qUESTIONID;
	}
	public NumberOfGood getNumberOfGood() {
		return NUMBEROFGOOD;
	}
	public void setNumberOfGood(NumberOfGood nUMBEROFGOOD) {
		NUMBEROFGOOD = nUMBEROFGOOD;
	}
	public BestAnswerFlag getBestAnswerFlag() {
		return BESTANSWERFLAG;
	}
	public void setBestAnswerFlag(BestAnswerFlag bESTANSWERFLAG) {
		BESTANSWERFLAG = bESTANSWERFLAG;
	}
	public AnswerDetail getAnswerDetail() {
		return ANSWERDETAIL;
	}
	public void setAnswerDetail(AnswerDetail aNSWERDETAIL) {
		ANSWERDETAIL = aNSWERDETAIL;
	}
	public ViewableDate getViewableDate() {
		return VIEWABLEDATE;
	}
	public void setViewableDate(ViewableDate vIEWABLEDATE) {
		VIEWABLEDATE = vIEWABLEDATE;
	}
	public AdviceDetail getAdviceDetail() {
		return ADVICEDETAIL;
	}
	public void setAdviceDetail(AdviceDetail aDVICEDETAIL) {
		ADVICEDETAIL = aDVICEDETAIL;
	}
	public PostDate getPostDate() {
		return POSTDATE;
	}
	public void setPostDate(PostDate pOSTDATE) {
		POSTDATE = pOSTDATE;
	}
	public UserID getUserID() {
		return USERID;
	}
	public void setUserID(UserID uSERID) {
		USERID = uSERID;
	}


}
