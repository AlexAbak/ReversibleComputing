/**
 * Тождественный ноль
 */
package org.deneblingvo.booleans.nullary;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.BooleanValue;
import org.deneblingvo.booleans.BooleanValues;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Тождественный ноль
 */
public final class LogicalFalse implements BooleanFunction {

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) {
		BooleanValue[] outputs = {BooleanValue.FALSE};		
		return new BooleanValues(outputs);
	}

}
