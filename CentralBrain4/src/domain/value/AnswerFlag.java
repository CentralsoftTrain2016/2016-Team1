package domain.value;

public class AnswerFlag extends Value {
	private boolean value;

	public AnswerFlag(boolean value) {
		super();
		this.value = value;
	}

	public boolean get() {
		return value;
	}
}
