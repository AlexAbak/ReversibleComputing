/**
 * Заглушка теряющая информацию
 */
package org.deneblingvo.booleans.nullary;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.BooleanValue;
import org.deneblingvo.booleans.BooleanValues;
import org.deneblingvo.booleans.CalculateException;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Заглушка теряющая информацию
 */
public final class Dummy implements BooleanFunction {

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) throws CalculateException {
		BooleanValue[] values = {};
		return new BooleanValues(values);
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		if (!Image.containsDef(defs, getClass().getCanonicalName())) {
			Element g = Image.g(defs.getOwnerDocument(), getClass().getCanonicalName());
			defs.appendChild(g);
			g.appendChild(Image.text(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 4, "#"));
			g.appendChild(Image.rect(defs.getOwnerDocument(), 12, 7, elementWidth - 24, elementHeight - 14));
			g.appendChild(Image.line(defs.getOwnerDocument(), 0, elementHeight / 2, 12, elementHeight / 2));
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
