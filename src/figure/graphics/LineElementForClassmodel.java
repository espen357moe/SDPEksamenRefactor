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
			Point point1 = new Point(((realstart.x + realstop.x) / 3), (realstart.y));
			Point point2 = new Point(((realstart.x + realstop.x) / 3) * 2, (realstart.y));					
			
			pl.add(point1);
			pl.add(point2);	
		}
		else { // line is !horizontal
			Point point1 = new Point(((realstart.x)), (realstart.y + realstop.y) / 3);
			Point point2 = new Point(((realstart.x)), ((realstart.y + realstop.y) / 3) * 2);
			
			pl.add(point1);
			pl.add(point2);
		}					
		return pl;
	}
}
