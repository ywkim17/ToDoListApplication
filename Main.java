import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        
        // Create "Add New Task" button
        JButton newTask = new JButton("Add New Task");
        newTask.setPreferredSize(new Dimension(100, 100));
        frame.getContentPane().add(newTask);

        // Create "To Do List" label
        JLabel toDoList = new JLabel("To Do List", SwingConstants.TOP);
        toDoList.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(toDoList);

        // "Add New Task" button function
        newTask.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        // Show the frame and frezze size
        frame.setResizable(false);
        frame.setVisible(true);
    }
}