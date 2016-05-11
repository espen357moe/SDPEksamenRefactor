package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElement;
import figure.graphics.LineElementForComponentmodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Componentmodel extends Figuremodel implements Cloneable {
	
	public Componentmodel(int x, int y) {
		figureName = "Component";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		Point p1 = new Point(10, 10);
		Point p2 = new Point(990, 10);
		Point p3 = new Point(990, 990);
		Point p4 = new Point(10, 990);
		
		drawSymbol(p1, p2, p3, p4);
	}

	private void drawSymbol(Point p1, Point p2, Point p3, Point p4) {
		// draw component body
		elements.add(new LineElementForComponentmodel(p1, p2, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p2, p3, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p3, p4, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p4, p1, Hold.TRACE));
		
		// draw component symbol detail
		elements.add(new LineElement(new Point(700, 50), new Point(900, 50), Hold.NONE));
		elements.add(new LineElement(new Point(900, 50), new Point(900, 350), Hold.NONE));
		elements.add(new LineElement(new Point(900, 350), new Point(700, 350), Hold.NONE));
		elements.add(new LineElement(new Point(700, 350), new Point(700, 50), Hold.NONE));
		
		elements.add(new LineElement(new Point(650,125), new Point(750, 125), Hold.NONE));
		elements.add(new LineElement(new Point(750,125), new Point(750, 175), Hold.NONE));
		elements.add(new LineElement(new Point(750, 175), new Point(650, 175), Hold.NONE));
		elements.add(new LineElement(new Point(650, 175), new Point(650, 125), Hold.NONE));
		
		elements.add(new LineElement(new Point(650, 225), new Point(750, 225), Hold.NONE));
		elements.add(new LineElement(new Point(750, 225), new Point(750, 275), Hold.NONE));
		elements.add(new LineElement(new Point(750, 275), new Point(650, 275), Hold.NONE));
		elements.add(new LineElement(new Point(650, 275), new Point(650, 225), Hold.NONE));		
		
		elements.add(new TextElement(":Component", LabelAlign.CENTER));
	}

	@Override
	protected Figuremodel instance(int x, int y) {
		
		return new Componentmodel(x,y);
	}

}
