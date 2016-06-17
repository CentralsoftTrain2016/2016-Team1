package domain.value;

public class BestAnswerFlag extends Value {
	private boolean value;

	public BestAnswerFlag(boolean value) {
		super();
		this.value = value;
	}

	public boolean get() {
		return value;
	}
}