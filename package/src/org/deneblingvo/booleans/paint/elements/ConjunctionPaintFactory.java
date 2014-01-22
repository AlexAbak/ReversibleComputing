/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.mixin.Cocktailable;
import org.deneblingvo.mixin.Mixinable;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class ConjunctionPaintFactory extends MixinableFactory {

	@Override
	public boolean isCoctail(Cocktailable cocktailable) {
		return cocktailable.getClass() == Conjunction.class;
	}

	@Override
	public Mixinable newMixin(Cocktailable cocktailable) {
		Conjunction conjunction = (Conjunction)cocktailable;
		return new ConjunctionPaint(conjunction);
	}

}
