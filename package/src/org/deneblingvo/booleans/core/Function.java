/**
 * Булева функция
 */
package org.deneblingvo.booleans.core;

import org.deneblingvo.mixin.Cocktailable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Булева функция
 */
public interface Function extends Cocktailable {

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

}
