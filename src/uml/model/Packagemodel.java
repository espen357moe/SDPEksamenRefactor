package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElementForClassmodel;
import figure.graphics.LineElementForPackagemodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;
import figure.model.IFigure.Hold;
import figure.model.IFigure.LabelAlign;

public class Packagemodel extends Figuremodel implements Cloneable {
	
	public Packagemodel(int x, int y){
		figureName = "Package";
		start = new Point(x, y);
		virtual = new Dimension(150, 80);
		
		// draw package tab
		elements.add(new LineElementForPackagemodel(new Point(0,0), new Point(400,0), Hold.NONE));
		elements.add(new LineElementForPackagemodel(new Point(400,0), new Point(400,200), Hold.NONE));
		elements.add(new LineElementForPackagemodel(new Point(400, 200), new Point(0, 200), Hold.NONE));
		elements.add(new LineElementForPackagemodel(new Point(0,200), new Point(0,0), Hold.NONE));
		
		// draw package body
		elements.add(new LineElementForPackagemodel(new Point(0,200), new Point(1000,200), Hold.TRACE));
		elements.add(new LineElementForPackagemodel(new Point(1000,200), new Point(1000,1000), Hold.TRACE));
		elements.add(new LineElementForPackagemodel(new Point(1000,1000), new Point(0,1000), Hold.TRACE));
		elements.add(new LineElementForPackagemodel(new Point(0,1000), new Point(0,200), Hold.TRACE));
		
		elements.add(new TextElement("Package", LabelAlign.CENTER));
		
	}

	@Override
	protected Figuremodel instance(int x, int y) {
		return new Packagemodel(x,y);
	}

}
