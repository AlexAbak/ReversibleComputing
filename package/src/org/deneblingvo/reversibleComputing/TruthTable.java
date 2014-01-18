/**
 * Таблица истинности
 */
package org.deneblingvo.reversibleComputing;

import java.lang.Math;

/**
 * @author alex
 * Таблица истинности
 */
public class TruthTable {

	/**
	 * Конструктор
	 * @param values Значения таблицы истинности
	 */
	public TruthTable(int[] values) {
		this.values = values;
	}

	public int getInputCount() {
		return TruthTable.lg(this.values.length);
	}

	public int getOutputCount() {
		return TruthTable.lg(TruthTable.max(this.values));
	}

	public BooleanValue[] calculate(BooleanValue[] inputs) {
		int index = TruthTable.indexFromInputs(inputs);
		int value = this.values[index]; 
		BooleanValue[] outputs = TruthTable.outputsFromValue(value, this.getOutputCount());
		return outputs;
	} 

	private int[] values;

	static public int lg (int value) {
		return (int) Math.floor(Math.log(value) / Math.log(2)); 
	}

	static public int max (int[] values) {
		int value = values[0];
		for (int i = 1; i < values.length; i++) {
			value = Math.max(value, i);
		}
		return value;
	}

	static public int indexFromInputs (BooleanValue[] inputs) {
		int index = 0;
		for (int i = inputs.length - 1; i >= 0; i--) {
			index = index << 1;
			if (inputs[i] == BooleanValue.TRUE) {
				index = index + 1;
			} else {
				index = index + 0;
			}
		}
		return index;
	}

	static public BooleanValue[] outputsFromValue (int value, int count) {
		BooleanValue[] outputs = new BooleanValue[count];
		for (int i = outputs.length - 1; i >= 0; i--) {
			if ((value & 1) == 1) {
				outputs[i] = BooleanValue.TRUE;
			} else {
				outputs[i] = BooleanValue.FALSE;
			}
			value = value >> 1;
		}
		return outputs;
	}

}
