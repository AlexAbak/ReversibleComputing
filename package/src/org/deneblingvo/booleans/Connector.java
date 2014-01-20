/**
 * Соединитель
 */
package org.deneblingvo.booleans;

import org.deneblingvo.utils.ArrayMath;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Соединитель
 */
public final class Connector implements BooleanFunction {
	
	/**
	 * Конструктор
	 * @param inputs Список номеров входов которые передают сигнал на соответствующий выход
	 */
	public Connector (int[] numbers) {
		this.numbers = numbers;
	}
	
	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount () {
		return ArrayMath.max(this.numbers) + 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount () {
		return this.numbers.length;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate (BooleanValues inputs) throws CalculateException {
		BooleanValue[] inputValues = inputs.getValues();
		BooleanValue[] outputValues = new BooleanValue[this.numbers.length];
		for (int i = 0; i < this.numbers.length; i++) {
			outputValues[i] = inputValues[this.numbers[i]];
		}
		return new BooleanValues(outputValues);
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#paint(void)
	 */
	@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {

	}

	private int[] numbers;

}
