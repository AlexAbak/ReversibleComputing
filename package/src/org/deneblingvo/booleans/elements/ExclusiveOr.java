/**
 * Импликация
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Импликация
 */
public final class ExclusiveOr extends TruthTable {

	/**
	 * Конструктор
	 */
	public ExclusiveOr() {
		super(ExclusiveOr.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 1, 0};
		return values;
	}

}
