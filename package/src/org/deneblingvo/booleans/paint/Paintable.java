/**
 * Интерфейс рисуемой функции
 */
package org.deneblingvo.booleans.paint;

import org.deneblingvo.mixin.Mixinable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Интерфейс рисуемой функции
 */
public interface Paintable extends Mixinable {

	/**
	 * Определение спрайтов
	 * @param image Изображение на которое происходит вывод
	 */
	public void sprites (Imagable image);

	/**
	 * Отрисовка изображения
	 * @param image Изображение на которое происходит вывод
	 * @param x Горизонтальная координата
	 * @param y Вертикальная координата
	 */
	public void paint (Imagable image, int x, int y);

	/**
	 * Получить ширину элемента
	 * @return Ширина элемента
	 */
	public int getWidth();

	/**
	 * Получить высоту элемента
	 * @return Высота элемента
	 */
	public int getHeight();

}
