/**
 * Булева функция выраженная через таблицу истинности
 */
package org.deneblingvo.booleans;

import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.core.BooleanMath;
import org.deneblingvo.utils.ArrayMath;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Булева функция выраженная через таблицу истинности
 */
public abstract class TruthTable implements Function {

	/**
	 * Конструктор
	 * @param values Значения таблицы истинности
	 */
	protected TruthTable(int[] values) {
		this.values = values;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return BooleanMath.lg(this.values.length);
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		int max = ArrayMath.max(this.values);
		return BooleanMath.lg(max) + 1;
	}

	/**
	 * Возвращает значения таблицы истинности
	 * @return Значения таблицы истинности
	 */
	public int[] getValues () {
		return this.values;
	}

	/**
	 * Значения таблицы истинности
	 */
	private int[] values;

}
