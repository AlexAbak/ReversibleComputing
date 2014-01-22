/**
 * Интерфейс вычисляемой булевой функции
 */
package org.deneblingvo.booleans.compute;

import org.deneblingvo.booleans.core.Values;
import org.deneblingvo.mixin.Mixinable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Интерфейс вычисляемой булевой функции
 */
public interface Computable extends Mixinable {

	public Values compute(Values inputs) throws ComputeException;

}
