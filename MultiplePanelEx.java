package ex09_07;

import java.awt.*;
import javax.swing.*;

public class MultiplePanelEx extends JFrame {
	public MultiplePanelEx() {
		super("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	
	class CenterPanel extends JPanel {
		private JLabel [] labels = {new JLabel("Hello"), new JLabel("Java"), new JLabel("Love"), new JLabel("전우진")};
		public CenterPanel() {
			setLayout(null);
			for(int i = 0; i<labels.length; i++) {
				int x = (int)(Math.random()*200);
				int y = (int)(Math.random()*200);
				labels[i].setLocation(x,y);
				labels[i].setSize(100,20);
				add(labels[i]);
				setBackground(Color.ORANGE);
			}
		}
	}
	public static void main(String[] args) {
		new MultiplePanelEx();
		// TODO Auto-generated method stub

	}

}