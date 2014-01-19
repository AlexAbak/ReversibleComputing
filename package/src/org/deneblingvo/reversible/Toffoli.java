/**
 * Элемент Тоффоли
 */
package org.deneblingvo.reversible;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author alex
 * Элемент Тоффоли
 */
public final class Toffoli extends TruthTable {

	/**
	 * Конструктор
	 */
	public Toffoli() {
		super(Toffoli.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 2, 3, 4, 5, 7, 6};
		return values;
	}

}
