/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.elements.Sequence;
import org.deneblingvo.mixin.Cocktailable;
import org.deneblingvo.mixin.Mixinable;
import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class SequencePaintFactory extends MixinableFactory {

	@Override
	public boolean isCoctail(Cocktailable cocktailable) {
		return cocktailable.getClass() == Sequence.class;
	}

	@Override
	public Mixinable newMixin(Cocktailable cocktailable) {
		return new SequencePaint((Sequence)cocktailable);
	}

}
