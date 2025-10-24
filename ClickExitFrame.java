package gui1024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickExitFrame extends JFrame {
	private JButton btn = new JButton("종료");
	public ClickExitFrame() {
		setTitle("2022011984 - 전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		btn.setSize(60,30);
		btn.setLocation(100,50);
		c.add(btn);
		c.setBackground(Color.blue);
		btn.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new ClickExitFrame();
	}
}