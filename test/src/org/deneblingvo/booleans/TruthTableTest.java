/**
 * Булева функция выраженная через таблицу истинности
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Булева функция выраженная через таблицу истинности
 */
public class TruthTableTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testTruthTable = new TestTruthTable();
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.TruthTable#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(3, this.testTruthTable.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.TruthTable#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(3, this.testTruthTable.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.TruthTable#calculate(org.deneblingvo.booleans.BooleanValues)}.
	 */
	@Test
	public void testCalculate() throws CalculateException {
		assertEquals(7, this.testTruthTable.calculate(new BooleanValues(0, 3)).getValue());
		assertEquals(0, this.testTruthTable.calculate(new BooleanValues(1, 3)).getValue());
		assertEquals(6, this.testTruthTable.calculate(new BooleanValues(2, 3)).getValue());
		assertEquals(1, this.testTruthTable.calculate(new BooleanValues(3, 3)).getValue());
		assertEquals(5, this.testTruthTable.calculate(new BooleanValues(4, 3)).getValue());
		assertEquals(2, this.testTruthTable.calculate(new BooleanValues(5, 3)).getValue());
		assertEquals(4, this.testTruthTable.calculate(new BooleanValues(6, 3)).getValue());
		assertEquals(3, this.testTruthTable.calculate(new BooleanValues(7, 3)).getValue());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.TruthTable#getValues()}.
	 */
	@Test
	public void testGetValues() {
		int[] values = {7, 0, 6, 1, 5, 2, 4, 3};
		assertArrayEquals(values, this.testTruthTable.getValues());
	}

	private TestTruthTable testTruthTable;

}
