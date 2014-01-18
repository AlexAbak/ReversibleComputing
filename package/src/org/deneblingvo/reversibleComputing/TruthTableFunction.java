/**
 * 
 */
package org.deneblingvo.reversibleComputing;

/**
 * @author alex
 *
 */
public class TruthTableFunction implements BooleanFunction {

	/**
	 * Конструктор
	 */
	public TruthTableFunction(TruthTable truthTable) {
		this.truthTable = truthTable;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return this.getInputCount();
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		return this.getOutputCount();
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.reversibleComputing.BooleanFunction#calculate(org.deneblingvo.reversibleComputing.BooleanValue[])
	 */
	@Override
	public BooleanValue[] calculate(BooleanValue[] inputs) {
		return this.truthTable.calculate(inputs);
	}

	private TruthTable truthTable;

	/**
	 * Конъюнкция
	 * @return
	 */
	static TruthTableFunction conjunction () {
		int[] values = {0, 0, 0, 1};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Дизъюнкция
	 * @return
	 */
	static TruthTableFunction disjunction () {
		int[] values = {0, 1, 1, 1};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Исключающее или
	 * @return
	 */
	static TruthTableFunction exclusiveOr () {
		int[] values = {0, 1, 1, 0};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Импликация
	 * @return
	 */
	static TruthTableFunction consequence () {
		int[] values = {1, 1, 0, 1};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Эквиваленция
	 * @return
	 */
	static TruthTableFunction equality () {
		int[] values = {1, 0, 0, 1};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Штрих Шеффера
	 * @return
	 */
	static TruthTableFunction shefferStroke () {
		int[] values = {1, 1, 1, 0};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Стрелка Пирса
	 * @return
	 */
	static TruthTableFunction peirceArrow () {
		int[] values = {1, 1, 1, 0};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Отрицание
	 * @return
	 */
	static TruthTableFunction not () {
		int[] values = {1, 0};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Дублирование
	 * @return
	 */
	static TruthTableFunction duplication () {
		int[] values = {0, 1};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Элемент Тоффоли
	 * @return
	 */
	static TruthTableFunction toffoli () {
		int[] values = {0, 1, 2, 3, 4, 5, 7, 6};
		return new TruthTableFunction(new TruthTable(values));
	}

	/**
	 * Элемент Фредкина
	 * @return
	 */
	static TruthTableFunction fredkin () {
		int[] values = {0, 1, 2, 3, 4, 6, 5, 7};
		return new TruthTableFunction(new TruthTable(values));
	}

}