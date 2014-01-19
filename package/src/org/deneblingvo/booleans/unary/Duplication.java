/**
 * Дублирование
 */
package org.deneblingvo.booleans.unary;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Дублирование
 */
public final class Duplication extends TruthTable {

	/**
	 * Конструктор
	 */
	public Duplication() {
		super(Duplication.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1};
		return values;
	}

}
