package ex1128;

import java.awt.*;
import javax.swing.*;

public class Grid extends JFrame {
    private MyPanel panel = new MyPanel();

    public Grid() {
        setTitle("전우진");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(350, 350);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int x = 20;
            int y = 20;
            int max = 300;
            int gap = max / 10;

            // 세로선
            for(int i = 0; i <= 10; i++) {
                g.drawLine(x + gap * i, y, x + gap * i, y + max);
            }

            // 가로선
            for(int i = 0; i <= 10; i++) {
                g.drawLine(x, y + gap * i, x + max, y + gap * i);
            }
        }
    }

    public static void main(String[] args) {
        new Grid();
    }
}
			
			for(int i=0; i<=10; i++) {
				g.drawLine(x+gap*i, y,x+gap*i, y);
			}
			for(int i=0; i<=10; i++) {
				g.drawLine(x, y+gap*i, x, y+gap*i);
			}
		}
	}
	public static void main(String [] args) {
		new Grid();
	}
}
