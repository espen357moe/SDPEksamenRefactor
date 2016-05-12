package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElementForNodemodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;
import figure.model.IFigure.Hold;

public class Nodemodel  extends Figuremodel implements Cloneable{

	/*
	    n5_____________n6
	   /			   /|
	  /			      /	|
	 n1-------------n2	|
	 |				 |	|
	 |				 |	|
	 |				 |	n7
	 n3_____________n4/
	 
	 */
	private Point n1, n2, n3, n4, n5, n6, n7;
	
	public Nodemodel(int x, int y) {
		figureName = "Nodemodel";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		n1 = new Point (10,150);
		n2 = new Point (850,150);
		n3 = new Point (10,990);
		n4 = new Point (850,990);
		n5 = new Point (150,10);
		n6 = new Point (990,10);
		n7 = new Point (990,850);

		drawNode(n1,n2,n3,n4,n5,n6,n7);
		
		elements.add(new TextElement("Node", LabelAlign.CENTER));
	}
	
	private void drawNode(Point n1, Point n2, Point n3, Point n4, Point n5, Point n6, Point n7) {
		elements.add(new LineElementForNodemodel (n1, n2, Hold.NONE));
		elements.add(new LineElementForNodemodel (n1, n3, Hold.TRACE));
		elements.add(new LineElementForNodemodel (n2, n4, Hold.NONE));
		elements.add(new LineElementForNodemodel (n3, n4, Hold.TRACE));
		elements.add(new LineElementForNodemodel (n1, n5, Hold.NONE));
		elements.add(new LineElementForNodemodel (n5, n6, Hold.TRACE));
		elements.add(new LineElementForNodemodel (n6, n7, Hold.TRACE));
		elements.add(new LineElementForNodemodel (n2, n6, Hold.NONE));
		elements.add(new LineElementForNodemodel (n4, n7, Hold.NONE));
	}

	protected Figuremodel instance(int x, int y) {
		return new Nodemodel(x, y);
	}
}