/**
 * Набор булевых значений
 */
package org.deneblingvo.booleans.core;



/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Набор булевых значений
 */
public final class Values {

	/**
	 * Конструктор
	 * @param value Набор значений в виде целого числа
	 */
	public Values(int value, int count) {
		Value[] values = new Value[count];
		for (int i = values.length - 1; i >= 0; i--) {
			if ((value & 1) == 1) {
				values[i] = Value.TRUE;
			} else {
				values[i] = Value.FALSE;
			}
			value = value >> 1;
		}
		this.values = values;
	}

	/**
	 * Конструктор
	 * @param values Набор значений
	 */
	public Values(Value[] values) {
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
			if (this.values[i] == Value.TRUE) {
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
	public Value[] getValues () {
		return this.values;
	}

	/**
	 * Разделение массива значений на два. В первом count  значений остальные во втором.
	 * @param count Количество значений для первого массива
	 * @return Два массива значений
	 */
	public Values[] extractValues (int count) {
		count = this.getCount() - count;
		int value1 = this.getValue();
		int mask = BooleanMath.mask(count);
		int value2 = value1 & mask;
		value1 = value1 >> count;
		Values[] outputs = {new Values(value1, this.getCount() - count), new Values(value2, count)};
		return outputs;
	}

	/**
	 * Объединение массивов значений
	 * @param values1 Первый массив
	 * @param values2 Второй массив
	 * @return Объединённый массив
	 */
	static public Values concat (Values values1, Values values2) {
		int value = (values1.getValue() << values2.getCount()) + values2.getValue();
		return new Values(value, values1.getCount() + values2.getCount());
	}

	/**
	 * Набор значений
	 */
	private Value[] values;

}
