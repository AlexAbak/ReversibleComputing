/**
 * 
 */
package org.deneblingvo.booleans.paint.elements;

import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.elements.List;
import org.deneblingvo.booleans.paint.Imagable;
import org.deneblingvo.booleans.paint.Paintable;

/**
 * @author alex
 *
 */
public final class ListPaint implements Paintable {

	/**
	 * 
	 */
	public ListPaint(List list) {
		this.list = list;
	}

	@Override
	public Class<?> aspect() {
		return Paintable.class;
	}

	@Override
	public void sprites(Imagable image) {
		for (Function function : this.list.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			paintable.sprites(image);
		}
	}

	@Override
	public void paint(Imagable image, int x, int y) {
		int cy = y;
		int cx = 0;
		for (Function function : this.list.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			paintable.paint(image, x, cy);
			cy = cy + paintable.getHeight() * image.getCellHeight();
			if (paintable.getWidth() > cx) {
				cx = paintable.getWidth();
			}
		}
		cx = cx * image.getCellWidth();
		cy = y;
		int ey = y + image.getCellHeight() / 2;
		int n = 0;
		for (Function function : this.list.getFunctions()) {
			int sy = cy + image.getCellHeight() / 2;
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			for (int i = 0; i < function.getOutputCount(); i++) {
				image.line(
					x + paintable.getWidth() * image.getCellWidth(), 
					sy,
					x + cx + n * image.getCellWidth() + image.getCellWidth() / 2,
					sy);
				image.line(
					x + cx + n * image.getCellWidth() + image.getCellWidth() / 2, 
					sy,
					x + cx + n * image.getCellWidth() + image.getCellWidth() / 2,
					ey);
				image.line(
					x + cx + n * image.getCellWidth() + image.getCellWidth() / 2, 
					ey,
					x + this.getWidth() * image.getCellWidth(),
					ey);
				if (sy != ey) {
					n++;
				}
				sy = sy + image.getCellHeight();
				ey = ey + image.getCellHeight();
			}
			cy = cy + paintable.getHeight() * image.getCellHeight();
		}
	}

	@Override
	public int getWidth() {
		int width = 1;
		for (Function function : this.list.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			if (paintable.getWidth() > width) {
				width = paintable.getWidth();
			}
		}
		int cy = 0;
		int ey = 0;
		for (Function function : this.list.getFunctions()) {
			int sy = cy;
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			for (int i = 0; i < function.getOutputCount(); i++) {
				if (sy != ey) {
					width++;
				}
				sy++;
				ey++;
			}
			cy = cy + paintable.getHeight();
		}
		return width;
	}

	@Override
	public int getHeight() {
		int height = 0;
		for (Function function : this.list.getFunctions()) {
			Paintable paintable = (Paintable)function.getMixin(Paintable.class);
			height = height + paintable.getHeight();
		}
		return height;
	}

	private List list;

}
