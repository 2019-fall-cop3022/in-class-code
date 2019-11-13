import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class VennComponent extends JComponent
{
	@Override
	protected void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Ellipse2D disk1 = new Ellipse2D.Double(10, 10, 200, 200);
		g2.setColor(new Color(255, 0, 0, 125));
		g2.fill(disk1);
		
		Ellipse2D disk2 = new Ellipse2D.Double(160, 10, 200, 200);
		g2.setColor(new Color(0, 0, 255, 125));
		g2.fill(disk2);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(370, 220);
	}
}
