package service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import db.AnswerDao;
import domain.value.InvisiblePeriod;

public class AnswerService extends Service {
	public AnswerService() {
	}

	private AnswerDao adao;
	private String searchQuestion;

	// 使用するDaoをnewする
	@Override
	void prePare() {
		this.adao = new AnswerDao(this.con);
	}

	public void setAnswer(int questionID, String answerDetail, InvisiblePeriod ip, String adviceDetail, int userId, String postDate) {
		// String postDate;
		LocalDateTime dateTime = LocalDateTime.now();
		postDate =dateTime.format( DateTimeFormatter.BASIC_ISO_DATE);
				//new SimpleDateFormat().format();
		try {

			adao.setAnswer(
					questionID,
					answerDetail,
					ip,
					adviceDetail,
					userId,
					postDate);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	// ※postDateとviewableTimeから、viewableDateを求める
	// まだ作成中
//	public String getViewableDate(String postDate, String viewableTime){
//		return "2016/06/15 00:00:00";
//	}
}
