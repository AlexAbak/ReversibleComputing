/**
 * Дизъюнкция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 *	Дизъюнкция
 */
public final class Disjunction extends TruthTable {

	/**
	 * Конструктор
	 */
	public Disjunction() {
		super(Disjunction.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 1, 1};
		return values;
	}

}
