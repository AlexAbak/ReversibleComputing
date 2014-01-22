/**
 * 
 */
package org.deneblingvo.booleans;

import javax.xml.parsers.ParserConfigurationException;

import net.sf.saxon.s9api.SaxonApiException;

import org.deneblingvo.booleans.compute.Computable;
import org.deneblingvo.booleans.compute.ComputeException;
import org.deneblingvo.booleans.compute.elements.ComputeElements;
import org.deneblingvo.booleans.core.Function;
import org.deneblingvo.booleans.core.Value;
import org.deneblingvo.booleans.core.Values;
import org.deneblingvo.booleans.elements.Conjunction;
import org.deneblingvo.booleans.elements.Disjunction;
import org.deneblingvo.booleans.elements.List;
import org.deneblingvo.booleans.elements.Sequence;
import org.deneblingvo.booleans.paint.Paintable;
import org.deneblingvo.booleans.paint.elements.PaintElements;
import org.deneblingvo.booleans.paint.svg.Svg;
import org.deneblingvo.mixin.Mixer;
import org.deneblingvo.mixin.MixinableFactory;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alex
 *
 */
public class CompositionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws ParserConfigurationException, SaxonApiException, ComputeException {
		MixinableFactory[][] factories = {
				PaintElements.elements(),
				ComputeElements.elements()
		};
		Mixer mixer = new Mixer(factories);
		
		Function[] line1 = {
				new Conjunction(2),
				new Disjunction(2),
				new Conjunction(2),
				new Conjunction(2)
		};
		Function[] line2 = {
				new Disjunction(2),
				new Conjunction(2)
		};
		Function line3 = new Disjunction(2);
		Function list1 = new List(line1);
		Function list2 = new List(line2);
		Function[] sequence = {
				list1,
				list2,
				line3
		};
		Function function = new Sequence(sequence);
		mixer.mix(function);
		
		Paintable paintable = (Paintable)function.getMixin(Paintable.class);
		Svg svg = new Svg();
		paintable.sprites(svg);
		paintable.paint(svg, 0, 0);
		svg.line(0, paintable.getHeight() * svg.getCellHeight(), paintable.getWidth() * svg.getCellWidth(), paintable.getHeight() * svg.getCellHeight());
		svg.saveToFile("test.svg");
	}

}
