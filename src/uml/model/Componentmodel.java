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
		
		// draw component body
		elements.add(new LineElementForComponentmodel(new Point(0,0), new Point(1000,0), Hold.TRACE));
		elements.add(new LineElementForComponentmodel(new Point(1000,0), new Point(1000,1000), Hold.TRACE));
		elements.add(new LineElementForComponentmodel(new Point(1000,1000), new Point(0,1000), Hold.TRACE));
		elements.add(new LineElementForComponentmodel(new Point(0,1000), new Point(0,0), Hold.TRACE));
		
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
