package domain.value;

public class NumberOfGood extends Value {
	private int value;

	public NumberOfGood(int value) {
		super();
		this.value = value;
	}

	public int get() {
		return value;
	}
}
