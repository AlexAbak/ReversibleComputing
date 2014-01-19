/**
 * Отрицание через элемент Тоффоли
 */
package org.deneblingvo.booleans.reversible.toffoli;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.FunctionList;
import org.deneblingvo.booleans.FunctionSequence;
import org.deneblingvo.booleans.WrongIOCount;
import org.deneblingvo.booleans.nullary.Dummy;
import org.deneblingvo.booleans.nullary.LogicalTrue;
import org.deneblingvo.booleans.reversible.Toffoli;
import org.deneblingvo.booleans.unary.Duplication;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Отрицание через элемент Тоффоли
 */
public final class Negative extends FunctionSequence {

	/**
	 * @param functions
	 * @throws WrongIOCount
	 */
	public Negative() throws WrongIOCount {
		super(Negative.getFunctions());
	}

	static private BooleanFunction[] getFunctions () {
		BooleanFunction[] inputs = {new LogicalTrue(), new LogicalTrue(), new Duplication()};
		BooleanFunction[] outputs = {new Dummy(), new Dummy(), new Duplication()};
		BooleanFunction[] functions = {new FunctionList(inputs), new Toffoli(), new FunctionList(outputs)};
		return functions;
	}
}
