package prog09_04;

import java.awt.*;
import javax.swing.*;

public class TenColorButtonFrame extends JFrame{
	private Color [] color = {Color.RED,Color.orange, Color.YELLOW, Color.GREEN, Color.CYAN, Color.blue, Color.magenta, Color.gray, Color.pink, Color.LIGHT_GRAY};
	public TenColorButtonFrame() {
		super("배경색 10개");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		JButton [] btn = new JButton [10];
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(500,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TenColorButtonFrame ();
	}

}
