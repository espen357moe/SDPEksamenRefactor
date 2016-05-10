package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElementForPackagemodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Packagemodel extends Figuremodel implements Cloneable {
	
	public Packagemodel(int x, int y){
		figureName = "Package";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		Point p1 = new Point(10, 10);
		Point p2 = new Point(400, 10);
		Point p3 = new Point(400, 200);
		Point p4 = new Point(10, 200);
		
		Point p5 = new Point(10, 200);
		Point p6 = new Point(990, 200);
		Point p7 = new Point(990, 990);
		Point p8 = new Point(10, 990);
		
		// draw package tab
		elements.add(new LineElementForPackagemodel(p1, p2, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p2, p3, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p3, p4, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p4, p1, Hold.NONE));
		
		// draw package body
		elements.add(new LineElementForPackagemodel(p5, p6, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p6, p7, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p7, p8, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p8, p5, Hold.TRACE));
		
		elements.add(new TextElement("Package", LabelAlign.CENTER));
		
	}

	@Override
	protected Figuremodel instance(int x, int y) {
		return new Packagemodel(x,y);
	}

}
