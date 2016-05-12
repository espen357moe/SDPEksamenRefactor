package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForClassmodel extends LineElement {

	public LineElementForClassmodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	// lag på nytt når nødvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		Point p1 = interpolate(realstart, realstop, 0.33);						
		Point p2 = interpolate(realstart, realstop, 0.66);	
		
		pl.add(p1);
		pl.add(p2);				
		
		return pl;
	}		
}
