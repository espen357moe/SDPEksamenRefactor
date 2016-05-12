package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForComponentmodel extends LineElement {

	public LineElementForComponentmodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}
	
	// lag på nytt når nødvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
			
		pl.add(realstart);
		pl.add(realstop);
			
		for(int i = 1; i < 11; i++){
			pl.add(interpolate(realstart, realstop, 0.1 * i));
		}
		
		return pl;
	}		
}