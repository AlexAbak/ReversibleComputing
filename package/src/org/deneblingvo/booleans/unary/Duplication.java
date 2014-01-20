/**
 * Дублирование
 */
package org.deneblingvo.booleans.unary;

import org.deneblingvo.booleans.TruthTable;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Дублирование
 */
public final class Duplication extends TruthTable {

	/**
	 * Конструктор
	 */
	public Duplication() {
		super(Duplication.getTruthTableValues());
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues() {
		int[] values = {0, 1};
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
