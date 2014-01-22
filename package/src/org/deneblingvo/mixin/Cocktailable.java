/**
 * 
 */
package org.deneblingvo.mixin;

/**
 * @author alex
 *
 */
public interface Cocktailable {

	public void addMixin(Mixinable mixinable);

	public Mixinable getMixin(Class<?> aspect);

	public void mix(Mixer mixer);

}
