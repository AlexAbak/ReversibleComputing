/**
 * Отрицание
 */
package org.deneblingvo.booleans.unary;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 * Отрицание
 */
public final class Negative extends TruthTable {

	/**
	 * Конструктор
	 */
	public Negative () {
		super(Negative.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {1, 0};
		return values;
	}

}
