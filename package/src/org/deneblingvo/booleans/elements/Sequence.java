/**
 * Комплексный элемент
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.WrongIOCount;
import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.mixin.Cocktail;
import org.deneblingvo.mixin.Mixer;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Комплексный элемент
 */
public class Sequence extends Cocktail implements Function {

	/**
	 * Конструктор
	 * @param functions Последовательность функций
	 * @throws WrongIOCount
	 */
	public Sequence (Function[] functions) throws WrongIOCount {
		Sequence.Check(functions); 
		this.functions = functions; 
	}

	@Override
	public int getInputCount () {
		return this.functions[0].getInputCount();
	}

	@Override
	public int getOutputCount () {
		return this.functions[this.functions.length - 1].getOutputCount();
	}

	/**
	 * Проверка допустимости последовательности функций
	 * @param functions Последовательность функций
	 * @throws WrongIOCount Несовпадение входных и выходных параметров
	 */
	static private void Check (Function[] functions) throws WrongIOCount {
		for (int i = 1; i < functions.length; i++) {
			Function prev = functions[i - 1];
			Function next = functions[i];
			if (next.getInputCount() != prev.getOutputCount()) {
				throw new WrongIOCount(next.getInputCount(), prev.getOutputCount());
			}
		}
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
	 * Последовательность функций
	 */
	private Function[] functions;

}
