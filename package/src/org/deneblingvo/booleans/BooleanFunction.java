/**
 * Булева функция
 */
package org.deneblingvo.booleans;

import org.w3c.dom.Element;


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

	/**
	 * Инициализирует определения в svg
	 * @param defs Нода с определениями
	 * @param elementWidth Ширина единичного элемента
	 * @param elementHeight Высота единичного элемента
	 */
	public void initDefs(Element defs, int elementWidth, int elementHeight);

	/**
	 * Рисует на svg
	 * @param svg 
	 * @param x
	 * @param y
	 * @param elementWidth Ширина единичного элемента
	 * @param elementHeight Высота единичного элемента
	 */
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight);

}
