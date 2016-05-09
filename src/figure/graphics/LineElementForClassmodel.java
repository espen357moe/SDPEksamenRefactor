package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

import figure.model.IFigure.Hold;

public class LineElementForClassmodel extends LineElement {

	public LineElementForClassmodel(Point a, Point b, Hold c) {
		super(a, b, c);		
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;		
	}

	// lag på nytt når nødvendig
	protected ArrayList<Point> traceresult() {
		return null;
	}
}
