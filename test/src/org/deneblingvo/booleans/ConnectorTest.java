/**
 * Соединитель
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Соединитель
 */
public class ConnectorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		int[] numbers = {2, 0, 1, 1};
		this.connector = new Connector(numbers);
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.Connector#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(3, this.connector.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.Connector#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(4, this.connector.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.Connector#calculate(org.deneblingvo.booleans.BooleanValues)}.
	 */
	@Test
	public void testCalculate() throws CalculateException {
		assertEquals(0, this.connector.calculate(new BooleanValues(0, 3)).getValue());
		assertEquals(8, this.connector.calculate(new BooleanValues(1, 3)).getValue());
		assertEquals(3, this.connector.calculate(new BooleanValues(2, 3)).getValue());
		assertEquals(11, this.connector.calculate(new BooleanValues(3, 3)).getValue());
		assertEquals(4, this.connector.calculate(new BooleanValues(4, 3)).getValue());
		assertEquals(12, this.connector.calculate(new BooleanValues(5, 3)).getValue());
		assertEquals(7, this.connector.calculate(new BooleanValues(6, 3)).getValue());
		assertEquals(15, this.connector.calculate(new BooleanValues(7, 3)).getValue());
	}

	private Connector connector;

}
