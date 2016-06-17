package domain.value;
import java.time.LocalDateTime;

public class PostDate extends Value {
	private String stringValue;
	private LocalDateTime ldtValue;

	public PostDate(String stringValue) {
		super();
		this.stringValue = stringValue;
	}

	public PostDate(LocalDateTime ldtValue) {
		super();
		this.ldtValue = ldtValue;
	}

	public String getString() {
		return stringValue;
	}

	public LocalDateTime getLocalDateTime() {
		return ldtValue;
	}

}
