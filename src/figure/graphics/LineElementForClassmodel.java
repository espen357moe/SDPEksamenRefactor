package figure.graphics;

import java.awt.Point;

public class LineElementForClassmodel extends LineElement {

	public LineElementForClassmodel(Point a, Point b, Hold c) {
		super(a, b, c);		
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;
		
	}				
}
