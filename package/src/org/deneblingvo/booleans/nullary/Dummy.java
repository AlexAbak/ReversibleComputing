/**
 * Заглушка теряющая информацию
 */
package org.deneblingvo.booleans.nullary;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.BooleanValue;
import org.deneblingvo.booleans.BooleanValues;
import org.deneblingvo.booleans.CalculateException;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Заглушка теряющая информацию
 */
public final class Dummy implements BooleanFunction {

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) throws CalculateException {
		BooleanValue[] values = {};
		return new BooleanValues(values);
	}

}
