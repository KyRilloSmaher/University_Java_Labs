package QuestionOne;

import javax.swing.*;
import java.awt.*;

public class DifferentLayouts extends JFrame {
    public DifferentLayouts() {
        setTitle("Different Layouts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // First panel
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new FlowLayout());
        firstPanel.add(new JLabel("Welcome To MyBank"));
        mainPanel.add(firstPanel);

        // Second panel
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new FlowLayout());
        secondPanel.add(new JLabel("Enter your PIN:"));
        JTextField pinField = new JTextField(10);
        secondPanel.add(pinField);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            System.out.println("Pin entered: " + pinField.getText());
        });
        secondPanel.add(okButton);
        mainPanel.add(secondPanel);

        // Third panel
        JPanel thirdPanel = new JPanel();
        thirdPanel.setLayout(new GridLayout(4, 3, 5, 5)); 

        //  buttons
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.addActionListener(e -> {
                String pin = pinField.getText();
                pin += ((JButton) e.getSource()).getText();
                pinField.setText(pin);
            });
            thirdPanel.add(button);
        }

      
        JButton zeroButton = new JButton("0");
        zeroButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        zeroButton.addActionListener(e -> {
            String pin = pinField.getText();
            pin += "0";
            pinField.setText(pin);
        });
        thirdPanel.add(zeroButton);

        JButton backspaceButton = new JButton("Backspace");
        backspaceButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backspaceButton.addActionListener(e -> {
        });
        thirdPanel.add(backspaceButton);

        // Add empty cell for alignment
        thirdPanel.add(new JLabel());

        mainPanel.add(thirdPanel);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DifferentLayouts();
    }
}
