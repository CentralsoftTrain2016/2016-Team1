package domain.value;

public class UserName extends Value {
	private String value;

	public UserName(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
