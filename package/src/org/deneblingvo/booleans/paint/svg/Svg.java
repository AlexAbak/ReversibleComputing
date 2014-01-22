/**
 * 
 */
package org.deneblingvo.booleans.paint.svg;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;

import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.Serializer;
import net.sf.saxon.s9api.XdmNode;

import org.deneblingvo.booleans.paint.Imagable;
import org.deneblingvo.booleans.paint.Spritable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author alex
 *
 */
public final class Svg extends SvgDraw implements Imagable {

	final static public String NS = "http://www.w3.org/2000/svg";

	final static public String XLink = "http://www.w3.org/1999/xlink";
	
	/**
	 * @throws ParserConfigurationException 
	 * 
	 */
	public Svg() throws ParserConfigurationException {
		super(createRoot());
		this.defs = this.document().createElementNS(Svg.NS, "defs");
		this.element.appendChild(this.defs);
	}

	public void saveToFile(String fileName) throws SaxonApiException {
		Processor processor = new Processor(false);
		File file = new File(fileName);
		Serializer serialization = processor.newSerializer(file);
		net.sf.saxon.s9api.DocumentBuilder builder = processor.newDocumentBuilder();
		XdmNode node = builder.build(new DOMSource(this.document()));
		serialization.setOutputProperty(Serializer.Property.INDENT, "yes");
		serialization.serializeNode(node);
	}

	@Override
	public boolean hasSprite(String spriteName) {
		NodeList nodes = this.defs.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element g = (Element) node;
				if (g.hasAttribute("id")) {
					if (g.getAttribute("id") == spriteName) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Spritable newSprite(String spriteName) {
		Element g = this.document().createElementNS(Svg.NS, "g");
		g.setAttribute("id", spriteName);
		this.defs.appendChild(g);
		return new SvgSprite(g);
	}

	@Override
	public int getCellWidth() {
		return 64;
	}

	@Override
	public int getCellHeight() {
		return 64;
	}

	@Override
	public void sprite(String spriteName, int x, int y) {
		Element sprite = this.document().createElementNS(Svg.NS, "use");
		sprite.setAttribute("x", Integer.toString(x));
		sprite.setAttribute("y", Integer.toString(y));
		sprite.setAttributeNS(Svg.XLink, "xlink:href", "#" + spriteName);
		this.element.appendChild(sprite);
	}

	private static Element createRoot() throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element root = document.createElementNS(Svg.NS, "svg");
		root.setAttribute("xmlns:xlink", Svg.XLink);
		root.setAttribute("version", "1.1");
		document.appendChild(root);
		return root;
	}

	private Element defs;

}
