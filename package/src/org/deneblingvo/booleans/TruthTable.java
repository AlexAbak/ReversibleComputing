/**
 * Булева функция выраженная через таблицу истинности
 */
package org.deneblingvo.booleans;

import org.deneblingvo.utils.ArrayMath;

/**
 * @author alex
 * Булева функция выраженная через таблицу истинности
 */
public abstract class TruthTable implements BooleanFunction {

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
		return BooleanMath.lg(ArrayMath.max(this.values)) + 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#calculate(org.deneblingvo.reversibleComputing.BooleanValue[])
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) {
		int index = inputs.getValue();
		int value = this.values[index]; 
		BooleanValues outputs = new BooleanValues(value, this.getOutputCount());
		return outputs;
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
