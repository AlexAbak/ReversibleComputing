/**
 * Тождественная единица
 */
package org.deneblingvo.booleans.nullary;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.BooleanValue;
import org.deneblingvo.booleans.BooleanValues;

/**
 * @author alex
 * Тождественная единица
 */
public final class LogicalTrue implements BooleanFunction {

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
		BooleanValue[] outputs = {BooleanValue.TRUE};		
		return new BooleanValues(outputs);
	}

}
