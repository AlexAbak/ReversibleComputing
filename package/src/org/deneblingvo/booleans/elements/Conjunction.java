/**
 * Конъюнкция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.mixin.Cocktail;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Конъюнкция
 */
public final class Conjunction extends Cocktail implements Function {

	/**
	 * Конструктор
	 */
	public Conjunction(int inputCount) {
		this.inputCount = inputCount;
	}

	@Override
	public int getInputCount() {
		return this.inputCount;
	}

	@Override
	public int getOutputCount() {
		return 1;
	}

	private int inputCount;

}