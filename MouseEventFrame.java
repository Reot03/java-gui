package gui1024;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	private JLabel la = new JLabel("사랑해 자바");
	public MouseEventFrame () {
		setTitle("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		la.addMouseListener(new MyMouseListener());
		c.add(la, BorderLayout.CENTER);
		
		setSize(250,150);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			la.setText("사랑해 자바");
		}
		public void mouseExited(MouseEvent e) {
			la.setText("Love Java");
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseEventFrame();
	}

}
