package ex10_07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("2022011984-전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "키가 입력되었음");
			
			if(e.getKeyCode() == KeyEvent.VK_F1 && e.getKeyCode() == KeyEvent.VK_F11)
				contentPane.setBackground(Color.GREEN);
			else if(e.getKeyChar() >= KeyEvent.VK_0 && e.getKeyChar() <= KeyEvent.VK_9)
				contentPane.setBackground(Color.red);
			else if(e.getKeyChar() == KeyEvent.VK_A && e.getKeyChar() == KeyEvent.VK_Z)
				contentPane.setBackground(Color.yellow);
			
	
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
