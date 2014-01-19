/**
 * Конъюнкция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 * Конъюнкция
 */
public final class Conjunction extends TruthTable {

	/**
	 * Конструктор
	 */
	public Conjunction() {
		super(Conjunction.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 0, 0, 1};
		return values;
	}

}