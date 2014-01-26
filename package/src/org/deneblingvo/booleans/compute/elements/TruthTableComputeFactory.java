/**
 * 
 */
package org.deneblingvo.booleans.compute.elements;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.mixin.Cocktailable;
import org.deneblingvo.mixin.Mixinable;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class TruthTableComputeFactory extends MixinableFactory {

	@Override
	public boolean isCoctail(Cocktailable cocktailable) {
		return cocktailable.getClass().isAssignableFrom(TruthTable.class); 
	}

	@Override
	public Mixinable newMixin(Cocktailable cocktailable) {
		return new TruthTableCompute((TruthTable)cocktailable);
	}

}
