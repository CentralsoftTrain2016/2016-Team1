package domain.value;

public class QuestionDetail extends Value {
	private String value;

	public QuestionDetail(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
