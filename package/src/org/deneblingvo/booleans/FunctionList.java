/**
 * 
 */
package org.deneblingvo.booleans;

/**
 * @author alex
 *
 */
public class FunctionList implements BooleanFunction {

	/**
	 * Конструктор
	 * @param functions Список функций
	 */
	public FunctionList(BooleanFunction[] functions) {
		this.functions = functions;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		int count = 0;
		for (BooleanFunction function : this.functions) {
			count = count + function.getInputCount();
		}
		return count;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		int count = 0;
		for (BooleanFunction function : this.functions) {
			count = count + function.getOutputCount();
		}
		return count;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) throws CalculateException {
		BooleanValues outputs = new BooleanValues(0, 0);
		for (BooleanFunction function : this.functions) {
			BooleanValues[] values = inputs.extractValues(function.getInputCount());
			inputs = values[1];
			BooleanValues output = function.calculate(values[0]);
			outputs = BooleanValues.concat(outputs, output);
		}
		return outputs;
	}

	/**
	 * Список функций
	 */
	private BooleanFunction[] functions;
}
