package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

public class LineElementForNodeModel extends LineElement {

	public LineElementForNodeModel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	// lag på nytt når nødvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
				
		if(virtualstop.x - virtualstart.x != 0 && virtualstop.y - virtualstart.y == 0) { // x diff is !0 and y diff is 0 => line is horizontal
			for (int i = 1; i < 4; i++){
				pl.add(new Point (((realstop.x + realstart.x) / 4) * i, realstart.y));
			}
		}
		else { // line is !horizontal
			for(int i = 1; i < 4; i++) {
				pl.add(new Point((realstart.x), ((realstop.y + realstart.y) / 4) * i));
			}
		}
		return pl;
	}

}
