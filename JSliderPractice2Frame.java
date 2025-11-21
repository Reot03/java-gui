package ex11_12;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSliderPractice2Frame extends JFrame {
	private JLabel colorLabel;
	private JLabel label;
	private JSlider [] sl = new JSlider[4];
	public JSliderPractice2Frame() {
		setTitle("2022011984 전우진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel north = new JPanel(new GridLayout(3, 1));
		c.add(north);
		
		label = new JLabel("Love Java", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,1,200,100);
		for(int i=0; i<sl.length; i++) {
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(20);
			sl[i].setMinorTickSpacing(5);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
			
			
			JLabel la = new JLabel(Integer.toString(slider.getValue()));
			c.add(la);
			
			slider.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					la.setText(Integer.toString(slider.getValue()));
					}
				});
		}
		sl[0].setForeground(Color.red);
		sl[2].setForeground(Color.green);
		sl[3].setForeground(Color.blue);
		sl[4].setForeground(Color.black);
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		int n = sl[3].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b,n));
		c.add(colorLabel);
		setSize(400,400);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			int n = sl[3].getValue();
			colorLabel.setBackground(new Color(r,g,b,n));
		}
	}
	public static void main(String [] args) {
		new JSliderPractice2Frame();
	}
}

