package package1;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;

public class draw extends JPanel{
	
	public void drawing()
	{
		repaint();
		
	}
	public void paintComponent(Graphics g ){
		//super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);
		//g2.setColor(Color.RED);
		g.fillRect(100,250,100,20);
		//g2.draw(planet);
		g2.setColor(Color.BLUE);
		g2.fillRect(100, 80, 100, 20);
		g2.fillOval(100, 200, 10, 20);
		
		
	}
}
