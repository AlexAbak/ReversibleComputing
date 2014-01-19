package org.deneblingvo.booleans;

import org.deneblingvo.booleans.reversible.toffoli.NegativeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BooleanMathTest.class, 
	BooleanValuesTest.class,
	FunctionListTest.class,
	FunctionSequenceTest.class,
	TruthTableTest.class, 
	NegativeTest.class})
public class AllTests {

}
