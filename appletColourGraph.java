//Java applet program to implement colour and graphics class

import java.awt.*;
import java.applet.*;

/*<applet code = "appletColourGraph" width = "800" height = "800"></applet>*/

public class appletColourGraph extends Applet
{
	public void init()
	{
		Color c = new Color(220,250,160) ;
		setBackground(c) ;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.RED) ;
		g.setFont(new Font("Arial",2,50)) ;
		g.drawString("This is an example of Applet",100,400) ;
		g.drawRect(30,40,50,60) ;
		g.fillRect(100,40,70,50) ;
		g.drawOval(200,60,300,300) ;
		int a[] = {80,70,200,200,100,130} ;
		int b[] = {160,130,170,120,90,140} ;
		g.drawPolygon(a,b,6) ;
		g.drawArc(100,250,120,120,0,180) ;
	}
}
