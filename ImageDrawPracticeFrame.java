package ex1205;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageDrawPracticeFrame extends JFrame {
	private MyPanel panel = new MyPanel();
    private JButton btn = new JButton("Hide/Show");
    
    public ImageDrawPracticeFrame () {
        setTitle("2022011984 전우진");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        Container c = getContentPane();
        setContentPane(panel);
        c.setLayout(new FlowLayout());
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                repaint();     
            }
        });
        setVisible(true);
    }

    class MyPanel extends JPanel {
    	private ImageIcon icon = new ImageIcon("C:/Users/CJU-310-2/Desktop/images/back.jpg");
		private Image img = icon.getImage();
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        }
    public static void main(String[] args) {
        new ImageDrawPracticeFrame();
    }
}
