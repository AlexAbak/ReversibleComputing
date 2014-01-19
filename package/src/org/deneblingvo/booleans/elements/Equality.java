/**
 * Эквиваленция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Эквиваленция
 */
public final class Equality extends TruthTable {

	/**
	 * Конструктор
	 */
	public Equality() {
		super(Equality.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {1, 0, 0, 1};
		return values;
	}

}
