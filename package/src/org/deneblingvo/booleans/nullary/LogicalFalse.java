/**
 * Тождественный ноль
 */
package org.deneblingvo.booleans.nullary;

import org.deneblingvo.booleans.BooleanFunction;
import org.deneblingvo.booleans.BooleanValue;
import org.deneblingvo.booleans.BooleanValues;
import org.deneblingvo.booleans.svg.Image;
import org.w3c.dom.Element;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Тождественный ноль
 */
public final class LogicalFalse implements BooleanFunction {

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getInputCount()
	 */
	@Override
	public int getInputCount() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#getOutputCount()
	 */
	@Override
	public int getOutputCount() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#calculate(org.deneblingvo.booleans.BooleanValues)
	 */
	@Override
	public BooleanValues calculate(BooleanValues inputs) {
		BooleanValue[] outputs = {BooleanValue.FALSE};		
		return new BooleanValues(outputs);
	}

	/* (non-Javadoc)
	 * @see org.deneblingvo.booleans.BooleanFunction#initDefs(void)
	 */
	@Override
	public void initDefs(Element defs, int elementWidth, int elementHeight) {
		if (!Image.containsDef(defs, getClass().getCanonicalName())) {
			Element g = Image.g(defs.getOwnerDocument(), getClass().getCanonicalName());
			defs.appendChild(g);
			g.appendChild(Image.text(defs.getOwnerDocument(), elementWidth / 2, elementHeight / 2, elementHeight / 4, "0"));
			g.appendChild(Image.rect(defs.getOwnerDocument(), 12, 7, elementWidth - 24, elementHeight - 14));
			g.appendChild(Image.line(defs.getOwnerDocument(), elementWidth - 12, elementHeight / 2, elementWidth, elementHeight / 2));
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
