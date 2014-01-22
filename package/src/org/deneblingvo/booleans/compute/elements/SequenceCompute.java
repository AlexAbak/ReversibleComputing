/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.compute.Computable;
import org.deneblingvo.booleans.compute.ComputeException;
import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.core.Values;
import org.deneblingvo.booleans.elements.Sequence;

/**
 * @author alex
 *
 */
public final class SequenceCompute implements Computable {

	/**
	 * 
	 */
	public SequenceCompute(Sequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public Class<?> aspect() {
		return Computable.class;
	}

	@Override
	public Values compute(Values inputs) throws ComputeException {
		for (Function function : this.sequence.getFunctions()) {
			Computable computable = (Computable)function.getMixin(Computable.class);
			inputs = computable.compute(inputs);
		}
		return inputs;
	}

	private Sequence sequence;

}
