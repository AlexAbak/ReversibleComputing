/**
 * 
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.booleans.svg.Image;
import org.deneblingvo.booleans.unary.Negative;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 *
 */
public class FunctionSequenceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		BooleanFunction[] functions = {new Conjunction(), new Negative()};
		this.functionSequence = new FunctionSequence(functions);
		Image image = new Image(this.functionSequence);
		image.saveToFile("fileName.svg");
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(2, this.functionSequence.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(1, this.functionSequence.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#calculate(org.deneblingvo.booleans.BooleanValues)}.
	 */
	@Test
	public void testCalculate() throws CalculateException {
		assertEquals(1, this.functionSequence.calculate(new BooleanValues(0, 2)).getValue());
		assertEquals(1, this.functionSequence.calculate(new BooleanValues(1, 2)).getValue());
		assertEquals(1, this.functionSequence.calculate(new BooleanValues(2, 2)).getValue());
		assertEquals(0, this.functionSequence.calculate(new BooleanValues(3, 2)).getValue());
	}

	private FunctionSequence functionSequence;

}
