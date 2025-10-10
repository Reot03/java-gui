package ex10_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MykeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MykeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPassed"); // 콘솔창에 메소드 이름 출력
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased"); // 콘솔창에 메소드 이름 출력
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("Keytyped"); // 콘솔창에 메소드 이름 출력
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
