package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.graphics.LineElementForPackagemodel;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

public class Packagemodel extends Figuremodel implements Cloneable {
	
	/*
    p1_____p2
	 |		|
	 p4____p3
	 p5-----------------p6
	 |					|
	 |					|
	 |		Package		|
	 |					|
	 |					|
	 p8----------------p7
	 */
	
	private Point p1, p2, p3, p4, p5, p6, p7, p8;

	
	public Packagemodel(int x, int y){
		figureName = "Package";
		start = new Point(x, y);
		virtual = new Dimension(150, 100);
		
		 p1 = new Point(10, 10);
		 p2 = new Point(400, 10);
		 p3 = new Point(400, 200);
		 p4 = new Point(10, 200);
		
		 p5 = new Point(10, 200);
		 p6 = new Point(990, 200);
		 p7 = new Point(990, 990);
		 p8 = new Point(10, 990);
		
		drawPackageTab();	
		drawPackageBody();
		
		elements.add(new TextElement("Package", LabelAlign.CENTER));	
	}

	private void drawPackageTab() {
		elements.add(new LineElementForPackagemodel(p1, p2, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p2, p3, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p3, p4, Hold.NONE));
		elements.add(new LineElementForPackagemodel(p4, p1, Hold.NONE));
	}
	
	private void drawPackageBody() {
		elements.add(new LineElementForPackagemodel(p5, p6, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p6, p7, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p7, p8, Hold.TRACE));
		elements.add(new LineElementForPackagemodel(p8, p5, Hold.TRACE));
	}

	@Override
	protected Figuremodel instance(int x, int y) {
		return new Packagemodel(x,y);
	}

}
