package lk.udcreations.common.util;

import java.util.function.Consumer;

public class CommonUtils {

	/**
	 * Sets the value to the target field only if the value is not null.
	 * 
	 * @param value        The value to set.
	 * @param setterMethod The setter method (e.g., entity::setField).
	 * @param <T>          The type of the value.
	 */
	public static <T> void setIfNotNull(T value, Consumer<T> setterMethod) {
		if (value != null) {
			setterMethod.accept(value);
		}
	}
}
