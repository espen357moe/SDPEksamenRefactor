package uml.model;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.PathIterator;
import java.util.ArrayList;

import figure.graphics.EllipseElement;
import figure.graphics.LineElement;
import figure.graphics.LineElementForClassmodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;
import figure.model.IFigure.Hold;
import figure.model.IFigure.LabelAlign;

public class Classmodel extends Figuremodel implements Cloneable {
	
	public Classmodel (int x, int y){
		figureName = "Class";
		start = new Point(x, y);
		Point UpperLeftCorner = new Point(0,0);
		virtual = new Dimension(150, 80);
		
		elements.add(new LineElementForClassmodel(new Point(0,0), new Point(1000,0), Hold.TRACE));
		elements.add(new LineElementForClassmodel(new Point(1000,0), new Point(1000,1000), Hold.TRACE));
		elements.add(new LineElementForClassmodel(new Point(1000,1000), new Point(0,1000), Hold.TRACE));
		elements.add(new LineElementForClassmodel(new Point(0,1000), new Point(0,0), Hold.TRACE));		
	}	

	@Override
	protected Figuremodel instance(int x, int y) {
		return new Classmodel(x, y);
	}

}