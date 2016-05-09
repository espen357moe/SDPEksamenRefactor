package figure.graphics;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.PathIterator;
import java.util.ArrayList;

import figure.model.IFigure.Hold;

public class LineElementForClassmodel extends LineElement {

	public LineElementForClassmodel(Point a, Point b, Hold c) {
		super(a, b, c);					
	}

	// lag på nytt når nødvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		if(virtualstop.x - virtualstart.x != 0 && virtualstop.y - virtualstart.y == 0) { // x diff is !0 and y diff is 0 => line is horizontal
			Point point1 = new Point(((virtualstop.x - virtualstart.x) / 3), (virtualstop.y - virtualstart.y));			
			Point point2 = new Point((point1.x * 2), point1.y);
			pl.add(point1);
			pl.add(point2);	
		}
		else { // line is not horizontal
			Point point1 = new Point(((virtualstop.y - virtualstart.y) / 3), (virtualstop.x - virtualstart.y));
			Point point2 = new Point(point1.x, (point1.y * 2));
			pl.add(point1);
			pl.add(point2);
		}					
		return pl;
	}
}
