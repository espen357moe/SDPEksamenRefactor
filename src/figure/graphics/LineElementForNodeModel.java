package figure.graphics;

import java.awt.Point;
import java.util.ArrayList;

import figure.model.IFigure.Hold;

public class LineElementForNodeModel extends LineElement {

	public LineElementForNodeModel(Point a, Point b, Hold c) {
		super(a, b, c);
	}

	// lag p� nytt n�r n�dvendig
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> pl = new ArrayList<Point>();
		
		if(virtualstop.x - virtualstart.x != 0 && virtualstop.y - virtualstart.y == 0) { // x diff is !0 and y diff is 0 => line is horizontal
			pl.add(new Point(realstart.x , realstart.y));
			pl.add(new Point(realstop.x, realstop.y));	
			pl.add(new Point(((realstart.x + realstop.x) / 2), (realstart.y)));
		}
		else { // line is !horizontal
			pl.add(new Point(realstart.x , realstart.y));
			pl.add(new Point(realstop.x, realstop.y));
			pl.add(new Point(((realstart.x)), (realstart.y + realstop.y) / 2));
		}					
		return pl;
	}

}
