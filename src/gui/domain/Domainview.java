package gui.domain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import svg.Svg;
import uml.graphics.Thing;
import uml.model.Actormodel;
import uml.model.Business;
import uml.model.Classmodel;
import uml.model.Componentmodel;
import uml.model.Nodemodel;
import uml.model.Packagemodel;
import uml.model.Usecasemodel;
import figure.graphics.Figure;
import figure.model.IFigure;

public class Domainview extends JPanel implements IFigure {

	private Diagram diagram = new Diagram("Brukstilfeller og aktører");
	private Shadow sh = new Shadow();

	public Domainview() {
		setLayout(new BorderLayout());
		add(diagram);
		add(sh, BorderLayout.SOUTH);
		diagram.addFigure(new Actormodel(0, 0));
		diagram.addFigure(new Usecasemodel(0, 50));
		diagram.addFigure(new Business(0, 100));
		diagram.addFigure(new Classmodel(0, 150));
		diagram.addFigure(new Packagemodel(0, 200));
		diagram.addFigure(new Componentmodel(0, 250));
		diagram.addFigure(new Nodemodel(0,300));
		setShadow(Shadows.LOW.f());
		setBackground(Color.WHITE);
	}
	
	private Figure figureSource(ActionEvent e) {
		Component c = (Component) e.getSource();
		JComponent jc = (JComponent) c.getParent();
		return (Figure) ((JPopupMenu) jc).getInvoker();
	}
	
	public void insertFigure(ActionEvent e) {
		diagram.addFigure(figureSource(e).newInstance());
		repaint();
	}

	public void connect(ActionEvent object) {
		diagram.connect((Thing) figureSource(object));
		repaint();
	}

	public void setShadow(float d) {
		diagram.setShadow(d);
	}

	public void deleteFigure(ActionEvent e) {
		diagram.deleteFigure(figureSource(e));
	}

	public void shadow(ActionEvent e) {
		sh.setVisible(((AbstractButton)e.getSource()).isSelected());		
	}

	public void storesvg() {
		new Svg().store(diagram);
	}
	
	public void edtext(ActionEvent e) {
		diagram.edtext((Thing) figureSource(e));
	}

	public void finishConnection(Object e) {
		diagram.finishConnection((Thing) e);
	}

}
