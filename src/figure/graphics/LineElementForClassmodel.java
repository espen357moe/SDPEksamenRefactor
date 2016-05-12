package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForClassmodel extends LineElement {

	public LineElementForClassmodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		pl.add(interpolate(realstart, realstop, 0.33));						
		pl.add(interpolate(realstart, realstop, 0.66));						
		
		return pl;
	}		
}
