/**
 * Исключение при вычислении выражения
 */
package org.deneblingvo.booleans;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Исключение при вычислении выражения
 */
public class CalculateException extends Exception {

	/**
	 * Серийный номер версии
	 */
	private static final long serialVersionUID = -8391096109908898461L;

	/**
	 * Конструктор
	 * @param message Сообщение 
	 */
	public CalculateException(String message) {
		super(message);
	}

}
