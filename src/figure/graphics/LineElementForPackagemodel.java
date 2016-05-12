package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForPackagemodel extends LineElement {

	public LineElementForPackagemodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}
	
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
			
		pl.add(realstart);
		pl.add(realstop);
		pl.add(interpolate(realstart, realstop, 0.5));
					
		return pl;
	}		
}
