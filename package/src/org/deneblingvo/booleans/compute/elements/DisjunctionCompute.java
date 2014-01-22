/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.compute.Computable;
import org.deneblingvo.booleans.compute.ComputeException;
import org.deneblingvo.booleans.core.Value;
import org.deneblingvo.booleans.core.Values;

/**
 * @author alex
 *
 */
public final class DisjunctionCompute implements Computable {

	@Override
	public Class<?> aspect() {
		return Computable.class;
	}

	@Override
	public Values compute(Values inputs) throws ComputeException {
		for (Value value : inputs.getValues()) {
			if (value == Value.TRUE) {
				Value[] outputValues = {Value.TRUE};
				Values outputs = new Values(outputValues);
				return outputs;
			}
		}
		Value[] outputValues = {Value.FALSE};
		Values outputs = new Values(outputValues);
		return outputs;
	}

}
