/**
 * Дизъюнкция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 *	Дизъюнкция
 */
public final class Disjunction extends TruthTable {

	/**
	 * Конструктор
	 */
	public Disjunction() {
		super(Disjunction.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1, 1, 1};
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
			g.appendChild(Image.text(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 4, "1"));
			g.appendChild(Image.rect(defs.getOwnerDocument(), 12, 7, elementWidth - 24, 2 * elementHeight - 14));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight / 2, 12, elementHeight / 2));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight + (elementHeight / 2), 12, elementHeight + (elementHeight / 2)));
			g.appendChild(Image.line(defs.getOwnerDocument(), elementWidth - 12, elementHeight / 2, elementWidth, elementHeight / 2));
		}
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#paint(void)
	 */
	@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {
		Element use = Image.use(svg.getOwnerDocument(), getClass().getCanonicalName(), x, y);
		svg.appendChild(use);
	}

}
