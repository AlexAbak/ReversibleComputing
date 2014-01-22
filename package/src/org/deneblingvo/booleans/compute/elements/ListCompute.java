/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.compute.Computable;
import org.deneblingvo.booleans.compute.ComputeException;
import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.core.Values;
import org.deneblingvo.booleans.elements.List;

/**
 * @author alex
 *
 */
public final class ListCompute implements Computable {

	/**
	 * 
	 */
	public ListCompute(List list) {
		this.list = list;
	}

	@Override
	public Class<?> aspect() {
		return Computable.class;
	}

	@Override
	public Values compute(Values inputs) throws ComputeException {
		Values outputs = new Values(0, 0);
		for (Function function : this.list.getFunctions()) {
			Computable computable = (Computable)function.getMixin(Computable.class);
			Values[] values = inputs.extractValues(function.getInputCount());
			inputs = values[1];
			Values output = computable.compute(values[0]);
			outputs = Values.concat(outputs, output);			
		}
		return outputs;
	}

	private List list;

}
