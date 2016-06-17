package domain.value;

public class Pass extends Value {
	private String value;

	public Pass(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
