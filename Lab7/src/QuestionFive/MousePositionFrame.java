package QuestionFive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePositionFrame extends JFrame {
    private JLabel screenPositionLabel, windowPositionLabel;

    public MousePositionFrame() {
        setTitle("Mouse Position Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        screenPositionLabel = new JLabel("Screen Position: ");
        windowPositionLabel = new JLabel("Window Position: ");

        add(screenPositionLabel);
        add(windowPositionLabel);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Not needed for this example
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int screenX = e.getXOnScreen();
                int screenY = e.getYOnScreen();
                int windowX = e.getX();
                int windowY = e.getY();

                screenPositionLabel.setText("Screen Position: (" + screenX + ", " + screenY + ")");
                windowPositionLabel.setText("Window Position: (" + windowX + ", " + windowY + ")");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MousePositionFrame();
    }
}