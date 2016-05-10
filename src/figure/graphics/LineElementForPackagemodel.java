package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForPackagemodel extends LineElement {

	public LineElementForPackagemodel(Point a, Point b, Hold c) {
		super(a, b, c);
	}
	
	// lag p� nytt n�r n�dvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
			
		pl.add(realstart);
		pl.add(realstop);
			
		if(virtualstop.x - virtualstart.x != 0 && virtualstop.y - virtualstart.y == 0) { // x diff is !0 and y diff is 0 => line is horizontal		
			pl.add(new Point(((realstop.x + realstart.x) / 2), realstart.y));														
		}
		else { // line is !horizontal
			pl.add(new Point((realstart.x), (realstop.y + realstart.y) / 2));							
		}					
		return pl;
	}		
}
