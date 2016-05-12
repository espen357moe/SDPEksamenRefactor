package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElement;
import figure.graphics.LineElementForComponentmodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;
import figure.model.IFigure.Hold;

public class Componentmodel extends Figuremodel implements Cloneable {
	
	/*
	 Large ractangle
	 p1___________p2
	 |			   |
	 p4___________p3
	 	 
	 Small rectangle
	 sr1-------sr2
	 |			|
	 |			|
	 sr4-------sr3
	 
	 component rectangle
	 cr1---cr2
	 |		|
	 cr4---cr3
	 
	 cr5---cr6
	 |		|
	 cr8---cr7	 
	 */	
	
	public Componentmodel(int x, int y) {
		figureName = "Component";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		Point p1 = new Point(10, 10);
		Point p2 = new Point(990, 10);
		Point p3 = new Point(990, 990);
		Point p4 = new Point(10, 990);
		
		Point sr1 = new Point (700,50);
		Point sr2 = new Point (900,50);
		Point sr3 = new Point (900,350);
		Point sr4 = new Point (700,350);
		
		Point cr1 = new Point (650,125);
		Point cr2 = new Point (750,125);
		Point cr3 = new Point (750,175);
		Point cr4 = new Point (650,175);
		
		Point cr5 = new Point (650,225);
		Point cr6 = new Point (750,225);
		Point cr7 = new Point (750,275);
		Point cr8 = new Point (650,275);
		
		drawBigRectangle(p1, p2, p3, p4);
		drawSmallRectangle(sr1, sr2, sr4, sr3);
		drawComponentRectangle(cr1,cr2,cr4,cr3,cr5,cr6,cr8,cr7);
		elements.add(new TextElement(":Component", LabelAlign.CENTER));
	}

	private void drawBigRectangle(Point p1, Point p2, Point p3, Point p4) {
		elements.add(new LineElementForComponentmodel(p1, p2, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p2, p3, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p3, p4, Hold.TRACE));
		elements.add(new LineElementForComponentmodel(p4, p1, Hold.TRACE));

	}
	
	private void drawSmallRectangle(Point sr1, Point sr2, Point sr3, Point sr4) {
		elements.add(new LineElement (sr1, sr2, Hold.NONE));
		elements.add(new LineElement (sr1, sr3, Hold.NONE));
		elements.add(new LineElement (sr2, sr4, Hold.NONE));
		elements.add(new LineElement (sr3, sr4, Hold.NONE));
	}
	
	private void drawComponentRectangle(Point cr1, Point cr2, Point cr3, Point cr4, Point cr5, Point cr6, Point cr7, Point cr8) {
		elements.add(new LineElement (cr1, cr2, Hold.NONE));
		elements.add(new LineElement (cr1, cr3, Hold.NONE));
		elements.add(new LineElement (cr2, cr4, Hold.NONE));
		elements.add(new LineElement (cr3, cr4, Hold.NONE));
		elements.add(new LineElement (cr5, cr6, Hold.NONE));
		elements.add(new LineElement (cr5, cr7, Hold.NONE));
		elements.add(new LineElement (cr6, cr8, Hold.NONE));
		elements.add(new LineElement (cr7, cr8, Hold.NONE));
	}
	
	@Override
	protected Figuremodel instance(int x, int y) {
		
		return new Componentmodel(x,y);
	}

}
