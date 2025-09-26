package prog09_10;

import java.awt.*;
import javax.swing.*;

public class WestButtonsFrame extends JFrame {
	public WestButtonsFrame() {
		super("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel west = new JPanel();
		west.setLayout(new GridLayout(10,1));
		Color [] color = {Color.RED, Color.gray, Color.blue, Color.yellow, Color.cyan, Color.DARK_GRAY, Color.magenta, Color.green, Color.yellow, Color.black};
		for(int i=0; i<10; i++) {
			JLabel label = new JLabel();
			label.setOpaque(true);
			label.setBackground(color[i]);
			west.add(label);
			c.add(west, BorderLayout.WEST);
		}
		
		JPanel center = new JPanel(null);
		center.setBackground(Color.white);
		for(int i=0; i<10; i++) {
			JLabel val = new JLabel("0,1,2,3,4,5,6,7,8,9");
			val.setSize(getPreferredSize());
			int x = (int)(Math.random()*150);
			int y = (int)(Math.random()*150);
			val.setLocation(x,y);
			val.setForeground(Color.RED);
			center.add(val);
		}
		c.add(center, BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WestButtonsFrame();
	}

}
