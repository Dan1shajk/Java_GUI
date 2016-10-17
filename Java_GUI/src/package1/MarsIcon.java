package package1;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

public class MarsIcon implements Icon {
	/**
	 * 
	 * @param aSize is the initial size for the cirlce
	 */
	MarsIcon(int aSize)
	{
		size = aSize;
		color= color.red;
	}

	public int getIconHeight() {
		return size;
	}

	public int getIconWidth() {
		return size;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);
		g2.setColor(color);
		g2.fill(planet);
	}
	/**
	 * 
	 * @param c is the color that is being passed
	 * @precondition size of color must be >= size of button array
	 * @postcondition all the colors are applied to each of the buttons
	 */
	public void fillPaint(String c)
	{
		if (c == "RED")
		{
			color = Color.red;
		}
		else if (c== "GREEN")
		{
			color = Color.green;
		}
		else if (c== "BLUE")
		{
			color = Color.blue;
		}
	}
	private int size;
	private Color color;
}
