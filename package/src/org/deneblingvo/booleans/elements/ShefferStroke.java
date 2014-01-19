/**
 * Штрих Шеффера
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Штрих Шеффера
 */
public final class ShefferStroke extends TruthTable {

	/**
	 * Конструктор
	 */
	public ShefferStroke() {
		super(ShefferStroke.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {1, 1, 1, 0};
		return values;
	}

}
