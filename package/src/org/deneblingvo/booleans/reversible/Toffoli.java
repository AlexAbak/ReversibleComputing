/**
 * Элемент Тоффоли
 */
package org.deneblingvo.booleans.reversible;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Элемент Тоффоли
 */
public final class Toffoli extends TruthTable {

	/**
	 * Конструктор
	 */
	public Toffoli() {
		super(Toffoli.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 2, 3, 4, 5, 7, 6};
		return values;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		if (!Image.containsDef(defs, getClass().getCanonicalName())) {
			Element g = Image.g(defs.getOwnerDocument(), getClass().getCanonicalName());
			defs.appendChild(g);
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight / 2, elementWidth, elementHeight / 2));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight + (elementHeight / 2), elementWidth, elementHeight + (elementHeight / 2)));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, (2 * elementHeight) + (elementHeight / 2), elementWidth, (2 * elementHeight) + (elementHeight / 2)));
			g.appendChild(Image.blackCircle(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 16));
			g.appendChild(Image.blackCircle(defs.getOwnerDocument(), elementWidth / 2, elementHeight + (elementHeight / 2), elementHeight / 16));
			g.appendChild(Image.circle(defs.getOwnerDocument(), elementWidth / 2, (2 * elementHeight) + (elementHeight / 2), elementHeight / 16));
		}

	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#paint(void)
	 */
	@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {
		svg.appendChild(Image.use(svg.getOwnerDocument(), getClass().getCanonicalName(), x, y));
	}

}
