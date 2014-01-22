/**
 * 
 */
package org.deneblingvo.booleans.paint.svg;

import org.deneblingvo.booleans.paint.Drawable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author alex
 *
 */
public class SvgDraw implements Drawable {

	/**
	 * 
	 */
	public SvgDraw(Element element) {
		this.element = element;
	}

	@Override
	public void text(int x, int y, int size, String value) {
		Element text = this.document().createElementNS(Svg.NS, "text");
		text.setAttribute("x", Integer.toString(x));
		text.setAttribute("y", Integer.toString(y));
		text.setAttribute("font-family", "Arial");
		text.setAttribute("fill", "black");
		text.setAttribute("font-size", Integer.toString(size));
		text.setTextContent(value);
		this.element.appendChild(text);
	}

	@Override
	public void rect(int x, int y, int width, int height) {
		Element rect = this.document().createElementNS(Svg.NS, "rect");
		rect.setAttribute("x", Integer.toString(x));
		rect.setAttribute("y", Integer.toString(y));
		rect.setAttribute("width", Integer.toString(width));
		rect.setAttribute("height", Integer.toString(height));
		rect.setAttribute("fill", "white");
		rect.setAttribute("stroke", "black");
		rect.setAttribute("stroke-width", "1");
		this.element.appendChild(rect);
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.paint.Drawable#line(int, int, int, int)
	 */
	@Override
	public void line(int x1, int y1, int x2, int y2) {
		Element line = this.document().createElementNS(Svg.NS, "line");
		line.setAttribute("x1", Integer.toString(x1));
		line.setAttribute("y1", Integer.toString(y1));
		line.setAttribute("x2", Integer.toString(x2));
		line.setAttribute("y2", Integer.toString(y2));
		line.setAttribute("stroke", "black");
		line.setAttribute("stroke-width", "1");
		this.element.appendChild(line);
	}

	protected Document document() {
		return this.element.getOwnerDocument();
	}

	protected Element element;

}
