/**
 * Комплексный элемент
 */
package org.deneblingvo.booleans;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Комплексный элемент
 */
public class FunctionSequence implements BooleanFunction {

	/**
	 * Конструктор
	 * @param functions Последовательность функций
	 * @throws WrongIOCount
	 */
	public FunctionSequence (BooleanFunction[] functions) throws WrongIOCount {
		FunctionSequence.Check(functions); 
		this.functions = functions; 
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount () {
		return this.functions[0].getInputCount();
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount () {
		return this.functions[this.functions.length - 1].getOutputCount();
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate (BooleanValues inputs) throws CalculateException {
		for (BooleanFunction function : this.functions) {
			inputs = function.calculate(inputs);
		}
		return inputs;
	}

	/**
	 * Проверка допустимости последовательности функций
	 * @param functions Последовательность функций
	 * @throws WrongIOCount Несовпадение входных и выходных параметров
	 */
	static private void Check (BooleanFunction[] functions) throws WrongIOCount {
		for (int i = 1; i < functions.length - 1; i++) {
			BooleanFunction prev = functions[i - 1];
			BooleanFunction next = functions[i];
			if (next.getInputCount() != prev.getOutputCount()) {
				throw new WrongIOCount(next.getInputCount(), prev.getOutputCount());
			}
		}
	}

	/**
	 * Последовательность функций
	 */
	private BooleanFunction[] functions;

}
