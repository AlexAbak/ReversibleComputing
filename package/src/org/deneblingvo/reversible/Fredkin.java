/**
 * Элемент Фредкина
 */
package org.deneblingvo.reversible;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 * Элемент Фредкина
 */
public final class Fredkin extends TruthTable {

	/**
	 * Конструктор
	 */
	public Fredkin() {
		super(Fredkin.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 2, 3, 4, 6, 5, 7};
		return values;
	}

}
