package domain.value;

public class AnswerDetail extends Value {
	private String value;

	public AnswerDetail(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
