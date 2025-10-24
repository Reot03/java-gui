package gui1024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickPracticeFrame extends JFrame {
	private JLabel la = new JLabel("C");
	public ClickPracticeFrame() {
		setTitle("2022011984 - 전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		la.setSize(15,15);
		la.setLocation(100,100);
		c.add(la);
		la.addMouseListener(new MyMouseListener());
		
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			int x = (int)(Math.random() * 200);
			int y = (int)(Math.random() * 100);
			la.setLocation(x,y);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}
}
