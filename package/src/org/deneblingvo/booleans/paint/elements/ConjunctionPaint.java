/**
 * Конъюнкция
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.booleans.paint.Imagable;
import org.deneblingvo.booleans.paint.ImageUtil;
import org.deneblingvo.booleans.paint.Paintable;
import org.deneblingvo.booleans.paint.Spritable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Конъюнкция
 */
public final class ConjunctionPaint implements Paintable {

	/**
	 * Конструктор
	 * @param conjunction Конъюнкция
	 */
	public ConjunctionPaint (Conjunction conjunction) {
		this.conjunction = conjunction;
	}

	@Override
	public Class<?> aspect() {
		return Paintable.class;
	}

	@Override
	public void sprites(Imagable image) {
		if (!image.hasSprite(this.getKindName())) {
			ImageUtil util = new ImageUtil(image);
			Spritable sprite = image.newSprite(this.getKindName());
			sprite.rect(util.left(), util.top(), util.width(), util.height(this.conjunction.getInputCount()));
			sprite.text(util.center(), util.line(), util.small(), "&");
			sprite.line(util.right(), util.line(), image.getCellWidth(), util.line());
			for (int i = 0; i < this.conjunction.getInputCount(); i++) {
				int line = i * image.getCellHeight() + util.line();
				sprite.line(0, line, util.left(), line);
			}
		}
	}

	@Override
	public void paint(Imagable image, int x, int y) {
		image.sprite(this.getKindName(), x, y);
	}

	@Override
	public int getWidth() {
		return 1;
	}

	@Override
	public int getHeight() {
		return this.conjunction.getInputCount();
	}

	private String getKindName () {
		Integer count = this.conjunction.getInputCount();
		return "Conjunction" + count.toString();
	}

	private Conjunction conjunction;

}
