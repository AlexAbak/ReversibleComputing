/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.elements.Equality;
import org.deneblingvo.mixin.Cocktailable;
import org.deneblingvo.mixin.Mixinable;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class EqualityPaintFactory extends MixinableFactory {

	@Override
	public boolean isCoctail(Cocktailable cocktailable) {
		return cocktailable.getClass() == Equality.class;
	}

	@Override
	public Mixinable newMixin(Cocktailable cocktailable) {
		return new EqualityPaint((Equality)cocktailable);
	}

}
