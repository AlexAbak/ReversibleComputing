/**
 * Стрелка Пирса
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 * Стрелка Пирса
 */
public final class PeirceArrow extends TruthTable {

	/**
	 * Конструктор
	 */
	public PeirceArrow() {
		super(PeirceArrow.getTruthTableValues());
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
