/**
 * Отрицание
 */
package org.deneblingvo.booleans.unary;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Отрицание
 */
public final class Negative extends TruthTable {

	/**
	 * Конструктор
	 */
	public Negative () {
		super(Negative.getTruthTableValues());
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		if (!Image.containsDef(defs, getClass().getCanonicalName())) {
			Element g = Image.g(defs.getOwnerDocument(), getClass().getCanonicalName());
			defs.appendChild(g);
			g.appendChild(Image.text(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 4, "not"));
			g.appendChild(Image.rect(defs.getOwnerDocument(), 12, 7, elementWidth - 24, elementHeight - 14));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight / 2, 12, elementHeight / 2));
			g.appendChild(Image.line(defs.getOwnerDocument(), elementWidth - 12, elementHeight / 2, elementWidth, elementHeight / 2));
			g.appendChild(Image.circle(defs.getOwnerDocument(), elementWidth - 12, elementHeight / 2, elementHeight / 16));
		}

	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#paint(void)
	 */
	@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {
		svg.appendChild(Image.use(svg.getOwnerDocument(), getClass().getCanonicalName(), x, y));
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {1, 0};
		return values;
	}

}
