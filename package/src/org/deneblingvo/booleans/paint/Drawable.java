/**
 * Рисуемое
 */
package org.deneblingvo.booleans.paint;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Рисуемое
 */
public interface Drawable {

	public void text (int x, int y, int size, String value);

	public void rect(int x, int y, int width, int height);

	public void line(int x1, int y1, int x2, int y2);

}
