/**
 * Булева алгебра
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Алексей Кляузер <drum@pisem.net>
 * Булева алгебра
 */
public class BooleanMathTest {

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanMath#lg(int)}.
	 */
	@Test
	public void testLg() {
		assertEquals(0, BooleanMath.lg(1));
		assertEquals(1, BooleanMath.lg(2));
		assertEquals(1, BooleanMath.lg(3));
		assertEquals(2, BooleanMath.lg(4));
		assertEquals(2, BooleanMath.lg(5));
		assertEquals(2, BooleanMath.lg(6));
		assertEquals(2, BooleanMath.lg(7));
		assertEquals(3, BooleanMath.lg(8));
		assertEquals(3, BooleanMath.lg(9));
		assertEquals(3, BooleanMath.lg(10));
		assertEquals(3, BooleanMath.lg(11));
		assertEquals(3, BooleanMath.lg(12));
		assertEquals(3, BooleanMath.lg(13));
		assertEquals(3, BooleanMath.lg(14));
		assertEquals(3, BooleanMath.lg(15));
		assertEquals(4, BooleanMath.lg(16));
		assertEquals(4, BooleanMath.lg(17));
		assertEquals(4, BooleanMath.lg(18));
		assertEquals(4, BooleanMath.lg(19));
		assertEquals(4, BooleanMath.lg(20));
		assertEquals(4, BooleanMath.lg(21));
		assertEquals(4, BooleanMath.lg(22));
		assertEquals(4, BooleanMath.lg(23));
		assertEquals(4, BooleanMath.lg(24));
		assertEquals(4, BooleanMath.lg(25));
		assertEquals(4, BooleanMath.lg(26));
		assertEquals(4, BooleanMath.lg(27));
		assertEquals(4, BooleanMath.lg(28));
		assertEquals(4, BooleanMath.lg(29));
		assertEquals(4, BooleanMath.lg(30));
		assertEquals(4, BooleanMath.lg(31));
		assertEquals(5, BooleanMath.lg(32));
	}

}
