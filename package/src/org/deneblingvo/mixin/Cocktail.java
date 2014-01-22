/**
 * 
 */
package org.deneblingvo.mixin;

import java.util.Vector;

/**
 * @author alex
 *
 */
public class Cocktail implements Cocktailable {

	/**
	 * 
	 */
	public Cocktail() {
		this.mixinables = new Vector<Mixinable>();
	}

	@Override
	public void addMixin(Mixinable mixinable) {
		mixinables.add(mixinable);
	}

	@Override
	public Mixinable getMixin(Class<?> aspect) {
		for (Mixinable mixinable : this.mixinables) {
			if (mixinable.aspect() == aspect) {
				return mixinable;
			}
		}
		return null;
	}

	@Override
	public void mix(Mixer mixer) {
	}

	private Vector<Mixinable> mixinables;

}
