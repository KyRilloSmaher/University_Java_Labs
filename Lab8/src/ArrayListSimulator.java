
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArrayListSimulator extends JFrame {
    private ArrayList<Integer> list = new ArrayList<>();
    private JTextField elementField;
    private JTextField positionField;
    private JTextArea messageArea;
    private JPanel visualPanel;

    public ArrayListSimulator() {
        setTitle("ArrayList Simulator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel for Input
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        elementField = new JTextField();
        positionField = new JTextField();
        inputPanel.add(new JLabel("Element:"));
        inputPanel.add(elementField);
        inputPanel.add(new JLabel("Position:"));
        inputPanel.add(positionField);

        add(inputPanel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton searchButton = new JButton("Search");
        JButton replaceButton = new JButton("Replace");
        JButton displayButton = new JButton("Display");

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(replaceButton);
        buttonPanel.add(displayButton);

        add(buttonPanel, BorderLayout.CENTER);

        // Message Area
        messageArea = new JTextArea(5, 20);
        messageArea.setEditable(false);
        add(new JScrollPane(messageArea), BorderLayout.SOUTH);

        // Visual Panel
        visualPanel = new JPanel();
        visualPanel.setPreferredSize(new Dimension(400, 50));
        add(visualPanel, BorderLayout.EAST);

        // Button Actions
        addButton.addActionListener(e -> addElement());
        deleteButton.addActionListener(e -> deleteElement());
        searchButton.addActionListener(e -> searchElement());
        replaceButton.addActionListener(e -> replaceElement());
        displayButton.addActionListener(e -> displayList());
    }

    private void addElement() {
        try {
            int element = Integer.parseInt(elementField.getText());
            String positionText = positionField.getText();

            if (positionText.isEmpty()) {
                list.add(element);
                messageArea.append("Added " + element + " to the end of the list.\n");
            } else {
                int position = Integer.parseInt(positionText);
                list.add(position, element);
                messageArea.append("Added " + element + " at position " + position + ".\n");
            }
            updateVisualPanel();
        } catch (Exception ex) {
            messageArea.append("Invalid input or position out of range.\n");
        }
    }

    private void deleteElement() {
        try {
            String elementText = elementField.getText();
            String positionText = positionField.getText();

            if (!positionText.isEmpty()) {
                int position = Integer.parseInt(positionText);
                int removed = list.remove(position);
                messageArea.append("Removed element " + removed + " at position " + position + ".\n");
            } else if (!elementText.isEmpty()) {
                int element = Integer.parseInt(elementText);
                if (list.remove((Integer) element)) {
                    messageArea.append("Removed element " + element + ".\n");
                } else {
                    messageArea.append("Element " + element + " not found.\n");
                }
            } else {
                messageArea.append("Please specify an element or position to delete.\n");
            }
            updateVisualPanel();
        } catch (Exception ex) {
            messageArea.append("Invalid input or position out of range.\n");
        }
    }

    private void searchElement() {
        try {
            int element = Integer.parseInt(elementField.getText());
            int index = list.indexOf(element);
            if (index != -1) {
                messageArea.append("Element " + element + " found at position " + index + ".\n");
            } else {
                messageArea.append("Element " + element + " not found.\n");
            }
        } catch (Exception ex) {
            messageArea.append("Invalid input.\n");
        }
    }

    private void replaceElement() {
        try {
            int element = Integer.parseInt(elementField.getText());
            int position = Integer.parseInt(positionField.getText());
            list.set(position, element);
            messageArea.append("Replaced element at position " + position + " with " + element + ".\n");
            updateVisualPanel();
        } catch (Exception ex) {
            messageArea.append("Invalid input or position out of range.\n");
        }
    }

    private void displayList() {
        messageArea.append("List elements: " + list.toString() + "\n");
    }

    private void updateVisualPanel() {
        visualPanel.removeAll();
        for (int element : list) {
            JLabel label = new JLabel(String.valueOf(element));
            label.setOpaque(true);
            label.setBackground(Color.MAGENTA);
            label.setForeground(Color.WHITE);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(30, 30));
            visualPanel.add(label);
        }
        visualPanel.revalidate();
        visualPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrayListSimulator frame = new ArrayListSimulator();
            frame.setVisible(true);
        });
    }
}
