//Mouse Event

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerDemo extends Applet implements MouseListener{
	Label l;
	public void init(){
		l=new Label("Mouse Listener demo");
		l.setFont(new Font("",30,25));
		add(l);
		addMouseListener(this);

	}
	public void mouseClicked(MouseEvent e){
		l.setText("You clicked mouse button");
	}
	public void mousePressed(MouseEvent e){
		l.setText("Mouse pressed");
	}
	public void mouseReleased(MouseEvent e){
		l.setText("Mouse released");
	}
	public void mouseEntered(MouseEvent e){
		l.setText("Mouse cursor has entered");
	}
	public void mouseExited(MouseEvent e){
		l.setText("Mouse cursor has exited");
	}
}
//<applet code="MouseListenerDemo"width="1200"height="800"></applet>