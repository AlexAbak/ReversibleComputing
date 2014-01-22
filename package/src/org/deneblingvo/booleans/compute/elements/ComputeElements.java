/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.compute.elements.ConjunctionComputeFactory;
import org.deneblingvo.booleans.compute.elements.DisjunctionComputeFactory;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class ComputeElements {

	static public MixinableFactory[] elements() {
		MixinableFactory[] factories = {
				new ConjunctionComputeFactory(), 
				new DisjunctionComputeFactory(),
				new ListComputeFactory(),
				new SequenceComputeFactory()
		};
		return factories;
	}

}
