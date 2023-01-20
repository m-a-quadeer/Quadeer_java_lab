//Java applet program to implement Adapter classes

import java.applet.Applet ;
import java.awt.* ;
import java.awt.event.* ;

public class AdapterClass extends Applet
{
	Label l ;
	
	public void init()
	{
		l = new Label ("Mouse Listener Demo") ;
		l.setFont(new Font("",1,30)) ;
		add(l) ;
	
		addMouseListener(new MouseAdapter()  
		{
			public void mouseClicked(MouseEvent e)
			{
				l.setText("You clicked mouse") ;
			}
			public void mouseReleased(MouseEvent e)
			{
				l.setText("Mouse released") ;
			}
		});
	}
}

//<applet code = "AdapterClass" width = "500" height = "500"></applet>
