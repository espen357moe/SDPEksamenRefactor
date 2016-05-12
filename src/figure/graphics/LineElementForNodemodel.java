package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForNodemodel extends LineElement {

	public LineElementForNodemodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		pl.add(interpolate(realstart, realstop, 0.25));
		pl.add(interpolate(realstart, realstop, 0.5));
		pl.add(interpolate(realstart, realstop, 0.75));			

		return pl;
	}		
}
