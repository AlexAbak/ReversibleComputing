/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.booleans.WrongIOCount;
import org.deneblingvo.booleans.compute.ComputeException;
import org.deneblingvo.booleans.compute.Computable;
import org.deneblingvo.booleans.core.Values;

/**
 * @author alex
 *
 */
public final class TruthTableCompute implements Computable {

	/**
	 * 
	 */
	public TruthTableCompute(TruthTable truthTable) {
		this.truthTable = truthTable;
	}

	@Override
	public Class<?> aspect() {
		return Computable.class;
	}

	@Override
	public Values compute(Values inputs) throws ComputeException {
		if (this.truthTable.getInputCount() != inputs.getCount()) {
			throw new WrongIOCount(this.truthTable.getInputCount(), inputs.getCount());
		}
		int index = inputs.getValue();
		int[] values = this.truthTable.getValues();
		int value = values[index]; 
		Values outputs = new Values(value, this.truthTable.getOutputCount());
		return outputs;
	}

	private TruthTable truthTable;

}
