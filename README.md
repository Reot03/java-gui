import javax.swing.*;
import java.awt.*;

public class Plate4x4Frame extends JFrame {
    private Color[] colors = {
        Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
        Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
        Color.PINK, Color.LIGHT_GRAY, Color.RED, Color.ORANGE,
        Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE
    };

    public Plate4x4Frame() {
        super("2022011860-김규원");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new Plate(colors), BorderLayout.CENTER);
        add(new PlateButton(), BorderLayout.SOUTH);

        setSize(500, 300);
        setVisible(true);
    }

    class Plate extends JPanel {
        public Plate(Color[] colors) {
            setLayout(new GridLayout(4, 4));
            for (int i = 0; i < 16; i++) {
                JLabel label = new JLabel(Integer.toString(i), SwingConstants.CENTER);
                label.setOpaque(true);
                label.setBackground(colors[i]);
                add(label);
            }
        }
    }

    class PlateButton extends JPanel {
        public PlateButton() {
            add(new JButton("색상확인"));
            add(new JTextField(10));
        }
    }

    public static void main(String[] args) {
        new Plate4x4Frame();
    }
}