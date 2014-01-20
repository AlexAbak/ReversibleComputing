/**
 * Набор булевых значений
 */
package org.deneblingvo.booleans;


/**
 * @author Алексей Кляузер <drum@pisem.net>
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
	 * Разделение массива значений на два. В первом count  значений остальные во втором.
	 * @param count Количество значений для первого массива
	 * @return Два массива значений
	 */
	public BooleanValues[] extractValues (int count) {
		count = this.getCount() - count;
		int value1 = this.getValue();
		int mask = BooleanMath.mask(count);
		int value2 = value1 & mask;
		value1 = value1 >> count;
		BooleanValues[] outputs = {new BooleanValues(value1, this.getCount() - count), new BooleanValues(value2, count)};
		return outputs;
	}

	/**
	 * Объединение массивов значений
	 * @param values1 Первый массив
	 * @param values2 Второй массив
	 * @return Объединённый массив
	 */
	static public BooleanValues concat (BooleanValues values1, BooleanValues values2) {
		int value = (values1.getValue() << values2.getCount()) + values2.getValue();
		return new BooleanValues(value, values1.getCount() + values2.getCount());
	}

	/**
	 * Набор значений
	 */
	private BooleanValue[] values;

}
