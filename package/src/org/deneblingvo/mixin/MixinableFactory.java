/**
 * 
 */
package org.deneblingvo.mixin;

/**
 * @author alex
 *
 */
public abstract class MixinableFactory {

	/**
	 * 
	 */
	public MixinableFactory() {
		// TODO Auto-generated constructor stub
	}

	abstract public boolean isCoctail(Cocktailable cocktailable); 

	abstract public Mixinable newMixin(Cocktailable cocktailable);
}
