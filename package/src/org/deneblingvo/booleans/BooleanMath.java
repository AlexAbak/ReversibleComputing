/**
 * Булева алгебра
 */
package org.deneblingvo.booleans;

/**
 * @author alex
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

}
