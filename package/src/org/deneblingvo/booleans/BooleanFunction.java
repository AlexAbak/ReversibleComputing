/**
 * Булева функция
 */
package org.deneblingvo.booleans;


/**
 * @author Алексей Кляузер <drum@pisem.net>
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
	 * @throws CalculateException При ошибке вычисления
	 */
	public BooleanValues calculate(BooleanValues inputs) throws CalculateException; 

}
