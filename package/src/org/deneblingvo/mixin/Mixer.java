/**
 * 
 */
package org.deneblingvo.mixin;

/**
 * @author alex
 *
 */
public final class Mixer {

	public Mixer(MixinableFactory[] factories) {
		this.factories = factories;
	}
	
	public Mixer(MixinableFactory[][] factoriesList) {
		int count = 0;
		for (MixinableFactory[] item : factoriesList) {
			count = count + item.length;
		}
		MixinableFactory[] factories = new MixinableFactory[count];
		int i = 0;
		for (MixinableFactory[] item : factoriesList) {
			for (MixinableFactory factory : item) {
				factories[i] = factory;
				i++;
			}
		}
		this.factories = factories;
	}
	
	public void mix(Cocktailable cocktailable) {
		for (MixinableFactory factory : this.factories) {
			if (factory.isCoctail(cocktailable)) {
				cocktailable.addMixin(factory.newMixin(cocktailable));
			}
		}
		cocktailable.mix(this);
	}

	private MixinableFactory[] factories;

}
