/**
 * 
 */
package org.deneblingvo.booleans.paint;

/**
 * @author alex
 *
 */
public final class ImageUtil {

	/**
	 * 
	 */
	public ImageUtil(Imagable imagable) {
		this.imagable = imagable;
	}

	public int line() {
		return this.imagable.getCellHeight() / 2;
	}

	public int center() {
		return this.imagable.getCellWidth() / 2;
	}

	public int small() {
		return this.imagable.getCellHeight() / 4;
	}

	public int top() {
		return 7;
	}

	public int left() {
		return 12;
	}

	public int right() {
		return this.imagable.getCellWidth() - 12;
	}

	public int width() {
		return this.imagable.getCellWidth() - 24;
	}

	public int bottom(int height) {
		return (height * this.imagable.getCellHeight()) - 7;
	}

	public int height(int height) {
		return (height * this.imagable.getCellHeight()) - 14;
	}

	private Imagable imagable;

}
