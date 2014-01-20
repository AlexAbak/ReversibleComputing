/**
 * Комплексный элемент
 */
package org.deneblingvo.booleans;

import org.w3c.dom.Element;

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

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		for (BooleanFunction function : this.functions) {
			function.initDefs(defs, elementWidth, elementHeight);
		}
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#paint(void)
	 */
	@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {
		for (BooleanFunction function : this.functions) {
			function.paint(svg, x, y, elementWidth, elementHeight);
			x = x + elementWidth;
		}
	}

	/**
	 * Последовательность функций
	 */
	private BooleanFunction[] functions;

}
