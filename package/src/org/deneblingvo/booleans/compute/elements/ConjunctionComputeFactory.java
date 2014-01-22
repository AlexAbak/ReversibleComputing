/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.mixin.Cocktailable;
import org.deneblingvo.mixin.Mixinable;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class ConjunctionComputeFactory extends MixinableFactory {

	@Override
	public boolean isCoctail(Cocktailable cocktailable) {
		return cocktailable.getClass() == Conjunction.class;
	}

	@Override
	public Mixinable newMixin(Cocktailable cocktailable) {
		return new ConjunctionCompute();
	}

}
