package uml.model;

import java.awt.Dimension;
import java.awt.Point;
import figure.graphics.LineElementForClassmodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Classmodel extends Figuremodel implements Cloneable {
	
	/*
	 r1-----------------r2
	 |					|
	 |					|
	 |		Package		|
	 |					|
	 |					|
	 r3----------------r4
	 */
	
	public Classmodel (int x, int y){
		figureName = "Class";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		Point p1 = new Point(10, 10);
		Point p2 = new Point(990, 10);
		Point p3 = new Point(990, 990);
		Point p4 = new Point(10, 990);
		
		elements.add(new LineElementForClassmodel(p1, p2, Hold.TRACE));
		elements.add(new LineElementForClassmodel(p2, p3, Hold.TRACE));
		elements.add(new LineElementForClassmodel(p3, p4, Hold.TRACE));
		elements.add(new LineElementForClassmodel(p4 ,p1, Hold.TRACE));
		
		elements.add(new TextElement("Class", LabelAlign.CENTER));
	}	

	protected Figuremodel instance(int x, int y) {
		return new Classmodel(x, y);
	}

}