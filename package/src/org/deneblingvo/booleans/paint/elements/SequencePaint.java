/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.elements.Sequence;
import org.deneblingvo.booleans.paint.Imagable;
import org.deneblingvo.booleans.paint.Paintable;

/**
 * @author alex
 *
 */
public final class SequencePaint implements Paintable {

	/**
	 * 
	 */
	public SequencePaint(Sequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public Class<?> aspect() {
		return Paintable.class;
	}

	@Override
	public void sprites(Imagable image) {
		for (Function function : this.sequence.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			paintable.sprites(image);
		}
	}

	@Override
	public void paint(Imagable image, int x, int y) {
		for (Function function : this.sequence.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			paintable.paint(image, x, y);
			x = x + paintable.getWidth() * image.getCellWidth();
		}
	}

	@Override
	public int getWidth() {
		int width = 0;
		for (Function function : this.sequence.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			width = width + paintable.getWidth();
		}
		return width;
	}

	@Override
	public int getHeight() {
		int height = 0;
		for (Function function : this.sequence.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			if (paintable.getHeight() > height) {
				height = paintable.getHeight();
			}
		}
		return height;
	}

	private Sequence sequence;

}
