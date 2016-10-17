package package1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class IconTester {
	/**
	 * 
	 * @param i is the counter for the buttons
	 * @param j is the label that holds icon object
	 * @param icon is the object that is repainted
	 * @return the button object that has actionListener attached to it
	 * @precondition button array must be of size 3
	 * @postcondition 3 buttons are added to the panel
	 */
	public static JButton createButton(int i, JLabel j, MarsIcon icon)
	{
		String[] colors = new String[]{"RED", "GREEN", "BLUE"};  //string for colors
		
		JButton b = new JButton(colors[i]); //initializing buttons with color as label
		
		b.addActionListener(new ActionListener(){ //anonymous class
			
			public void actionPerformed(ActionEvent e)
			{
				icon.fillPaint(colors[i]);  //selects the paint to be repainted
				j.repaint();   //repaints
			}
		});
		
		return b;  //button is returned
	}

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Test"); //Main frame
		JPanel panel = new JPanel(); //first panel
		frame.setLayout(new FlowLayout());
		
		MarsIcon icon = new MarsIcon(50); //declare marsIcon obj to draw the initial red circle 
		JLabel newLable = new JLabel(icon); //add icon to label so it can be added to panel
		panel.add(newLable); //add the label to panel
		frame.add(panel); //add panel to main frame
		
		JButton green= null, blue= null, red = null; //declare buttons
		JButton buton[]= {green, blue, red};   //add buttons to button list
		
			for (int i=0; i<3; i++) 
			{
				buton[i] = createButton(i, newLable,icon);  //pass 1 button at a time to be added with actionListener
			    panel.add(buton[i]);  // addding the returned button to the panel
			}
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
