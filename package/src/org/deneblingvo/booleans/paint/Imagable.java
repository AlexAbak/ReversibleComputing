/**
 * Интерфейс изображений 
 */
package org.deneblingvo.booleans.paint;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Интерфейс изображений
 */
public interface Imagable extends Drawable {

	public boolean hasSprite(String spriteName);

	public Spritable newSprite(String spriteName);

	public int getCellWidth();

	public int getCellHeight();

	public void sprite(String spriteName, int x, int y);

}
