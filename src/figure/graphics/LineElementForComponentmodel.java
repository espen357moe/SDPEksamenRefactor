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
			
		if(virtualstop.x - virtualstart.x != 0 && virtualstop.y - virtualstart.y == 0) { // x diff is !0 and y diff is 0 => line is horizontal		
			for(int i = 1; i < 11; i++){
				pl.add(new Point(((realstop.x + realstart.x) / 10) * i, realstart.y));
			}																				
		}
		else { // line is !horizontal
			for(int i = 1; i < 11; i++) {
				pl.add(new Point((realstart.x), ((realstop.y + realstart.y) / 10) * i));
			}														
		}					
		return pl;
	}		
}