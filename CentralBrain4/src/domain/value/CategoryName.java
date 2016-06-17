package domain.value;

public class CategoryName extends Value {
	private String value;

	public CategoryName(String value) {
		super();
		this.value = value;
	}

	public String get() {
		return value;
	}
}
