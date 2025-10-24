package gui1024;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseDraggingFrame extends JFrame {
	private Container c;
	public MouseDraggingFrame() {
		setTitle("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.addMouseMotionListener(new MyMouseDragging());
		c.addMouseListener(new MyMouseListener());
		setSize(250,150);
		setVisible(true);
		}
	class MyMouseDragging implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.yellow);
		}
	}
	class MyMouseListener implements MouseListener {
		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.green);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseDraggingFrame();
	}
}
