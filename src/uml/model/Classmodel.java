package uml.model;

import java.awt.Dimension;
import java.awt.Point;

import figure.model.Figuremodel;

public class Classmodel extends Figuremodel {
	//Ikke ferdig, holder på å følge malen for Actormodel
	
	public Classmodel (int x, int y){
		figureName = "Class";
		start = new Point(x, y);
		reference = new Point(500, 180);
		Point UpperLeftCorner = new Point(0,0);
		virtual = new Dimension(100, 200);
	}

	@Override
	protected Figuremodel instance(int x, int y) {
		return new Classmodel(x, y);
	}

}