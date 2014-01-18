/**
 * 
 */
package org.deneblingvo.reversibleComputing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alex
 *
 */
public class TruthTableTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		int[] values = {0, 0, 0, 1};
		this.truthTable = new TruthTable(values);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.deneblingvo.reversibleComputing.TruthTable#getInputCount()}.
	 */
	@Test
	public void testGetInputCount() {
		assertEquals(2, this.truthTable.getInputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.reversibleComputing.TruthTable#getOutputCount()}.
	 */
	@Test
	public void testGetOutputCount() {
		assertEquals(1, this.truthTable.getOutputCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.reversibleComputing.TruthTable#calculate(org.deneblingvo.reversibleComputing.BooleanValue[])}.
	 */
	@Test
	public void testCalculate() {
		BooleanValue[] values1 = {BooleanValue.FALSE, BooleanValue.FALSE};
		assertEquals(BooleanValue.FALSE, this.truthTable.calculate(values1)[0]);
		BooleanValue[] values2 = {BooleanValue.FALSE, BooleanValue.TRUE};
		assertEquals(BooleanValue.FALSE, this.truthTable.calculate(values2)[0]);
		BooleanValue[] values3 = {BooleanValue.TRUE, BooleanValue.FALSE};
		assertEquals(BooleanValue.FALSE, this.truthTable.calculate(values3)[0]);
		BooleanValue[] values4 = {BooleanValue.TRUE, BooleanValue.TRUE};
		assertEquals(BooleanValue.TRUE, this.truthTable.calculate(values4)[0]);
	}

	/**
	 * Test method for {@link org.deneblingvo.reversibleComputing.TruthTable#lg(int)}.
	 */
	@Test
	public void testLg() {
		assertEquals(0, TruthTable.lg(1));
		assertEquals(1, TruthTable.lg(2));
		assertEquals(1, TruthTable.lg(3));
		assertEquals(2, TruthTable.lg(4));
		assertEquals(2, TruthTable.lg(5));
		assertEquals(2, TruthTable.lg(6));
		assertEquals(2, TruthTable.lg(7));
		assertEquals(3, TruthTable.lg(8));
		assertEquals(3, TruthTable.lg(9));
		assertEquals(3, TruthTable.lg(10));
		assertEquals(3, TruthTable.lg(11));
		assertEquals(3, TruthTable.lg(12));
		assertEquals(3, TruthTable.lg(13));
		assertEquals(3, TruthTable.lg(14));
		assertEquals(3, TruthTable.lg(15));
		assertEquals(4, TruthTable.lg(16));
		assertEquals(4, TruthTable.lg(17));
		assertEquals(4, TruthTable.lg(18));
		assertEquals(4, TruthTable.lg(19));
		assertEquals(4, TruthTable.lg(20));
		assertEquals(4, TruthTable.lg(21));
		assertEquals(4, TruthTable.lg(22));
		assertEquals(4, TruthTable.lg(23));
		assertEquals(4, TruthTable.lg(24));
		assertEquals(4, TruthTable.lg(25));
		assertEquals(4, TruthTable.lg(26));
		assertEquals(4, TruthTable.lg(27));
		assertEquals(4, TruthTable.lg(28));
		assertEquals(4, TruthTable.lg(29));
		assertEquals(4, TruthTable.lg(30));
		assertEquals(4, TruthTable.lg(31));
		assertEquals(5, TruthTable.lg(32));
	}

	private TruthTable truthTable;

}
