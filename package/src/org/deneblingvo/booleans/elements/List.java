/**
 * Список булевых функций
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.mixin.Cocktail;
import org.deneblingvo.mixin.Mixer;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Список булевых функций
 */
public class List extends Cocktail implements Function {

	/**
	 * Конструктор
	 * @param functions Список функций
	 */
	public List(Function[] functions) {
		this.functions = functions;
	}

	@Override
	public int getInputCount() {
		int count = 0;
		for (Function function : this.functions) {
			count = count + function.getInputCount();
		}
		return count;
	}

	@Override
	public int getOutputCount() {
		int count = 0;
		for (Function function : this.functions) {
			count = count + function.getOutputCount();
		}
		return count;
	}

	@Override
	public void mix(Mixer mixer) {
		for (Function function : this.functions) {
			mixer.mix(function);
		}
	}

	public Function[] getFunctions() {
		return this.functions;
	}

	/**
	 * Список функций
	 */
	private Function[] functions;
}
