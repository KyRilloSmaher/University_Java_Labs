package QuestionFour;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + "\n";
    }
}

public class StudentFormV3 extends JFrame {

    protected ArrayList<Student> students = new ArrayList<>();

    public StudentFormV3() {
        setTitle("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLUE);

        // Student input panel
        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(new GridLayout(3, 2, 30, 10));
        studentPanel.setBackground(Color.LIGHT_GRAY);

        JLabel nameLabel = new JLabel("Student Name:");
        studentPanel.add(nameLabel);
        JTextField nameField = new JTextField(10);
        studentPanel.add(nameField);

        JLabel ageLabel = new JLabel("Student Age:");
        studentPanel.add(ageLabel);
        JTextField ageField = new JTextField(10);
        studentPanel.add(ageField);

        JButton addButton = new JButton("ADD");
        studentPanel.add(addButton);

        mainPanel.add(studentPanel);

        // Sorting panel
        JPanel srt = new JPanel();
        srt.setLayout(new FlowLayout());
        JLabel sortLabel = new JLabel("Sort By:");
        srt.add(sortLabel);

        String[] sortOptions = { "Select Field", "Name", "Age" };
        JComboBox<String> srtop = new JComboBox<>(sortOptions);
        srt.add(srtop);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton asc = new JRadioButton("Ascending");
        JRadioButton des = new JRadioButton("Descending");
        bg.add(asc);
        bg.add(des);
        srt.add(asc);
        srt.add(des);

        JButton sortButton = new JButton("Sort");
        srt.add(sortButton);

        mainPanel.add(srt);

        // Panel for displaying student information
        JPanel showPanel = new JPanel();
        showPanel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(15, 60);
        textArea.setEditable(false);
        JScrollPane textScrollPane = new JScrollPane(textArea);
        showPanel.add(textScrollPane, BorderLayout.CENTER);

        mainPanel.add(showPanel);

        add(mainPanel);

        // ActionListener for "ADD" button
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

                students.add(new Student(name, age));
                JOptionPane.showMessageDialog(null, "Student Added Successfully!");
                nameField.setText("");
                ageField.setText("");
            }
        });

        // ActionListener for "Sort" List
        srtop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedField = (String) srtop.getSelectedItem();
                if (selectedField.equals("Select Field")) {
                    JOptionPane.showMessageDialog(null, "Please select a field to sort by!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean ascending = asc.isSelected();
                if (!asc.isSelected() && !des.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please select a sort order!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (selectedField.equals("Name")) {
                    students.sort(Comparator.comparing(Student::getName));
                } else if (selectedField.equals("Age")) {
                    students.sort(Comparator.comparingInt(Student::getAge));
                }

                if (!ascending) {
                    students.sort(Comparator.comparing(Student::getName).reversed());
                }

                // Display sorted students
                StringBuilder sortedStudents = new StringBuilder();
                for (Student student : students) {
                    sortedStudents.append(student.toString());
                }
                textArea.setText(sortedStudents.toString());
            }
        });
  // ActionListener for "Sort" Button
        sortButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedField = (String) srtop.getSelectedItem();
        if (selectedField.equals("Select Field")) {
            JOptionPane.showMessageDialog(null, "Please select a field to sort by!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean ascending = asc.isSelected();
        if (!asc.isSelected() && !des.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select a sort order!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedField.equals("Name")) {
            students.sort(Comparator.comparing(Student::getName));
        } else if (selectedField.equals("Age")) {
            students.sort(Comparator.comparingInt(Student::getAge));
        }

        if (!ascending) {
            students.sort(Comparator.comparing(Student::getName).reversed());
        }

        // Display sorted students
        StringBuilder sortedStudents = new StringBuilder();
        for (Student student : students) {
            sortedStudents.append(student.toString());
        }
        textArea.setText(sortedStudents.toString());
    }
});
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentFormV3();
    }
}
