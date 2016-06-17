package domain.value;

public class UserID extends Value {
	private int value;

	public UserID(int value) {
		super();
		this.value = value;
	}

	public int get() {
		return value;
	}
}
