/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.mixin.MixinableFactory;

/**
 * @author alex
 *
 */
public final class PaintElements {

	static public MixinableFactory[] elements() {
		MixinableFactory[] factories = {
				new ConjunctionPaintFactory(), 
				new DisjunctionPaintFactory(),
				new ListPaintFactory(),
				new SequencePaintFactory(),
				new EqualityPaintFactory()
		};
		return factories;
	}

}
