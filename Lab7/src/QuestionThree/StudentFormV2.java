package QuestionThree;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentFormV2 extends JFrame {

    protected ArrayList<Student> students = new ArrayList<>();

    public StudentFormV2() {
        setTitle("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLUE);

        // Student input panel
        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(new GridLayout(5, 2, 30, 10));
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

        JButton searchButton = new JButton("Search Student");
        studentPanel.add(searchButton);

        JButton deleteButton = new JButton("Delete Student");
        studentPanel.add(deleteButton);

        mainPanel.add(studentPanel);

        // Panel for displaying student information
        JPanel showPanel = new JPanel();
        showPanel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(15, 60);
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
                students.add(new Student(name, age, new ArrayList<>(Arrays.asList(selectedCourses))));

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
                for (Student student : students) {
                    studentsInfo.append(student.toString());
                }
                textArea.setText(studentsInfo.toString());
            }
        });

        // ActionListener for the "Search Student" button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                boolean found = false;
                StringBuilder result = new StringBuilder();

                for (Student student : students) {
                    if (student.getName().equalsIgnoreCase(name)) {
                        result.append(student.toString());
                        found = true;
                    }
                }

                if (found) {
                    textArea.setText(result.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Student not found!", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // ActionListener for the "Delete Student" button
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));

                if (removed) {
                    JOptionPane.showMessageDialog(null, "Student deleted successfully!");
                    nameField.setText("");
                    ageField.setText("");
                    coursesDropdown.clearSelection();
                    textArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Student not found!", "Delete Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentFormV2();
    }
}
