/**
 * Неверное количество входов / выходов
 */
package org.deneblingvo.booleans;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Неверное количество входов / выходов
 */
public class WrongIOCount extends CalculateException {

	/**
	 * Серийный номер версии
	 */
	private static final long serialVersionUID = -634733767873066029L;

	/**
	 * 
	 * @param expected
	 * @param actual
	 */
	public WrongIOCount(int expected, int actual) {
		super(WrongIOCount.CreateMessage(expected, actual));
		this.expected = expected;
		this.actual = actual;
	}

	public int getExpected () {
		return this.expected;
	}

	public int getActual () {
		return this.actual;
	}

	private int expected;

	private int actual;

	static private String CreateMessage (int expected, int actual) {
		return String.format("Неверное количество входов / выходов. Ожидалось %s, найдено %d.", expected, actual);
	}
}
