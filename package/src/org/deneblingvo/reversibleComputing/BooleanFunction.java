/**
 * Булева функция
 */
package org.deneblingvo.reversibleComputing;

/**
 * @author alex
 * Булева функция
 */
public interface BooleanFunction {

	/**
	 * Возвращает количество входов
	 * @return Количество входов
	 */
	public int getInputCount();

	/**
	 * Возвращает количество выходов
	 * @return Количество выходов
	 */
	public int getOutputCount();

	/**
	 * Вычисляет функцию
	 * @param inputs Состояние входов
	 * @return Состояние выходов
	 */
	public BooleanValue[] calculate(BooleanValue[] inputs); 

}
