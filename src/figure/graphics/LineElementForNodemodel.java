package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForNodemodel extends LineElement {

	public LineElementForNodemodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		Point p1 = interpolate(realstart, realstop, 0.25);
		Point p2 = interpolate (realstart, realstop, 0.5);
		Point p3 = interpolate(realstart, realstop, 0.75);	
		
		
		pl.add(p1);
		pl.add(p2);		
		pl.add(p3);
		
		return pl;
	}		
}
