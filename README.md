# java-gui
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Plate4x4Frame extends JFrame {
    public Plate4x4Frame() {
        setTitle("4x4 Color Grid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 전체 레이아웃을 BorderLayout으로 설정
        setLayout(new BorderLayout());

        // ====== 위쪽 4x4 색상 패널 ======
        JPanel gridPanel = new JPanel(new GridLayout(4, 4));
        Color[] colors = {
                Color.WHITE, Color.GRAY, Color.RED, Color.ORANGE,
                Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
                Color.PINK, Color.MAGENTA, Color.LIGHT_GRAY, Color.DARK_GRAY,
                Color.BLACK, Color.YELLOW, Color.GREEN, Color.RED
        };

        for (int i = 0; i < 16; i++) {
            JLabel label = new JLabel(String.valueOf(i+1), SwingConstants.CENTER);
            label.setOpaque(true);
            label.setBackground(colors[i]);
            gridPanel.add(label);
        }

        // ====== 아래쪽 입력 + 버튼 패널 ======
        JPanel bottomPanel = new JPanel(); // FlowLayout 기본
        JTextField textField = new JTextField(10); // 텍스트 입력창
        JButton checkButton = new JButton("색상확인"); // 버튼

        // 버튼 클릭 이벤트
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText(); // 입력값 읽기
                JOptionPane.showMessageDialog(null, "입력한 색상: " + input);
            }
        });

        bottomPanel.add(textField);
        bottomPanel.add(checkButton);

        // ====== 프레임에 추가 ======
        add(gridPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setSize(500, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Plate4x4Frame();
    }
}