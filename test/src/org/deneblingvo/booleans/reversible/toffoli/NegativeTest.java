/**
 * 
 */
package org.deneblingvo.booleans.reversible.toffoli;

import static org.junit.Assert.*;

import org.deneblingvo.booleans.BooleanValues;
import org.deneblingvo.booleans.CalculateException;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 *
 */
public class NegativeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.negative = new Negative();
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(1, this.negative.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(1, this.negative.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionSequence#calculate(org.deneblingvo.booleans.BooleanValues)}.
	 */
	@Test
	public void testCalculate() throws CalculateException {
		assertEquals(1, this.negative.calculate(new BooleanValues(0, 1)).getValue());
		assertEquals(0, this.negative.calculate(new BooleanValues(1, 1)).getValue());
	}

	private Negative negative;
}
