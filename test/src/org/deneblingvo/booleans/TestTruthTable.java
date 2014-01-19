/**
 * Тестовая таблица истинности
 */
package org.deneblingvo.booleans;

/**
 * @author alex
 * Тестовая таблица истинности
 */
public final class TestTruthTable extends TruthTable {

	/**
	 * Конструктор
	 */
	public TestTruthTable() {
		super(TestTruthTable.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {7, 0, 6, 1, 5, 2, 4, 3};
		return values;
	}

}
