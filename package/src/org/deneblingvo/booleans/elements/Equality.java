/**
 * Эквиваленция
 */
package org.deneblingvo.booleans.elements;

import org.deneblingvo.booleans.TruthTable;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Эквиваленция
 */
public final class Equality extends TruthTable {

	/**
	 * Конструктор
	 */
	public Equality(int inputCount) {
		super(Equality.getTruthTableValues(inputCount));
	}

	/**
	 * Значения таблицы истинности
	 * @return
	 */
	static private int[] getTruthTableValues(int inputCount) {
		int[] values = new int[inputCount];
		values[0] = 1;
		for (int i = 1; i < inputCount - 1; i++) {
			values[0] = 0;
		}
		values[inputCount - 1] = 1;
		return values;
	}

	/*@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		if (!Image.containsDef(defs, getClass().getCanonicalName())) {
			Element g = Image.g(defs.getOwnerDocument(), getClass().getCanonicalName());
			defs.appendChild(g);
			g.appendChild(Image.text(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 4, "="));
			g.appendChild(Image.rect(defs.getOwnerDocument(), 12, 7, elementWidth - 24, 2 * elementHeight - 14));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight / 2, 12, elementHeight / 2));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight + (elementHeight / 2), 12, elementHeight + (elementHeight / 2)));
			g.appendChild(Image.line(defs.getOwnerDocument(), elementWidth - 12, elementHeight / 2, elementWidth, elementHeight / 2));
		}
	}*/

	/*@Override
	public void paint(Element svg, int x, int y, int elementWidth, int elementHeight) {
		Element use = Image.use(svg.getOwnerDocument(), getClass().getCanonicalName(), x, y);
		svg.appendChild(use);
	}*/

}
