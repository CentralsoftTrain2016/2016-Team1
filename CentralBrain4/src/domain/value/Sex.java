package domain.value;

public class Sex extends Value {
	private String value;

	public Sex(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
