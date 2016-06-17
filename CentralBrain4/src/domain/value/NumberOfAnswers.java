package domain.value;

public class NumberOfAnswers extends Value {
	private int value;

	public NumberOfAnswers(int value) {
		super();
		this.value = value;
	}

	public int get() {
		return value;
	}
}
