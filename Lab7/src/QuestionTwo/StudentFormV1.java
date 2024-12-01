package QuestionTwo;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentFormV1 extends JFrame {

    protected ArrayList<String> studentName = new ArrayList<>();
    protected ArrayList<Integer> studentAge = new ArrayList<>();
    protected ArrayList<String[]> studentCourses = new ArrayList<>();

    public StudentFormV1() {
        setTitle("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLUE);

        // Student input panel
        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(new GridLayout(4, 2, 30, 10));
        studentPanel.setBackground(Color.LIGHT_GRAY);

        JLabel nameLabel = new JLabel("Student Name:");
        studentPanel.add(nameLabel);
        JTextField nameField = new JTextField(10);
        studentPanel.add(nameField);

        JLabel ageLabel = new JLabel("Student Age:");
        studentPanel.add(ageLabel);
        JTextField ageField = new JTextField(10);
        studentPanel.add(ageField);

        JLabel courseLabel = new JLabel("Student Courses:");
        studentPanel.add(courseLabel);
        String[] coursesArray = { "COMP301", "COMP302", "COMP303", "COMP304", "COMP305", "COMP306" };
        JList<String> coursesDropdown = new JList<>(coursesArray);
        coursesDropdown.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(coursesDropdown);
        studentPanel.add(scrollPane);

        JButton addButton = new JButton("Add Student");
        studentPanel.add(addButton);

        JButton displayButton = new JButton("Display Students");
        studentPanel.add(displayButton);

        mainPanel.add(studentPanel);

        // Panel for displaying student information
        JPanel showPanel = new JPanel();
        showPanel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        JScrollPane textScrollPane = new JScrollPane(textArea);
        showPanel.add(textScrollPane, BorderLayout.CENTER);

        mainPanel.add(showPanel);
        add(mainPanel);

        // ActionListener for the "Add Student" button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age;
                try {
                    age = Integer.parseInt(ageField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid age!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String[] selectedCourses = coursesDropdown.getSelectedValuesList().toArray(new String[0]);

                // Store student information
                studentName.add(name);
                studentAge.add(age);
                studentCourses.add(selectedCourses);

                JOptionPane.showMessageDialog(null, "Student Added Successfully!");
                nameField.setText("");
                ageField.setText("");
                coursesDropdown.clearSelection();
            }
        });

        // ActionListener for the "Display Students" button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder studentsInfo = new StringBuilder();
                for (int i = 0; i < studentName.size(); i++) {
                    studentsInfo.append("Name: ").append(studentName.get(i)).append("\n");
                    studentsInfo.append("Age: ").append(studentAge.get(i)).append("\n");
                    studentsInfo.append("Courses: ").append(String.join(", ", studentCourses.get(i))).append("\n");
                    studentsInfo.append("------\n");
                }
                textArea.setText(studentsInfo.toString());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentFormV1();
    }
}
