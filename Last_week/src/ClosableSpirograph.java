import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClosableSpirograph extends JFrame implements ActionListener
{
	private static final int ROTATION_DEGREES = 5;
	private JPanel box;

	public static void main (String[] args)
	{
		ClosableSpirograph wheee = new ClosableSpirograph();
		wheee.setVisible(true);
	}

	public ClosableSpirograph ()
	{
		super("Ka-blow");

		this.box = new JPanel();
		this.add(this.box);

		JButton go = new JButton("Begin");
		go.addActionListener(this);
		this.add(go, BorderLayout.SOUTH);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		Foo f = new Foo();
		f.start();
	}

	public class Foo extends Thread
	{
		public void run ()
		{
			Graphics2D g2 = (Graphics2D)ClosableSpirograph.this.getGraphics();
			g2.setColor(new Color(100, 0, 0));
	
			for (int i = 0; i < (360 / ROTATION_DEGREES); ++i)
			{
				g2.drawOval(50, 180, 300, 40);
				g2.rotate(Math.toRadians(ROTATION_DEGREES), 200, 200);
				try
				{
					Thread.sleep(300);
				}
				catch (InterruptedException e) {}
			}
	
		}
	}
}