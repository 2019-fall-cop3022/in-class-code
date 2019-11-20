import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VennComponent extends JComponent implements ChangeListener
{
	private int x_offset = 160;
	
	@Override
	protected void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Ellipse2D disk1 = new Ellipse2D.Double(10, 10, 200, 200);
		g2.setColor(new Color(255, 0, 0, 125));
		g2.fill(disk1);
		
		Ellipse2D disk2 = new Ellipse2D.Double(this.x_offset, 10, 200, 200);
		g2.setColor(new Color(0, 0, 255, 125));
		g2.fill(disk2);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(this.x_offset + 200 + 10, 220);
	}
	
	@Override
	public void stateChanged (ChangeEvent event)
	{
		JSlider wheel = (JSlider)event.getSource();
		x_offset = (Integer)wheel.getValue();
		this.repaint();
		this.revalidate();
	}
}
