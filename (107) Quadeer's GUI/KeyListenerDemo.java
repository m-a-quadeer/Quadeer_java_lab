//Key Event

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends Applet implements KeyListener{
	Label l ;
	TextField tf ;

	public void init(){
		l = new Label ("Key Listener Demo");
		tf = new TextField (20) ;
		add(l) ;
		add(tf) ;
		tf.addKeyListener(this) ;
	}
	
	public void keyTyped (KeyEvent e){
		l.setText("Key typed : "+e.getKeyChar()) ;
		l.setFont(new Font("",2,20)) ;
		l.setForeground(Color.blue) ;
	}
	public void keyPressed(KeyEvent e)
	{}
	public void keyReleased(KeyEvent e){
		l.setForeground(Color.red) ;
	}
}

/*<applet code = "KeyListenerDemo" width = "800" height = "800"></applet>*/