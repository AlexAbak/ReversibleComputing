/**
 * Набор булевых значений
 */
package org.deneblingvo.booleans;


/**
 * @author alex
 * Набор булевых значений
 */
public final class BooleanValues {

	/**
	 * Конструктор
	 * @param value Набор значений в виде целого числа
	 */
	public BooleanValues(int value, int count) {
		BooleanValue[] values = new BooleanValue[count];
		for (int i = values.length - 1; i >= 0; i--) {
			if ((value & 1) == 1) {
				values[i] = BooleanValue.TRUE;
			} else {
				values[i] = BooleanValue.FALSE;
			}
			value = value >> 1;
		}
		this.values = values;
	}

	/**
	 * Конструктор
	 * @param values Набор значений
	 */
	public BooleanValues(BooleanValue[] values) {
		this.values = values;
	}

	/**
	 * Количество значений в наборе
	 * @return
	 */
	public int getCount () {
		return this.values.length;
	}

	/**
	 * Возвратить набор значений в виде целого
	 * @return Набор значений в виде целого
	 */
	public int getValue () {
		int value = 0;
		for (int i = 0; i < this.values.length; i++) {
			value = value << 1;
			if (this.values[i] == BooleanValue.TRUE) {
				value = value + 1;
			} else {
				value = value + 0; // Исключительно для красоты кода
			}
		}
		return value;
	}

	/**
	 * Возвратить набор значений
	 * @return Набор значений
	 */
	public BooleanValue[] getValues () {
		return this.values;
	}

	/**
	 * Набор значений
	 */
	private BooleanValue[] values;

}
