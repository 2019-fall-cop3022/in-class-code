import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VennDiagramViewer extends JFrame
{
	public VennDiagramViewer()
	{
		super();
		// this.setSize(500, 300);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField("Intersection of two disks");
		text.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(text, BorderLayout.NORTH);
		
		VennComponent venn = new VennComponent();
		this.add(venn);
		
		//SpinnerNumberModel wheel = new SpinnerNumberModel(160, 10, 200, 10);
		//wheel.addChangeListener(venn);
		
		//this.add(new JSpinner(wheel), BorderLayout.SOUTH);
		JSlider wheel = new JSlider(10, 200, 160);
		wheel.addChangeListener(venn);
		wheel.addChangeListener(new ResizeListener());

		this.add(wheel, BorderLayout.SOUTH);
		
		this.pack();
	}
	
	public static void main (String[] args)
	{
		VennDiagramViewer venn = new VennDiagramViewer();
		venn.setVisible(true);
	}
	
	private class ResizeListener implements ChangeListener
	{
		@Override
		public void stateChanged (ChangeEvent event)
		{
			
			VennDiagramViewer.this.pack();
		}
	}
}
