/**
 * Алгебра на массивах
 */
package org.deneblingvo.utils;

/**
 * @author alex
 * Алгебра на массивах
 */
public final class ArrayMath {

	/**
	 * Максимальный элемент массива
	 * @param values Массив целых
	 * @return Максимальное значение
	 */
	static public int max (int[] values) {
		int value = values[0];
		for (int i = 1; i < values.length; i++) {
			value = Math.max(value, i);
		}
		return value;
	}

}
