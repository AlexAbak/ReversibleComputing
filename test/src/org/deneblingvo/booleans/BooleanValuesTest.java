/**
 * Набор булевых значений
 */
package org.deneblingvo.booleans;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author alex
 * Набор булевых значений
 */
public class BooleanValuesTest {

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanValues#BooleanValues(int, int)}.
	 */
	@Test
	public void testBooleanValuesIntInt() {
		BooleanValues booleanValues = new BooleanValues(BooleanValuesTest.value1, BooleanValuesTest.count);
		assertArrayEquals(BooleanValuesTest.values1, booleanValues.getValues());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanValues#BooleanValues(org.deneblingvo.booleans.BooleanValue[])}.
	 */
	@Test
	public void testBooleanValuesBooleanValueArray() {
		BooleanValues booleanValues = new BooleanValues(BooleanValuesTest.values1);
		assertEquals(BooleanValuesTest.value1, booleanValues.getValue());
		assertEquals(BooleanValuesTest.count, booleanValues.getCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanValues#getCount()}.
	 */
	@Test
	public void testGetCount() {
		BooleanValues booleanValues = new BooleanValues(BooleanValuesTest.values2);
		assertEquals(BooleanValuesTest.count, booleanValues.getCount());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanValues#getValue()}.
	 */
	@Test
	public void testGetValue() {
		BooleanValues booleanValues = new BooleanValues(BooleanValuesTest.values2);
		assertEquals(BooleanValuesTest.value2, booleanValues.getValue());
	}

	/**
	 * Test method for {@link org.deneblingvo.booleans.BooleanValues#getValues()}.
	 */
	@Test
	public void testGetValues() {
		BooleanValues booleanValues = new BooleanValues(BooleanValuesTest.value2, BooleanValuesTest.count);
		assertArrayEquals(BooleanValuesTest.values2, booleanValues.getValues());
	}

	static private int value1 = 21;
	
	static private int value2 = 7;

	static private int count = 6;
	
	static private BooleanValue[] values1 = {BooleanValue.FALSE, BooleanValue.TRUE, BooleanValue.FALSE, BooleanValue.TRUE, BooleanValue.FALSE, BooleanValue.TRUE};

	static private BooleanValue[] values2 = {BooleanValue.FALSE, BooleanValue.FALSE, BooleanValue.FALSE, BooleanValue.TRUE, BooleanValue.TRUE, BooleanValue.TRUE};

}
