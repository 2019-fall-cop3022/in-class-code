import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
		
		this.add(new JButton("Hey-o"), BorderLayout.SOUTH);
		
		VennComponent venn = new VennComponent();
		this.add(venn);
		
		this.pack();
	}
	
	public static void main (String[] args)
	{
		VennDiagramViewer venn = new VennDiagramViewer();
		venn.setVisible(true);
	}
}
