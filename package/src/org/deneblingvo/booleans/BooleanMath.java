/**
 * Булева алгебра
 */
package org.deneblingvo.booleans;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Булева алгебра
 */
public final class BooleanMath {

	/**
	 * Целочисленный двоичный логарифм
	 * @param value Число
	 * @return Значение логарифма числа
	 */
	static public int lg (int value) {
		return (int) Math.floor(Math.log(value) / Math.log(2)); 
	}

	/**
	 * Получение маски определённого размера
	 * @param count Размер маски
	 * @return Маска
	 */
	static public int mask(int count) {
		int value = 0;
		for (int i = 0; i < count; i++) {
			value = value << 1;
			value = value + 1;
		}
		return value;
	}

}
