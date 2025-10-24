package gui1024;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoveStringFrameByKey extends JFrame {
	private JLabel la = new JLabel("Love Java", SwingConstants.CENTER);
	public MoveStringFrameByKey() {
		setTitle("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la.setLayout(new BorderLayout());
		la.addKeyListener(new MyKeyListener());
		c.add(la, BorderLayout.CENTER);
		setSize(250,100);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				JLabel la = (JLabel)e.getSource();
				String text = la.getText();
				String front = text.substring(0,1);
				String last = text.substring(1);
				la.setText(last.concat(front));
			}
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
	public static void main(String[] args) {
		new MoveStringFrameByKey();
	}

}
