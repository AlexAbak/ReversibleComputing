/**
 * 
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.booleans.unary.Negative;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 *
 */
public class FunctionListTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		BooleanFunction[] functions = {new Conjunction(), new Negative()};
		this.functionList = new FunctionList(functions);
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionList#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(3, this.functionList.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionList#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(2, this.functionList.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.FunctionList#calculate(org.deneblingvo.booleans.BooleanValues)}.
	 */
	@Test
	public void testCalculate() throws CalculateException {
		assertEquals(1, this.functionList.calculate(new BooleanValues(0, 3)).getValue());
		assertEquals(0, this.functionList.calculate(new BooleanValues(1, 3)).getValue());
		assertEquals(1, this.functionList.calculate(new BooleanValues(2, 3)).getValue());
		assertEquals(0, this.functionList.calculate(new BooleanValues(3, 3)).getValue());
		assertEquals(1, this.functionList.calculate(new BooleanValues(4, 3)).getValue());
		assertEquals(0, this.functionList.calculate(new BooleanValues(5, 3)).getValue());
		assertEquals(3, this.functionList.calculate(new BooleanValues(6, 3)).getValue());
		assertEquals(2, this.functionList.calculate(new BooleanValues(7, 3)).getValue());
	}

	private FunctionList functionList;

}
