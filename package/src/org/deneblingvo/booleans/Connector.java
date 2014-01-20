/**
 * Соединитель
 */
package org.deneblingvo.booleans;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Соединитель
 */
public final class Connector implements BooleanFunction {
	
	/**
	 * Конструктор
	 * @param inputs Список номеров входов которые передают сигнал на соответствующий выход
	 */
	public Connector (int[] inputs) {
		this.inputs = inputs;
	}
	
	private int[] inputs;

}
