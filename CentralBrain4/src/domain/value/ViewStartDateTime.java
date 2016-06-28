package domain.value;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ViewStartDateTime extends Value {
	private String value;
	private LocalDateTime ldtValue;

	public ViewStartDateTime(String value) {
		super();
		this.value = value;
		this.ldtValue = LocalDateTime.parse( value );
	}

	public ViewStartDateTime(LocalDateTime ldtValue) {
		super();
		this.ldtValue = ldtValue;
		this.value =ldtValue.format( DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}

	public String getString() {
		return value;
	}

	public LocalDateTime getLocalDateTime() {
		return ldtValue;
	}
}
